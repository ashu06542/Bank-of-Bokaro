

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Account Creation Screen</title>


  
    
  </head>
  <body>
  
  <div class="container mt-5">
  
  <div class="mt-5">
  <h2>Create a Bank of Bokaro account</h2>
  
  </div>
  
  
  <form action="/process" method="post">
  <div class="form-group w-25 mt-5" >
    <label for="exampleInputEmail1">Account Holder's Name</label>
    <input type="text" name="name" class="form-control" id="name" required aria-describedby="emailHelp" placeholder="Enter Name">
    
  </div>
  
  <div class="form-group w-25" >
    <label for="exampleInputPassword1">Date of Birth</label>
    <input type="text" name="dob" class="form-control" id="dob" required placeholder="Enter Date">
  </div>

  <div class="form-group w-25" >
    <label for="exampleInputPassword1">Father's Name</label>
    <input type="text"  name="fathersName" class="form-control" required id="abc" placeholder="Enter Father's Name">
  </div>
  
  <div class="form-group w-25" >
    <label for="exampleInputPassword1">Email Address</label>
    <input type="email" name="email"  class="form-control" id="email"  required placeholder=" Enter Email Address">
  </div>
  
  <div class="form-group w-25" >
    <label for="exampleInputPassword1">Mobile Number</label>
    <input type="text" name="mobileNo" class="form-control" id="mob" required placeholder="Enter Mobile Number">
  </div>
  
     <div class="form-group w-25" >
    <label for="exampleInputPassword1">Initial Balance</label>
    <input type="text" name="initBalance" class="form-control" id="init" required placeholder="Enter Initial Balance">
  </div>
  
  <div class="form-group w-25" >
    <label for="exampleInputPassword1">AccountNumber</label>
    <input type="text" name="accntNumber" class="form-control" id="accnt"   placeholder="Enter Account Number">
  </div>

  <button type="submit" id="submitBtn" class="btn btn-primary">Submit</button>
</form>
  
  
  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
     <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>         
     
         <script src="/resources/js/AccountCreation.js"> </script>

  
  </body>
</html>