<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.example.util.Mappings" %>
<html>
    <head>
        <title>Customers</title>
    </head>

    <body>
        <div align="center">
            <c:url var="addUrl" value="${Mappings.ADD_CUSTOMER}"/>
            <a href="${addUrl}">New Customer</a>

            <c:url var="homeUrl" value="${Mappings.HOME}"/>
            <a href="${homeUrl}">Home</a>


            <table border="1" cellpadding="5">

                <caption><h2>Customers</h2></caption>

                <tr>
                    <th>Customer Id</th>
                    <th>Customer Name</th>
                    <th>View Customer</th>
                    <th>Edit Customer</th>
                    <th>Delete</th>
                </tr>

                <c:forEach var="customer" items="${customerData.customers}">

                    <c:url var="viewUrl" value="${Mappings.VIEW_CUSTOMER}">
                        <c:param name="customer_id" value="${customer.customer_id}"/>
                    </c:url>

                    <c:url var="editUrl" value="${Mappings.ADD_CUSTOMER}">
                        <c:param name="customer_id" value="${customer.customer_id}"/>
                    </c:url>

                    <c:url var="deleteUrl" value="${Mappings.DELETE_CUSTOMER}">
                        <c:param name="customer_id" value="${customer.customer_id}"/>
                    </c:url>


                    <tr>
                        <td><c:out value="${customer.customer_id}"/></td>
                        <td><c:out value="${customer.customer_name}"/></td>
                        <td><a href="${viewUrl}">View Customer</a></td>
                        <td><a href="${editUrl}">Edit Customer</a></td>
                        <td><a href="${deleteUrl}">Delete Customer</a></td>
                    </tr>

                </c:forEach>
            </table>
        </div>
    </body>
</html>