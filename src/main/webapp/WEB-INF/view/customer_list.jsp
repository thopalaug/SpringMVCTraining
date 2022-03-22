<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Customers</title>
    </head>

    <body>
        <div align="center">
            <table border="1" cellpadding="5">

                <caption><h2>Customers</h2></caption>

                <tr>
                    <th>Customer Id</th>
                    <th>Customer Name</th>
                </tr>

                <c:forEach var="customer" items="${customerData.listOfCustomers}">

                    <tr>
                        <td><c:out value="${customer.customer_id}"/></td>
                        <td><c:out value="${customer.customer_name}"/></td>
                    </tr>

                </c:forEach>
            </table>
        </div>
    </body>
</html>