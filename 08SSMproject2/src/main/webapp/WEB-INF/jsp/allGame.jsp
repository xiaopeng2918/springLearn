<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>游戏列表</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/game/toAddGame">新增</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>游戏id</th>
                    <th>游戏名字</th>
                    <th>游戏别名</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="game" items="${requestScope.get('list')}">
                    <tr>
                        <td>${game.getId()}</td>
                        <td>${game.getName()}</td>
                        <td>${game.getAlias()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/game/toUpdateGame?id=${game.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/game/del/${game.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>