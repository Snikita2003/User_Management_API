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



1  get All users from table
   http://localhost:8080/users
   Method-  get

   Response body->

  <pre>
    [
    {
        "userId": 1,
        "firstName": "Abhijeet",
        "lastName": "Debadwar",
        "email": "abhijeet@gmail.com",
        "password": "abhi1234"
    },
    {
        "userId": 2,
        "firstName": "HarryPotter",
        "lastName": "potter",
        "email": "harry@gmail.com",
        "password": "harry1234"
    },
    {
        "userId": 4,
        "firstName": "Alice",
        "lastName": "Smith",
        "email": "alice.smith@example.com",
        "password": "alicePass123"
    },
    {
        "userId": 5,
        "firstName": "Bob",
        "lastName": "Johnson",
        "email": "bob.johnson@example.com",
        "password": "pass123"
    },
    {
        "userId": 6,
        "firstName": "Alice",
        "lastName": "abc",
        "email": "alice@gmail.com",
        "password": "alice1234"
    }
]
  </pre>



--------------------------------------------
2   get user by given id
    http://localhost:8080/users/getById/1
    Method - get
    <pre>
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

    
 -----------------------------------------------------
 
3   create multiple users at one go ( list of users  store in db )
    http://localhost:8080/users/
    Method- Post
    Request Body-
    
   <pre>
    [
         {
           "firstName": "Alice",
           "lastName": "Smith",
           "email": "alice.smith@example.com",
           "password": "alicePass123"
         },
         {
           "firstName": "Bob",
           "lastName": "Johnson",
           "email": "bob.johnson@example.com",
           "password": "bobPass123"
         }
   ]
  </pre>

 
--------------------------------------------------
4   change password of user with given by Email-id
    http://localhost:8080/users/get/changePass
    Method - Post
    Request Body-

  <pre> 
  {  
        "email": "bob.johnson@example.com",
        "oldPassword":"bobpass123",
        "newPassword": "pass123"
  }

  Response Body--
  {
    "code": 200,
    "message": "Changed Password successfully",
    "user": {
        "userId": 5,
        "firstName": "Bob",
        "lastName": "Johnson",
        "email": "bob.johnson@example.com",
        "password": "p123"
    }
}
    </pre>
    
    
----------------------------------------------
5   Search all users by given First Name
    http://localhost:8080/users/alice
    Method get

 Response Body-
<pre>
    [
      {
            "userId": 4,
            "firstName": "Alice",
            "lastName": "Smith",
            "email": "alice.smith@example.com",
            "password": "alicePass123"
      },
      {
             "userId": 6,
             "firstName": "Alice",
             "lastName": "abc",
             "email": "alice@gmail.com",
             "password": "alice1234"
      }
]
</pre>

 
    
 
 
</pre>







