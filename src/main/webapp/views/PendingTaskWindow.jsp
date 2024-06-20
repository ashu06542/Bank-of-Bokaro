<%@ page import="com.bank.BankOfBokaro.entities.JournalTableEntity" %>
<%@ page import="java.util.*" %>


<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Account Information Screen</title>




</head>
<body>

	<% List<JournalTableEntity>list=(List<JournalTableEntity>)request.getAttribute("journalTableList");%>
	

		<div class="form-group w-25 mt-5">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">JournalNo</th>
						<th scope="col">Status</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
				
				<% for(int i=0; i<list.size(); i++) { %>	
	<tr id=<%="tableRow"+i %>>

	<td><%=list.get(i).getJournalNo() %></td>
	
		<td><%=list.get(i).getStatus() %></td>
		          <td> <button type="button" class="btn auth" onClick="onAuthClick(event)">Authorize</button>    <button type="button" class="btn">Reject</button></td>
		
	
	</tr>
<% } %>
				
				
				
				
				
				
				
		
					
			</table>

		</div>


		<h2>${model}</h2>













		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
			integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
			integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous"></script>
		<script
			src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

		<script src="/resources/js/AccountCreation.js">
			
		</script>
</body>
</html>