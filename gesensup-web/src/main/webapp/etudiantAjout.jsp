
<!-- header -->
<%@include file="header.jsp"%>
<!-- Navigation-->
<%@include file="menuhaut.jsp"%>

<div class="container">
	<br /> <br /> <br /> <br /> <br /> <br />

	<ul>
		<li><a href="etudiant.jsp">Liste des étudiants</a></li>
	</ul>

	<!-- Masthead Heading-->
	<h1>Ajouter un étudiant</h1>
	
	<!-- Card -->
	<div class="">
	
		<div class="pt-4 pb-3">

			<form action="AjoutEtudiantServlet" method="post">

				<div class="form-row">
				
					<div class="col">
						<div class="md-form md-outline mt-0">
							<input type="text" id="firstName" name="firstName" class="form-control"> 
							<label for="firstName">First Name</label>
						</div>
					</div>
					
					<div class="col">
						<div class="md-form md-outline mt-0">
							<input type="text" id="lastName" name="lastName" class="form-control"> 
							<label for="lastName">Last Name</label>
						</div>
					</div>
					
				</div>

				<div class="md-form md-outline mt-0">
					<input type="text" id="mailAdresse" class="form-control" name="mailAdresse"> 
					<label for="mailAdresse">Mail Adress</label>
				</div>
				
				
				<div class="md-form md-outline">
					<textarea  id="adress" class="form-control"	name="adress"></textarea>
					<label for="adress">Address</label>
				</div>
				
				<div class="md-form md-outline mt-0"  type ="hidden;">
					<input type="text" id="numberPhone" name="numberPhone" class="form-control">
					<label for="numberPhone">NumberPhone</label>
				</div>				
				
				<div class="md-form md-outline mt-0">
					<input type="date" id="dateOfBirth" name="dateOfBirth" class="form-control">
					<label for="dateOfBirth">Birth Date</label>
				</div>
			
								
				<br/> <br/>
				<div class="text-center mb-2">
					<button type="submit" class="btn btn-primary mb-4">Submit</button>
				</div>

			</form>



		</div>

	</div>
	<!-- Card -->

</div>

<!-- footer -->
<%@include file="footer.jsp"%>