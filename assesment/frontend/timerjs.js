    
//called on click of start
function startTimer() {
    var min = document.getElementById("minutes");
    var sec = document.getElementById("seconds");
    var totalSeconds = 0;
    var uTime = document.getElementById("userTime").value;
    //converting user input time to seconds
    var totalTime = uTime * 60;
        setInterval(function setTime() {
            if(totalSeconds <= totalTime-1) {
                ++totalSeconds;
                sec.innerHTML = pad(totalSeconds % 60);
                min.innerHTML = pad(parseInt(totalSeconds / 60));
            }
        }, 1000);
}
//stop the time
function pad(val) {
  var valString = val + "";
  if (valString.length < 2) {
    return "0" + valString;
  } else {
    return valString;
  }
}
