<%-- 
Pract 1B: Create a servlet for a login page. If the username and password are correct then it says message “Hello <username>” else a message “login failed”
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Login form</h1>
        <hr>
        <form action="LoginServlet">
            Enter your name: <input type="text" name="txtName" /><br>
            Enter your password: <input type="text" name="txtPass"/><br>
            <input type="reset"/><input type="submit" value="~~submit~~"/>
        </form>
    </center>
    </body>
</html>
