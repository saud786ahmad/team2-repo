<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report</title>
</head>
<body>
     <h2>All Reports</h2>
           <hr>
           <table border= '1'>
		<tr>
			<th>Id</th>
			<th>Amount</th>
			<th>Email</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile</th>
			<th>Mode</th>
			<th>Product</th>
		</tr>
    <c:forEach var="bill" items="${bills}" >
      <tr>
			<td>${bill.id }</td>
			<td>${bill.amount }</td>
			<td>${bill.email }</td>
			<td>${bill.firstName }</td>
			<td>${bill.lastName }</td>
			<td>${bill.mobile }</td>
			<td>${bill.mode }</td>
			<td>${bill.product }</td>
		</tr>
       
 
 
     </c:forEach>





	</table>
           
</body>
</html>