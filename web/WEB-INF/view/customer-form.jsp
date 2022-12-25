<%-- 
    Document   : customer-form
    Created on : 25 déc. 2022, 20:02:33
    Author     : acer swift 3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" 
              type="text/css"
              href="${pageContext.request.contextPath}/resources/css/style.css"
              >

        <link 
            rel="stylesheet" 
            type="text/css"
            href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"
            >
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h2>CRM - Customer Relationship Manager</h2>
            </div>
        </div>
        <div id="container">
            <h3>Save Customer</h3>
            <form:form action="saveCustomer" modelAttribute="customer" method="POST">
                <table>
                    <tbody>
                        <tr>
                            <td><label>First Name:</label></td>
                            <td><form:input path="firstName" /></td>
                        </tr>
                        <tr>
                            <td><label>Last Name:</label></td>
                            <td><form:input path="lastName" /></td>
                        </tr>
                        <tr>
                            <td><label>Email:</label></td>
                            <td><form:input path="email" /></td>
                        </tr>
                        <tr>
                            <td><label></label></td>
                            <td><input type="submit" value="Save" class="save"/></td>
                        </tr>
                    </tbody>

                </table>
            </form:form>
            
            
            <p>
                <a href="${pageContext.request.contextPath}/customer/list">Back To List</a>
            </p>
        </div>
    </body>
</html>
