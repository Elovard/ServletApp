<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calc" method="post">
    <input type="number" name="firstNum" placeholder="FirstNum">
    <br>
    <input type="number" name="secondNum" placeholder="SecondNum">
    <br>
    <input type="text" name="operation" placeholder="Operation">
    <br>
    <button>MAKE EM ROLL!</button>
</form>
<br>
${requestScope.result}
</body>
</html>
