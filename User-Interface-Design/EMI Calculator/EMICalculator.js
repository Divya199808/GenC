function calculateEMI(){
    var P=parseInt(document.getElementById("principalAmount").value);
    var r=parseInt(document.getElementById("interestRate").value);
    var N=parseInt(document.getElementById("tenure").value);
    var R=((r/100)/12);
    EMI = (P*R*(Math.pow((1+R),N)/((Math.pow((1+R),N))-1)));
    document.getElementById("result").innerText ="EMI is Rs."+EMI.toFixed(2);
    return false;
}
function Reset(){
    
    document.getElementById("principalAmount").value="";    
    document.getElementById("interestRate").value="";
    document.getElementById("tenure").value="";
    document.getElementById("result").innerHTML=" ";
}
