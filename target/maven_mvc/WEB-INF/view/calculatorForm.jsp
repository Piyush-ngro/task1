<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
    <h2>Calculator</h2>
    <form action="calculate" method="POST">
        Number 1: <input type="number" name="num1"><br>
        Number 2: <input type="number" name="num2"><br>
        Operation: 
        <select name="operation">
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
        </select><br>
        <button type="submit">Submit</button>
    </form>
   <p>
        The result is: 
        <%= request.getAttribute("result") != null ? request.getAttribute("result") : "No result yet." %>
    </p>
    
    
</body>
</html>
