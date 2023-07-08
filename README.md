# person-information-api

## This API endpoint provides access to the Personal Information and also save the new person information in Database.

1) GET : /persons/v1/all/
    It retrive the all personal information 

2) GET : /persons/v1/all/{gender}
       It retrive the all personal information based on Gender

3) POST : /persons/v1/save
   It tooks the person information in JSON payload and save in the database
   e.g. {
    "userName": "John",
    "age": 7,
    "gender": "M",
    "email": "test@gmail.com"
}

## To run api using command line
java -jar person-information-api-0.0.1-SNAPSHOT.jar


## To monitor the API health below schedule entry will check at every 5 minutes interval and capture in text file
*/5 * * * * /Users/kumara13/Documents/personal/monitor_app_status.sh >> status.txt
