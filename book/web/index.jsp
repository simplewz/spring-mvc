<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>欢迎来到图书管理系统</title>
  </head>
  <style>
    a{
      text-decoration: none;
      color: black;
      font-size: 18px;
    }
    h3{
      width: 180px;
      height: 40px;
      margin: 100px auto;
      text-align: center;
      line-height: 40px;
      background: deepskyblue;
      border-radius: 5px;
    }
  </style>
  <body>
    <h3>
      <a href="${pageContext.request.contextPath}/book/list">所有图书</a>
    </h3>
  </body>
</html>
