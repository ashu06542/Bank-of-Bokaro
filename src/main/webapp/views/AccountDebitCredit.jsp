

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

	<div class="container mt-5">

		<div class="mt-5">
			<h2>Account Debit Or Credit</h2>

		</div>


		<form action="/debitCreditProcess" method="post">
			
			  <div class="form-group w-25 mt-5" >
    <label for="exampleInputPassword1">AccountNumber</label>
    <input type="text" name="accntNo" class="form-control" id="accnt"   required placeholder="Enter Account Number">
  </div>
  

			<div class="row">
			
			<div class="form-check mt-5 ">
				<input class="form-check-input " type="radio" required name="flexRadioDefault"
					value="D" id="flexRadioDefault1"> <label
					class="form-check-label radionCreditDebit col-sm-2 col-form-label col-form-label-sm" for="flexRadioDefault1"> Debit
					Amount </label>
			</div>
			<div class="form-check mt-5">
				<input class="form-check-input" type="radio" required name="flexRadioDefault"
					value="C" id="flexRadioDefault2"> <label
					class="form-check-label radionCreditDebit col-sm-2 col-form-label col-form-label-sm" for="flexRadioDefault2"> Credit
					Amount </label>
			</div>

			<div class="form-group w-25 mt-5" >
    <input type="text" name="amount" class="form-control" id="amount"   required placeholder="Amount">
  </div>
	</div>	
	
		<div class="form-group w-25 mt-5" >
    <input type="text" name="amountDebitCredit" class="form-control" id="amountDebitCredit">
  </div>
	
	
		<div class="form-group w-25 mt-5" >
		<div class="input-group mb-3">
  <div class="input-group-prepend">
    <button class="btn btn-outline-secondary" id="checkBal" type="button">Check Balance</button>
  </div>
  <input type="text" class="form-control" placeholder="" aria-label="" id="bal" name="balance" aria-describedby="basic-addon1">
</div>
	</div>
	
			<button type="submit" id="submitBtn" class="btn btn-primary">submit</button>
		</form>

  </div>
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

		<script src="/resources/js/AccountDebitCredit.js">
			
		</script>
</body>
</html>