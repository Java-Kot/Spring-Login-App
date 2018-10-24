<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <form:form action="login.html" method="post" modelAttribute="login">
        <form:label path="user" for="username">Username</form:label>
        <form:input path="user" id="username" type="text"  />
        <form:label path="pass" for="password">Password</form:label>
        <form:input path="pass" name="password" id="password" type="password" />
        <form:button type="submit">Login</form:button>
    </form:form>
</body>
</html>
