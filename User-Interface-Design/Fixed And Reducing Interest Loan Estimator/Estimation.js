

    //Fill with appropriate and required javascript global variables  code here 
    var P, N,r,R,EMI;
   





function EstimateReducingInterestLoan()
{
	/* Fill with required javascript code to read input values from HTML Components  */


	calculateEMI();
    totalPayment();
    totalInterest();
    EstimateFixedInterestLoan();


    
}

function EstimateFixedInterestLoan()
{
    /* Fill with required javascript code here  */
    var totalInterest = P * (r/100) *(N/12);
    document.getElementById("tInterestFixed").innerHTML = totalInterest.toFixed(2); /*Assign total Interest value here*/
    
     /* Fill with required javascript code here  */
    var totalPayment = P + totalInterest;
    document.getElementById("tPaymentFixed").innerHTML = totalPayment.toFixed(2); /*Assign total payment value here*/
    
     /* Fill with required javascript code here  */
     var EMI = totalPayment / ((N/12)*12);
    document.getElementById("EMIFixed").innerHTML = EMI.toFixed(2); /*Assign emi  value here*/
    
    
}

function calculateEMI(){
	
    /* Fill with required javascript code here  */
    
    // document.getElementById("EMI").innerHTML = " ";/*Assign emi value here*/
     P = parseInt(document.getElementById("principalAmount").value);
     r = parseInt(document.getElementById("interestRate").value);
     N = parseInt(document.getElementById("tenure").value);
     R = ((r/100)/12);
    EMI = (P*R*(Math.pow((1+R),N)/((Math.pow((1+R),N))-1)));
    document.getElementById("EMI").innerHTML = EMI.toFixed(2);

}

function totalPayment(){
	
// 	/* Fill with required javascript code here  */

	    var totalPayment =  EMI * N;
	    document.getElementById("tPayment").innerHTML = totalPayment.toFixed(2); /*Assign total payment value here*/
}
function totalInterest(){
	
// /* Fill with required javascript code here  */
        	    var totalPayment =  EMI * N;
        var totalInterest = totalPayment - P;
     document.getElementById("tInterest").innerHTML = totalInterest.toFixed(2); /*Assign total Interest value here*/
}


