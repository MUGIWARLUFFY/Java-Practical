<!-- 1a)Create a simple calculator application using servlet.-->


<!DOCTYPE html>
<html>
    <head>
        <title>Calculator</title>
    </head>
    <body>
        <form action="CalciServlet">
            <h1>Pract 1A Calculator Application</h1>
            Enter the first number: <input type="text" name="no1"> <br>
            Enter the second number: <input type="text" name="no2">
            <hr>
            Choose the Operation: <br>
            <input type="radio" name="opr" value="+"> Addition <br>
            <input type="radio" name="opr" value="-">Subtraction <br>
            <input type="radio" name="opr" value="*"> Multiplication<br>
            <input type="radio" name="opr" value="/"> Division<br>
            <input type="reset">
            <input type="submit">
                                           
        </form>
    </body>
</html>