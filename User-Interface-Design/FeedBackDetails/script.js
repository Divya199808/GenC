var arr = [];

function addFeedback(){

 var feedbackTextArea = document.getElementById("feedback");

 var result = document.getElementById("result");

 arr.push(feedbackTextArea.value);

 feedbackTextArea.value = " ";

 result.innerHTML = "<h2>Feedback Details</h2><br>Successfully Added Feedback Details!";

}



function displayFeedback(){

    var op = "<h2>Feedback Details</h2>";

    var lcv = 1;

    for(var element in arr){

        op += "Feedback "+lcv.toString()+"<br>" + arr[element] + "<br>";

        lcv++;

    }

    document.getElementById("result").innerHTML = op;

    arr = [];

}
