<%--
  Created by IntelliJ IDEA.
  User: 18610
  Date: 2017/5/6
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="login.action" method="post">

    <table align="center">

      <caption>

        <h3>用户登录</h3>

      </caption>

      <tr>

        <!-- 用户名的表单域 -->

        <td>用户名：<input type="text" name="username" /></td>

      </tr>

      <tr>

        <!-- 密码的表单域 -->

        <td>密&nbsp;&nbsp;码：<input type="password" name="password" /></td>

      </tr>

      <tr align="center">

        <td colspan="2"><input type="submit" value="登录"/></td>

      </tr>

    </table>

  </form>

  </body>
</html>
