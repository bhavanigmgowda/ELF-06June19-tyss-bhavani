function showPassword() {
    if (document.getElementById('pwd').type === 'password') {
        document.getElementById('pwd').type= "text";
    } else {
        document.getElementById('pwd').type= "password";
    }
   
}