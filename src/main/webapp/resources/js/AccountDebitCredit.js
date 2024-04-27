/**
 * 
 */

 $(document).ready(function(){ 
   
    $("#amountDebitCredit").hide();
   
});

$("input[type='radio'][name='flexRadioDefault']").change(function(){
	
	var val=$("input[type='radio'][name='flexRadioDefault']:checked").val();
	
	if(val=="D"){
		
		$("#amount").attr("placeholder", "Enter Debit Amount");
	}else if(val=="C"){
		
		$("#amount").attr("placeholder", "Enter Credit Amount");
	}
});

$("#submitBtn").click(function(){
	
		var val=$("input[type='radio'][name='flexRadioDefault']:checked").val();
	
	var finalAmt=parseFloat($("#amount").val());
	
	if(val=="D"){
		
		$("#amountDebitCredit").val(-1*finalAmt);
	}else if(val=="C"){
		
		$("#amountDebitCredit").val(finalAmt);
	}
	
});

function help(){
	
}
$("#checkBal").click(function(){
	
	var formData=$("#accnt").val();
	
	$.ajax({
        url: "http://localhost:8080/checkBal/"+formData,
        type:"GET",
     
       
    }).then(function(data) {
    
        
			 
			 $("#bal").val("Rs. "+data);
		
      
    });
});