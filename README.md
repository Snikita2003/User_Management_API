<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Management API Documentation</title>
</head>
<body>

    <h1>User Management API Documentation</h1>

    <h2>📌 Introduction</h2>
    <p>This is a <strong>RESTful API</strong> for managing users, built using the <strong>Java Spring Boot Framework</strong> and connected to a <strong>MySQL Database</strong>.</p>

    <hr>

    <h2>🚀 API Endpoints (CRUD Operations)</h2>

    <!-- 1. Create New User -->
    <h3>1️⃣ Create New User</h3>
    <p><strong>Endpoint:</strong> <code>POST http://localhost:8080/users</code></p>

    <p><strong>Request Body:</strong></p>
    <pre>{
    "firstName": "Abhijeet",
    "lastName": "Debadwar",
    "email": "abhijeet@gmail.com",
    "password": "abhi1234"
}</pre>

    <p><strong>Response Body:</strong></p>
    <pre>{
    "code": 200,
    "message": "success",
    "user": {
        "userId": 1,
        "firstName": "Abhijeet",
        "lastName": "Debadwar",
        "email": "abhijeet@gmail.com",
        "password": "abhi1234"
    }
}</pre>

    <hr>

    <!-- 2. Get User by Email and Password -->
    <h3>2️⃣ Get User by Email and Password</h3>
    <p><strong>Endpoint:</strong> <code>POST http://localhost:8080/users/get</code></p>

    <p><strong>Request Body:</strong></p>
    <pre>{
    "email": "abhijeet@gmail.com",
    "password": "abhi1234"
}</pre>

    <p><strong>Response Body:</strong></p>
    <pre>{
    "code": 200,
    "message": "success",
    "user": {
        "userId": 1,
        "firstName": "Abhijeet",
        "lastName": "Debadwar",
        "email": "abhijeet@gmail.com",
        "password": "abhi1234"
    }
}</pre>

    <p><strong>Failure Response:</strong></p>
    <pre>{
    "code": 404,
    "message": "User not present",
    "user": null
}</pre>

    <hr>

    <!-- 3. Update User -->
    <h3>3️⃣ Update User by Email ID</h3>
    <p><strong>Endpoint:</strong> <code>PUT http://localhost:8080/users</code></p>

    <p><strong>Request Body:</strong></p>
    <pre>{
    "firstName": "Harry",
    "lastName": "Potter",
    "email": "abhijeet@gmail.com",
    "password": "abhi1234"
}</pre>

    <p><strong>Response Body:</strong></p>
    <pre>{
    "code": 200,
    "message": "updated",
    "user": {
        "userId": 2,
        "firstName": "Harry",
        "lastName": "Potter",
        "email": "abhijeet@gmail.com",
        "password": "abhi1234"
    }
}</pre>

    <hr>

    <!-- 4. Delete User -->
    <h3>4️⃣ Delete User by Email ID</h3>
    <p><strong>Endpoint:</strong> <code>DELETE http://localhost:8080/users?email=abhijeet@gmail.com&pass=abhi1234</code></p>

    <p><strong>Response Body (Success):</strong></p>
    <pre>{
    "code": 200,
    "message": "User deleted",
    "user": {
        "userId": 1,
        "firstName": "Abhijeet",
        "lastName": "Debadwar",
        "email": "abhijeet@gmail.com",
        "password": "abhi1234"
    }
}</pre>

    <p><strong>Response Body (Failure):</strong></p>
    <pre>{
    "code": 404,
    "message": "User not present",
    "user": null
}</pre>

    <hr>

    <h2>🔧 Additional API Endpoints</h2>
    <ul>
        <li><strong>Get User by ID:</strong> <code>GET http://localhost:8080/users/{userId}</code></li>
        <li><strong>Get All Users:</strong> <code>GET http://localhost:8080/users/all</code></li>
        <li><strong>Create Multiple Users:</strong> <code>POST http://localhost:8080/users/bulk</code></li>
        <li><strong>Change Password:</strong> <code>PUT http://localhost:8080/users/changePassword</code></li>
        <li><strong>Check Password Expiry:</strong> <code>GET http://localhost:8080/users/checkPasswordExpiry?email=abhijeet@gmail.com</code></li>
        <li><strong>Get All Active Users:</strong> <code>GET http://localhost:8080/users/active</code></li>
        <li><strong>Forgot Password:</strong> <code>POST http://localhost:8080/users/forgotPassword</code></li>
        <li><strong>Search User by First Name:</strong> <code>GET http://localhost:8080/users/search?firstName=Abhijeet</code></li>
    </ul>

    <hr>

    <h2>✅ Implemented APIs</h2>
    <ul>
        <li>getUserById</li>
        <li>getAllUsers</li>
        <li>createMultipleUsers</li>
        <li>changePassword</li>
    </ul>

</body>
</html>
