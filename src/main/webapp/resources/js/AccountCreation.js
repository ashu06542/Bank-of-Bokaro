/**
 * 
 */

//alert("hello");
$(document).ready(function(){ 
   
 $("#makerChecker").hide();
   
});

function help(){
	
}

$("#init").focusout(function(){
	
$.ajax({
        url: "http://localhost:8080/accntNum",
        type:"GET"
    }).then(function(data) {
    
         if(data==0){
			 
			 $("#accnt").val(10011);
		 }else{
			 
			 $("#accnt").val(data+1);
		 }
      
      
    });
	
});


$("#submitBtn").click(function(){
	
	$("#makerChecker").val("Y");
});
