<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
    This is homepage
    <form action="addLib">
        <input type="text" name="username" />
        <input type="text" name="password" />
        <input type="submit" value="add" />
    </form>
    <form action="getLib">
        <input type="text" name="username" />
        <input type="submit" value="get" />
    </form>
    <form action="updateLib">
        <input type="text" name="username" />
        <input type="text" name="password" />
        <input type="submit" value="update" />
    </form>
</body>
</html>