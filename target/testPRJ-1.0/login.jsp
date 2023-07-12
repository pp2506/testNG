<%-- 
    Document   : login
    Created on : Feb 11, 2023, 9:35:52 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
<form action="MainController" method="POST">
            User ID<input type="text" name="userID" required=""/></br>
            Password<input type="password" name="password" required=""/></br>
            <input type="submit" name="action" value="Login"/>

        </form>   
        <h1><%
            String error= (String) request.getAttribute("ERROR");
            if (error==null) error="";
            %>
            <%= error%></h1>
    </body>
</html>
