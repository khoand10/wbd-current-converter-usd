<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 27/04/2018
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>USD</title>
  </head>
  <body>
      <h1>Current converter</h1>
      <form method="post" action="/current">
          Rate: <input type="text" value="23000" name="rate"><br>
          USD: <input type="text" name="usd"><br>
          <input type="submit" value="send">
      </form>
  </body>
</html>
