<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization Page</title>
</head>
<body>
<form action="/auth" method="post">
    <input type="text" name="login" placeholder="Login">
    <br>
    <input type="text" name="password" placeholder="Password">
    <br>
    <button>Log In!</button>
</form>
${requestScope.messageSuccessAuth}
${requestScope.messageWrongPassword}
${requestScope.messageNotRegistered}
${requestScope.messageSuccessReg}
</body>
</html>
