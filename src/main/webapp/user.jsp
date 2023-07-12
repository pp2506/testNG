<%-- 
    Document   : user
    Created on : Feb 8, 2023, 11:27:54 AM
    Author     : Admin
--%>

<%@page import="sample.user.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <h1>User page(US role)</h1>
         
            <% 
            UserDTO loginUser= (UserDTO)session.getAttribute("LOGIN_USER");
            if(loginUser==null|| !"US".equals(loginUser.getRoleID())) {
                response.sendRedirect("login.html");
                return;
            }
        %>
        
        User ID: <%= loginUser.getUserID() %> </br>
        <div class="h">
        Full Name: <%= loginUser.getFullName() %> </br>
        </div>
        Role ID: <%= loginUser.getRoleID() %> </br>
        Password: <%= loginUser.getPassword() %>

    </body>
</html>
