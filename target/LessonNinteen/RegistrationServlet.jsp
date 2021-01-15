<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<form action="/reg" method="post">
    <input type="text" name="name" placeholder="Name">
    <br>
    <input type="text" name="login" placeholder="Login">
    <br>
    <input type="text" name="password" placeholder="Password">
    <br>
    <button>Submit!</button>
</form>
${requestScope.messageReg}
${requestScope.messageExist}
${requestScope.messageShortLog}
${requestScope.messageShortPass}
</body>
</html>
