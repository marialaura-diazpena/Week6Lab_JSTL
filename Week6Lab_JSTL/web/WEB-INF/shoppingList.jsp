<%-- 
    Document   : shoppingList
    Created on : Mar 2, 2021, 12:01:07 PM
    Author     : 807930
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        Hello, ${username} <a href="shoppingList?action=logout">Log out</a> <br>
        <h2>List</h2>
        <form action="" method="POST">
            Add item: <input type="text" name="newItem"> 
            <input type="submit" value="Add">
            <input type="hidden" name="action" value="add">
        </form>
        
        <form action="" method="POST">
            <ul>
            <c:forEach items="${items}" var="item"> 
                <li><input type="radio" name="item" value="${item}">${item}</li>
            </c:forEach>
            </ul>
            <input type="submit" value="Delete">
            <input type="hidden" name="action" value="delete">
        </form>
    </body>
</html>
