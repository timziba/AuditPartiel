


<!-- header -->
<%@include file="header.jsp"%>
<!-- Navigation-->
<%@include file="menuhaut.jsp"%>

<!-- Début ajout etudiant -->

<div class="container">
	<br /> <br /> <br /> <br /> <br /> <br />
<form action="RechercheEtudiantServlet" method=get>
<div class="form-row">
			

			<div class="col">
				<div class="md-form md-outline mt-0">
					<input type="text" id="firstNameR" name="firstNameR"
						class="form-control"> <label for="firstNameR">First
						Name</label>
				</div>
			</div>

			<div class="col">
				<div class="md-form md-outline mt-0">
					<input type="text" id="lastNameR" name="lastNameR"
						class="form-control"> <label for="lastNameR">Last
						Name</label>
				</div>
			</div>

			<div class="text-center mb-2">
				<button type="submit" class="btn btn-primary mb-4">Research</button>
			</div>
			</form>
</div>
	
		
	
	</div>
<!-- Fin ajout etudiant -->

<!-- footer -->
<%@include file="footer.jsp"%>