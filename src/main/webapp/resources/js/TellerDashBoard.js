/**
 * 
 */

function helpteller(){
	
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



function onAuthClick(event){
	
	var journalNo=event.target.parentElement.parentElement.children[0].innerHTML;
	
	$.ajax({
        url: "http://localhost:8080/uponAuthorize",
       data:{jrnl:journalNo},
        type:"POST",
     
       
    }).then(function(data) {
    
    
			console.log("success"); 
			
		
      
    });



}
