from starbase import Connection

#creating connection to HBase Thrift Server
conn = Connection("127.0.0.1","8000")

#creating table 
ratings = conn.table("ratings")

#check if table exists already then drop it 
if (ratings.exists()):
    print("Dropping existing table: rating\n")
    rating.drop()

#creating column family
ratings.create('rating')

#reading dataset u.data about user ratings
print("Parsing the ml-100k ratings data: \n")
ratingFile =  open("Downloads/ml-100k/u.data", "r")

#create batch for loading data in batch rather than doing one at a time.
batch = ratings.batch()

for line in ratingFile:
    (userID,movieID,rating,timestamp) = line.split()
    batch.update(userID, {'rating':{movieID:rating}})

ratingFile.close()

print("Committing ratings data to HBase via Thrift Service \n")
batch.commit(finalize=True)

print("Get back rating for some users: \n")
print("Ratings for user ID : 1 \n")
print(ratings.fetch("1"))
print("Ratings for userID : 33 \n")
print(ratings.fetch("33"))







