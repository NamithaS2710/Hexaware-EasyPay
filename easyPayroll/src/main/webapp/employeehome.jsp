<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Home</title>
</head>
<body>
   <h2>Welcome Employee</h2>
    <p>User ID: ${loggedInUser.userId}</p>
    <p>Username: ${loggedInUser.username}</p>
    <p>Email: ${loggedInUser.email}</p>
    <p>Role: ${loggedInUser.role}</p>
    <div>
       <a href="logout">Logout</a>
    </div>
</body>
</html>