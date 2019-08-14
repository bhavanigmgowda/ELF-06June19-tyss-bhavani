<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Show Password</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
   <style>
            .form-size {
                height: 200px;
                width: 400px;
            }
            .margin-for-element {
                margin-top: 200px;
                margin-left: 600px;
            }
            .margin-bottom-input {
                margin-bottom: 40px;
            }
            #pwd:focus {
             outline: none;
            }
        </style>
</head>
<body>
    <div class="container margin-for-element">
    <h2>Login Page</h2>
    <br><br>
        <form class="form-size" action="http://localhost/emp/login" method="post">
            <input type="text" class="form-control margin-bottom-input" name="id" placeholder="Enter ID"/>
            <div class="form-control">
                <input type="password" name="password"  style="border: none !important;width:340px;" placeholder="Enter password"/>
                <span class="glyphicon glyphicon-eye-open" onclick="showPassword()"></span>
            </div>
            <br>
            <input type="submit" value="submit" class="btn btn-primary">
            <br><br>
            <div class="row">
                <button class="col-6 btn btn-primary">
                <a href="savedata.html" style="color: white !important">Create Account</a></button>
                <button  class="col-6 btn btn-primary">Forgot Password</button>
            </div>
        </form>
    </div>
    <script src = "Login.js"></script>
</body>
</html>
