this is spring boot backend assigment for Traini8.
I used mysql for database.
Using this application you can add and get all list of centers.
Create Traini8 database in ur mysql workbench
For add new training center 
use "localhost:8080/add" url on postman
use following variables
"centerName":(must be less than 40 chars)
"centerCode":(must be 12char alphanumeric)
"address":{
    "street", "city", "state", "pinCode"}
"capacity":
"coursesOffrered":(list)
"contactEmail":(use email format)
"contactNumber":(must be 10 digit)
}

for list of all centers use following url
"localhost:8080/get"
