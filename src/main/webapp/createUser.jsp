<%-- 
    Document   : createUser
    Created on : Feb 25, 2023, 10:59:22 AM
    Author     : Admin
--%>

<%@page import="sample.user.UserError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Create User</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        User Information
        <%
            UserError userError = (UserError) request.getAttribute("USER_ERROR");
            if (userError == null) {
                userError = new UserError();
            }
            String error = (String) request.getAttribute("ERROR");
            if (error == null)
                error = "";
        %>
        <form action="MainController" method="POST">
            User ID <input type="text" name="userID" required=""/>
            <div class="a"><%= userError.getUserIDError()%></br></div>
            Full name <input type="text" name="fullName" required=""/>
            <%= userError.getFullNameError()%></br>
            Role ID <input type="text" name="roleID" value="US" readonly=""/></br>
            Password <input type="password" name="password" required=""/></br>
            Confirm <input type="password" name="confirm" required=""/>
            <%= userError.getConfirmError()%></br>
            <input type="submit" name="action" value="Create"/>
            <input type="reset" value="Reset"/>
            <a href="login.html">Đăng nhập</a>
        </form>
        <%= error%>
    </body>
</html>
