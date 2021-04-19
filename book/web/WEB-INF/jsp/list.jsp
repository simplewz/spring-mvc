<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<html>
<head>
    <link href="${APP_PATH}/static/bootstrap-4.6.0/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH}/static/jquery-3.6.0/jquery-3.6.0.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-4.6.0/js/bootstrap.js"></script>
    <title>所有图书</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <small>书籍列表</small>
            </div>
            <button class="btn btn-primary" data-toggle="modal" data-target="#bookModal">新增书籍</button>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="book" items="${booklist}">
                        <tr>
                            <th>${book.bookID}</th>
                            <th>${book.bookName}</th>
                            <th>${book.bookCounts}</th>
                            <th>${book.detail}</th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <div id="bookModal" class="modal fade" tabindex="-1">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p>Modal body text goes here.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    function addBook() {

    }
</script>
</html>
