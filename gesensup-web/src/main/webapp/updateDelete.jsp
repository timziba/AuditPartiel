<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page import="com.ensup.master.metier.Student"%>

<!-- header -->
<%@include file="header.jsp"%>
<!-- Navigation-->
<%@include file="menuhaut.jsp"%>

<!-- Début ajout etudiant -->

<div class="container">
	<br /> <br /> <br /> <br /> <br /> <br />

<div class="pt-4 pb-3" ">
		<% Student student = (Student) session.getAttribute("student");
		%>
			
			<form action="ModifEtudiantServlet" method="post">
				
				<div class="form-row">
				
					<div class="col">
						<div class="md-form md-outline mt-0">
						<label for="firstName">First Name</label>
							<input type="text" id="firstName" name="firstName" class="form-control" value="<%=student.getFirstName()%>"> 
							
						</div>
					</div>
					
					<div class="col">
						<div class="md-form md-outline mt-0">
						<label for="lastName">Last Name</label>
							<input type="text" id="lastName" name="lastName" class="form-control" value="<%=student.getLastName()%>"> 
							
						</div>
					</div>
					
				</div>

				<div class="md-form md-outline mt-0">
				<label for="mailAdresse">Mail Adress</label>
					<input type="text" id="mailAdresse" class="form-control" name="mailAdresse" value="<%=student.getMailAdresse()%>"> 
					
				</div>
				
				
				<div class="md-form md-outline">
				<label for="adress">Address</label>
					<input  id="adress" class="form-control" name="adress" value="<%=student.getAdress()%>" >
					
				</div>
				
				<div class="md-form md-outline mt-0">
									<label for="numberPhone">NumberPhone</label>
				
					<input type="text" id="numberPhone" name="numberPhone" class="form-control" value="<%=student.getNumberPhone()%>">
				</div>				
				
				<div class="md-form md-outline mt-0">
									<label for="dateOfBirth">Birth Date - format(yyyy-mm-dd)</label>
				
					<input type="date" id="dateOfBirth" name="dateOfBirth" class="form-control" value="<%=student.getDateOfBirth()%>">
				</div>
				<div class="md-form md-outline mt-0"  style="visibility:hidden;">
					<input type="text" id="id" name="id" class="form-control" value="<%=student.getId()%>">
					<label for="id">id</label>
				</div>	
			
								
				<br/> <br/>
				<div class="text-center mb-2">
					<button type="submit" class="btn btn-primary mb-4">Modifier</button>
					<a href="SupprimerEtudiantServlet?id=<%=student.getId()%>"><button  class="btn btn-primary mb-4">Delete</button></a>
				</div>
				
				

			</form>



		</div>
</div>
<!-- Fin ajout etudiant -->

<!-- footer -->
<%@include file="footer.jsp"%>