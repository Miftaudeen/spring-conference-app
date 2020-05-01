<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 5/1/20
  Time: 1:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
    <form:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                    <spring:message code="name"/>
                </td>
                <td>
                    <form:input path="name"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Register">
                </td>
            </tr>
        </table>
    </form:form>
</head>
<body>
    <h1>Registration</h1>
</body>
</html>
