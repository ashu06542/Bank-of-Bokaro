/**
 * 
 */

//alert("hello");
$(document).ready(function(){ 
   
 
   
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

