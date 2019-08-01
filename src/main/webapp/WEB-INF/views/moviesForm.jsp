<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Favorite movies form</title>
</head>
<body>
<h2>${welcomeMessage}</h2>
<form method="post" action="/">

    <form:errors path="moviesForm.*" cssStyle="color: #a94443;"/><br>
    <label>Name: </label> <input type="text" name="name"><br>
    <label>Surname: </label> <input type="text" name="surname"><br>
    <label>Age: </label> <input type="text" name="age"><br>
    <label>What's your favorite movie? </label> <input type="text" name="favoriteMovie"><br>
    <button type="submit">Submit</button>
</body>
</html>
