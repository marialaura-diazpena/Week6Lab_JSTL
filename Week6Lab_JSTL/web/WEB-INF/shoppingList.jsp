<%-- 
    Document   : shoppingList
    Created on : Mar 2, 2021, 12:01:07 PM
    Author     : 807930
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        Hello, ${username} <a href="register?logout">Log out</a> <br>
        <h2>List</h2>
        <form>
            Add item: <input type="text" name="newItem"> 
            <input type="submit" value="Add">
        </form>
    </body>
</html>
