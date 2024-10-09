<%-- 
Pract 1c. Create a registration servlet in Java using JDBC. 
Accept the details such as Username, Password, Email, and Country from the user using HTML Form and store the registration details in the database
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration form</title>
    </head>
    <body>
        <h1>Registration form</h1>
        <form action="RegServlet">
            Enter a Username: <input type="text" name="txtName" /> <br>
            Enter a Password: <input type="text" name="txtPass"/><br>
            Enter your Email: <input type="text" name="txtEmail"/><br>
            Enter your Country: <input type="text" name="txtCn"/><br>
            <input type ="reset"/>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
