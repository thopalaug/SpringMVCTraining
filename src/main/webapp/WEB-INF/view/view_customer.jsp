<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.example.util.Mappings" %>
<%@ page import="org.example.util.AttributeNames" %>

<html>
    <head>
        <title></title>
    </head>
    <body>
        <div align="center">
            <table border="1" cellpadding="5">
                <tr>
                <td><label>ID</label></td>
                    <td><c:out value="${customer.customer_id}"/></td>
                </tr>
                <tr>
                    <td><label>Name</label></td>
                    <td><c:out value="${customer.customer_name}"/></td>
                </tr>

            </table>

            <c:url var="backUrl" value="${Mappings.CUSTOMER}"/>
                <a href="${backUrl}">Back</a>

        </div>

    </body>


</html>