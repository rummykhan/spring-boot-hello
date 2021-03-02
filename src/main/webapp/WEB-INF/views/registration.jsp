<%--
  Created by IntelliJ IDEA.
  User: manzoorr
  Date: 02/03/2021
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="container">

<h1>Registration</h1>

<div class="row">
    <div class="col-md-6 offset-md-3 col-sm-12">

        <form:form modelAttribute="registration">

            <div class="form-group">
                <label for=""><spring:message code="name" /></label>
                <form:input type="text" path="name" cssClass="form-control" required="required"/>
            </div>

            <div class="form-group">
                <label for=""><spring:message code="email" /></label>
                <form:input type="email" path="email" cssClass="form-control" required="required"/>
            </div>

            <div class="form-group">
                <label for=""><spring:message code="password" /></label>
                <form:password path="password" cssClass="form-control" required="required"/>
            </div>

            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-sm"><spring:message code="save.changes" /></button>
            </div>

        </form:form>

    </div>
</div>

</body>
</html>
