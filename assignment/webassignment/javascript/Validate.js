function showPassword() {
    if (document.getElementById('pwd').type === 'password') {
        document.getElementById('pwd').type= "text";
    } else {
        document.getElementById('pwd').type= "password";
    }
}
function showConfirmPassword() {
    if (document.getElementById('confirm').type === 'password') {
        document.getElementById('confirm').type= "text";
    } else {
        document.getElementById('confirm').type= "password";
    }
   
}
var isMailValid = false;
var isPassValid = false;

function checkEmail() {
    let mail =  document.forms[0].email.value;
    var res = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail);
    if(mail == "" || mail.length <=6 || !res) {
        document.getElementById('invalidEmail').style.visibility="visible";
        isMailValid = false;
    } else {
        document.getElementById('invalidEmail').style.visibility="hidden";
        isMailValid = true;
    }
    enableSubmit();
}

function checkPassword() {
    let p1 = document.forms[0].password.value;
    let p2 = document.forms[0].confirm.value;
   
    if (p1.length >= 6 && p1 === p2) {
        document.getElementById('invalidPwd').style.visibility="hidden"
        isPassValid = true;
    } else {
        document.getElementById('invalidPwd').style.visibility="visible"
        isPassValid = false;
    }
    enableSubmit();
}
function enableSubmit() {
    console.log(isMailValid+ " " +isPassValid);
    if(isMailValid && isPassValid) {
        document.getElementById('submitButton').disabled = false;
    } else {
        document.getElementById('submitButton').disabled = true;
    }
}