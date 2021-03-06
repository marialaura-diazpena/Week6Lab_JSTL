<%-- 
    Document   : register
    Created on : Mar 2, 2021, 12:00:51 PM
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
        <form method="post" action="shoppingList">
            Username: <input type="text" name="username"> 
            <input type="hidden" name="action" value="register">
            <input type="submit" value="Register name">
        </form>
    </body>
</html>
