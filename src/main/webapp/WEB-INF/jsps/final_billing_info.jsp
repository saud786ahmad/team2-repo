<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body>
         <h2>Billing | Details</h2>  
          <hr>
    First Name:${bill.firstName}<br/>
    Last Name:${bill.lastName}<br/>    
    Email:${bill.email}<br/>
    Mobile:${bill.mobile}<br/>
    Product:${bill.product}<br/>
    Amount:${bill.amount}<br/>
    Mode of Payment:${bill.mode}<br/>
    
</body>
</html>