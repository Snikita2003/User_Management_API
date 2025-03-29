 User Management API :


Introduction
This is a RESTful API for managing users, built using Java Spring Boot Framework , MYSQL ( DATABASE )


API Endpoints :

------ CRUD Operaions ----
1.  Create New User

   Request Body - 
   method - post 
   http://localhost:8080/users

   {
    "firstName":"Abhijeet",
    "lastName":"Debadwar",
    "email":"abhijeet@gmail.com",
    "password":"abhi1234"
   }

   ----> Response Body 
   {
    "code": 200,
    "message": "success",
    "user": {
        "userId": 1,
        "firstName": "Abhijeet",
        "lastName": "Debadwar",
        "email": "abhijeet@gmail.com",
        "password": "abhi1234"
    }
}

2.   
 
