<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<script>
$(document).ready(function(){
	  $("#myInput").on("keyup", function() {
	    var value = $(this).val().toLowerCase();
	    $("#myTable tr").filter(function() {
	      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
	    });
	  });
	});

</script>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>




</head>
<body>


	<h2>Successfully added</h2>
	<p>Type something in the input field to search the table for ID,
		names, or emails:</p>
	<input id="myInput" type="text" placeholder="Search..">
	<br>
	<br>

	<table>
		<thead>
			<tr>
				<th>Customer Code</th>
				<th>Customer Name</th>
				<th>Customer Address</th>
				<th>Customer Pincode</th>
				<th>Customer E-mail</th>
				<th>Customer Number</th>
				<th>Registration Date</th>
				<th>Created By</th>
				<th>Modified Date</th>

			</tr>
		</thead>
	
		
			<tbody id="myTable">
			<c:forEach items="insert" var="element">
				<tr>
					<th>${element.customerCode}</th>
					<th>${element.customerName}</th>
					<th>${element.customerAddress}</th>
					<th>${element.customerPincode}</th>
					<th>${element.customerEmail}</th>
					<th>${element.customerNumber}</th>
					<th>${element.registrationDate}</th>
					<th>${element.createdBy}</th>
					<th>${element.modifiedDate}</th>
				</tr>
				</c:forEach>
				</tbody>
		
	</table>



</body>
</html>