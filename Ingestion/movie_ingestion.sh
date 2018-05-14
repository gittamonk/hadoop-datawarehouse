#!/bin/bash


hdfs dfs -rm -r /data/movielens/movie || : 
sqoop import -Dmapreduce.job.user.classpath.first=true -Dhadoop.security.credential.provider.path=jceks://x.jceks  --connect jdbc:mysql://localhost:3306/movielens --username hduser --password hduser --query 'SELECT   movie_id ,movie_title ,release_date ,video_release_date , IMDb_URL,  group_concat(unknown ,",",Action,"," ,Adventure,"," ,Animation ,"," ,Children_s,","  ,Comedy ,"," ,Crime,","  ,Documentary,","  ,Drama ,"," ,Fantasy,","  ,Film_Noir,","  ,Horror,","  ,Musical ,"," ,Mystery,","  ,Romance,","
,Sci_Fi ,"," ,Thriller ,"," ,War,","  ,Western) as group_name  FROM movie  where $CONDITIONS group by movie_id' --split-by movie_id --as-avrodatafile --target-dir /data/movielens/movie
 
