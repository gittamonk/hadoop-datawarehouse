from pyspark.sql import SparkSession, Row
from pyspark import SparkContext


#parse input rdd line into mapped Row object
def parseLine(line):
    field = line.split('|')
    return Row(userID = int(field[0]),age = int(field[1]),
               gender = field[2], occupation = field[3],Zip = field[4])

if __name__ = "__main__":
    spark = SparkSession.builder.appName("SparkCassandraIntegration").getOrCreate()

usersRdd = spark.sparkContext.textFile("/user/hduser/ml-100k/u.user")

#inferschema to rdd
usersMapped = usersRdd.map(parseLine)

#create dataframe out of rdd
usersDf = spark.createDataFrame(usersMapped)

#save the dataframe to cassandra keyspace : movielens and table user
#using class "org.apache.spark.sql.cassandra"

usersDf.write.format("org.apache.spark.sql.cassandra").mode("append").options(keyspace="movielens", table='user').save()

#read from cassandra
readDf = spark.read.format("org.apache.spark.sql.cassandra").options(keyspace="movielens", table='user').load()

readDf.createOrReplaceTempView("user")

sqlDf = spark.sql("select * from user where age < 20")

sqlDf.show()













