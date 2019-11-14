<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2019/10/7
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="anno/testRequestParam?username=haha">RequestParam</a>
    <br/>
    <form action="anno/testRequestBody" method="post">
        用户：<input type="text" name="username"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>

    <a href="anno/testPathVariable/10">testPathVariable</a>
    <br/>

    <a href="anno/testRequestHeader">testRequestHeader</a>
    <br/>

    <a href="anno/testCookkieValue">testCookkieValue</a>
    <br/>

    <form action="/anno/testModelAttribute" method="post">
        用户：<input type="text" name="username"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>


    <a href="anno/testSessionAttributes">testSessionAttributes</a>
    <br/>

    <a href="anno/getSessionAttributes">getSessionAttributes</a>
    <br/>
</body>
</html>
