<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="org.example.util.AttributeNames" %>

<html>
    <head>
        <title>Add Customer</title>
    </head>

    <body>
        <div align="center">
            <form:form method="POST" modelAttribute="${AttributeNames.CUSTOMER}">
                <table>
                    <tr>
                        <td><label>ID</label></td>
                        <td><form:input path="customer_id" disabled="true" /></td>
                    </tr>
                    <tr>
                        <td><label>Name</label></td>
                        <td><form:input path="customer_name" /></td>
                    </tr>
                    <tr>
                        <td><label>Submit</label></td>
                        <td><input type="submit" value="Submit" /></td>
                    </tr>
                </table>

            </form:form>

        </div>
    </body>
</html>