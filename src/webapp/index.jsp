<%--
  Created by IntelliJ IDEA.
  User: jinchao.xu
  Date: 14-10-31
  Time: 下午3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index.jsp</title>
  </head>
  <body>
    <form action="/test/addUser" method="post">
        Account: <input type="text" id="username" />
        Password: <input type="password" id="password"/>
        <input type="submit" value="submit">
    </form>
  </body>
</html>