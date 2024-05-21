/**
 * 
 */

function help(){
	
}

 
 $("#submitBtn").click(function(){


$.ajax({
        url: "http://localhost:8080/pendingTaskScreen",
        type:"POST",
     
       
    }).then(function(data) {
    
     $("#responseContainer").html(data);
        
			console.log("success"); 
			
		
      
    });

		
});