<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.example.util.Mappings" %>
<html>
    <head>
        <title>Todo List Application</title>
    </head>

    <body>
        <div align="center">
            <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
            <h2><a href="${itemsLink}">Show Items</a></h2>

            <c:url var="customerLink" value="${Mappings.CUSTOMER}"/>
            <h2><a href="${customerLink}">Show Customers</a></h2>

        </div>
    </body>
</html>