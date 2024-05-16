

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Teller Login Screen</title>


  
    
  </head>
  <body>
  
  <div class="container mt-5">
  
  <div class="mt-5">
  <h2>New Teller Creation</h2>
  
  </div>
  
  
  <form action="/TellerCreation" method="post">
 
  
  <div class="form-group w-25" >
    <label for="exampleInputPassword1">Teller Name</label>
    <input type="text" name="name" class="form-control" id="name" required placeholder="Enter Name">
  </div>
  
   <div class="form-group w-25" >
    <label for="exampleInputEmail1">Teller Id</label>
    <input type="text" name="tellerId" class="form-control" id="tellerId" required aria-describedby="emailHelp" placeholder="Enter User Id">
    
  </div>
  
  <div class="form-group w-25" >
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="pass" class="form-control" id="pass" required placeholder="Enter Password">
  </div>
  
  <div class="form-group w-25" >
    <label for="exampleInputPassword1">capability</label>
    <input type="text" name="capability" class="form-control" id="pass" required placeholder="Enter Password">
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