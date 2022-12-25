<%-- 
    Document   : list-customers
    Created on : 25 déc. 2022, 13:36:02
    Author     : acer swift 3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet"
               type="text/css"
               href="${pageContext.request.contextPath}/resources/css/style.css"/>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h2>CRM - Customer Relationship Manager</h2>
            </div>
        </div>
        
        <div id="container">
            <div id="content">
                <!-- add our html table here -->
                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th><!-- comment -->
                        <th>Email</th>
                    </tr>
                    <!-- Loop Over and print our customers -->
                    <c:forEach var="tempCustomer" items="${customers}">
                        <tr>
                            <td>${tempCustomer.firstName}</td>
                            <td>${tempCustomer.lastName}</td><!-- comment -->
                            <td>${tempCustomer.email}</td>
                        </tr>               
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
