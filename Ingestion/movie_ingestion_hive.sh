#!/bin/bash

#cleanup directory if already exist in target 

#||: ensures we are carry on the script even 

hdfs dfs -rm -r /metadata/movielens/movie/movie.avsc || :

# extract avro schema from avro  file 
hadoop jar /home/hduser/avro-1.8.2/avro-tools-1.8.2.jar getschema hdfs://localhost:9000/data/movielens/movie/part-m-00000.avro | hdfs dfs -put - hdfs://localhost:9000/metadata/movielens/movie/movie.avsc


#create hive table from avro file 

hive -e "CREATE EXTERNAL TABLE IF NOT EXISTS movie 
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe' 
STORED AS  INPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat' 
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerOutputFormat' 
LOCATION '/data/movielens/movie' 
TBLPROPERTIES ('avro.schema.url' = '/metadata/movielens/movie/movie.avsc')"
