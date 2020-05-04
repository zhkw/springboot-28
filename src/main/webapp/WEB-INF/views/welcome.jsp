<%--
  Created by IntelliJ IDEA.
  User: zhou
  Date: 2020/5/4
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css" />
    <script src="/js/custom.js"></script>
    <link href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<p id="test">This is test!</p>
Welcome ${name}. You are now authenticated.

<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th></th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.name}</td>
                <td>
                    <a type="button" class="btn btn-warning"
                       href="/delete-todo?id=${todo.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
