 User Management API :


Introduction
This is a RESTful API for managing users, built using Java Spring Boot Framework , MYSQL ( DATABASE )


API Endpoints :

------ CRUD Operaions ----

1.  Create New User

   Request Body - 
   method - post <br>
   http://localhost:8080/users

  <pre>
       {  
             "firstName":"Abhijeet", 
            "lastName":"Debadwar", 
            "email":"abhijeet@gmail.com", 
            "password":"abhi1234"
      }
 

   ----> Response Body  <br>
  
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

 
2.   get User by Email and Password
     Request body -
     
     method - post <br>
     http://localhost:8080/users/get 
 <pre>
     
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


 </pre>

---------------------------------------------------
     
 3.   put / user  -> update by Email id
 
http://localhost:8080/users
<br>
Method- put
<pre>


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



 
4 .  Delete  User by EmailId

http://localhost:8080/users?email=abhijeet@gmail.com&pass=abhi1234 <br>
 
 Method- DELETE
<br>
<pre>
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

<pre>
1.  get all users from table
2.  get user by given id
3.  create multiple users at one go ( list of users  store in db )
4.  change password of user with given by Email-id
5.  Search all users by given First Name
6.  check Password Expiry
7.  Forgot Password
8.  get All current Active users
 
</pre>



---------------Implemeted Api's--------------- <br>

<pre>

1   get all users from table
2   get user by given id
3   create multiple users at one go ( list of users  store in db )
4   change password of user with given by Email-id
5   Search all users by given First Name



 
</pre>







