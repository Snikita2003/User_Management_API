 User Management API :


Introduction
This is a RESTful API for managing users, built using Java Spring Boot Framework , MYSQL ( DATABASE )


API Endpoints :

------ CRUD Operaions ----

1.  Create New User

   Request Body - 
   method - post 
   http://localhost:8080/users

   {  <br>
    "firstName":"Abhijeet", <br>
    "lastName":"Debadwar", <br>
    "email":"abhijeet@gmail.com", <br>
    "password":"abhi1234"
   }

   ----> Response Body  <br>
   { <br>
    "code": 200,  <br>
    "message": "success",  <br>
    "user": {  <br>
        "userId": 1,  <br>
        "firstName": "Abhijeet",  <br>
        "lastName": "Debadwar", <br>
        "email": "abhijeet@gmail.com", <br>
        "password": "abhi1234" <br>
    }
}

------------------------------------------------------------------
 
2.   get User by Email and Password
     Request body -
     
     method - post 
     http://localhost:8080/users/get  <br>

     { <br>
           "email":"abhijeet@gmail.com", <br>
           "password":"abhi1234" <br>
     }

   
     ------> Response Body
     { <br>
           "code": 200, <br>
           "message": "success",  <br>
           "user": { <br>
               "userId": 1, <br>
               "firstName": "Abhijeet", <br>
               "lastName": "Debadwar", <br>  
               "email": "abhijeet@gmail.com", <br>
               "password": "abhi1234" <br>
    }
  }



---------------------------------------------------
     
 3.   put / user  -> update by Email id
 <br>
http://localhost:8080/users
Method- put
 <br>

----> Request Body
{        <br>
        "firstName":"Harry", <br>
        "lastName":"potter", <br>
        "email":"abhijeet@gmail.com", <br>
        "password":"abhi1234" <br>
}

------> Response Body
 <br>
{     <br>
    "code": 200,  <br>
    "message": "updated", <br>
    "user": { <br>
        "userId": 2, <br>
        "firstName": "Harry", <br>
        "lastName": "potter", <br>
        "email": "abhijeet@gmail.com", <br>
        "password": "abhi1234" <br>
    }
}

------------------------------------------------------

4 .  Delete  User by EmailId

http://localhost:8080/users?email=abhijeet@gmail.com&pass= abhi1234 <br>
 
Method- DELETE

Response Body-
  
  {    <br>
      "code": 200, <br>
      "message": "User deleted", <br>
      "user": { <br>
          "userId": 1, <br>
          "firstName": "Abhijeet", <br>
          "lastName": "Debadwar", <br>
          "email": "abhijeet@gmail.com", <br>
          "password": "abhi1234" <br>
      }
}


--- http://localhost:8080/users?email=abhijeet@gmail.com&pass=abhi1234 <br>
Respose Body  <br>

{
    "code": 404, <br>
    "message": "User not present", <br>
    "user": null <br>
}
    


-------------------------------------------------------------------------------


---------------------ADDITIONAL API'S------------------------

1  getUserById   --  get User from Database given userId <br>
2   getAllUsers  --    get All the users from Table <br>
3   createMultipleUsers()  --  create Multiple new users like List in table at a time <br>
4   changePassword() --  Change old password to newPassword by Given Email id <br>
5   check password Expiry <br>
6  get All current Active users <br>



---------------Implemeted Api's--------------- <br>

1  getUserById   --  get User from Database given userId <br>
2   getAllUsers  --    get All the users from Table <br>
3   createMultipleUsers()  --  create Multiple new users like List in table at a time <br>
4   changePassword() --  Change old password to newPassword by Given Email id <br>



