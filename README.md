 User Management API :


Introduction
This is a RESTful API for managing users, built using Java Spring Boot Framework , MYSQL ( DATABASE )


API Endpoints :

------ CRUD Operaions ----

1.  Create New User

   Request Body - 
   method - post 
   http://localhost:8080/users

  <pre>
       {  
             "firstName":"Abhijeet", 
            "lastName":"Debadwar", 
            "email":"abhijeet@gmail.com", 
            "password":"abhi1234"
      }
  </pre>

   ----> Response Body  <br>
  <pre>
    { 
       "code": 200,  
       "message": "success", 
       "user": { 
           "userId": 1,  <br>
           "firstName": "Abhijeet",  
           "lastName": "Debadwar", 
           "email": "abhijeet@gmail.com", 
           "password": "abhi1234"
       }
}
  </pre>

------------------------------------------------------------------
<pre>
 
2.   get User by Email and Password
     Request body -
     
     method - post 
     http://localhost:8080/users/get 

     
      { 
           "email":"abhijeet@gmail.com", 
           "password":"abhi1234" 
      }
     

   
     ------> Response Body
   
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




---------------------------------------------------
     
 3.   put / user  -> update by Email id
 
http://localhost:8080/users
Method- put
 <br>


    ----> Request Body
  {      
          "firstName":"Harry", 
          "lastName":"potter", 
          "email":"abhijeet@gmail.com",
          "password":"abhi1234" 
  }
  
  ------> Response Body
  
  {    
       "code": 200,  
       "message": "updated", 
       "user": { 
           "userId": 2, 
           "firstName": "Harry", 
           "lastName": "potter", 
           "email": "abhijeet@gmail.com", 
           "password": "abhi1234" 
       }
  }
</pre>

------------------------------------------------------


<pre>
 
4 .  Delete  User by EmailId

http://localhost:8080/users?email=abhijeet@gmail.com&pass=abhi1234 <br>
 
 Method- DELETE

Response Body-
  {   
       "code": 200, 
       "message": "User deleted", 
       "user": { 
            "userId": 1, 
            "firstName": "Abhijeet", 
            "lastName": "Debadwar",
            "email": "abhijeet@gmail.com",
           "password": "abhi1234"
      }
}


--- http://localhost:8080/users?email=abhijeet@gmail.com&pass=abhi1234 <br>
Respose Body 

{  
    "code": 404, 
    "message": "User not present", 
    "user": null 
}

</pre>

-------------------------------------------------------------------------------


---------------------ADDITIONAL API'S------------------------

1   getUserById   --  get User from Database given userId <br>
2   getAllUsers  --    get All the users from Table <br>
3   createMultipleUsers()  --  create Multiple new users like List in table at a time <br>
4   changePassword() --  Change old password to newPassword by Given Email id <br>
5   check password Expiry <br>
6   get All current Active users <br>
7   Forgot Password
8   Search User by FirstName 




---------------Implemeted Api's--------------- <br>

1  getUserById   --  get User from Database given userId <br>
2   getAllUsers  --    get All the users from Table <br>
3   createMultipleUsers()  --  create Multiple new users like List in table at a time <br>
4   changePassword() --  Change old password to newPassword by Given Email id <br>






