<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome</h1>
<h3>Account: ${user.username}</h3>
<h3>Email: ${user.email}</h3>
<h3>Phone: ${user.phone}</h3>
<img src="${user.avatar}" />
</body>
</html>