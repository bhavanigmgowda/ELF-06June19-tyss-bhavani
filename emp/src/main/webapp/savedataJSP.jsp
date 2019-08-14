<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</head>
<body style="background: lightgoldenrodyellow">

	<p class="h3" style="margin-left: 40%">EMPLOYEE INFORMATION</p>
	<hr>
<form action="http://localhost/emp/save" method="post">
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">ID</label> <input type="text"
					class="form-control" placeholder="ID" name="id">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
					type="text" class="form-control" placeholder="ACCOUNT NUMBER"  name="accnumber">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">NAME</label> <input type="text"
					class="form-control" placeholder="NAME"  name="name">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">EMAIL ID</label> <input type="text"
					class="form-control" placeholder="EMAIL ID"  name="email">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">AGE</label>
				 <input type="text"	class="form-control" placeholder="AGE"  name="age">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DESIGNATION</label> <input
					type="text" class="form-control" placeholder="DESIGNATION"  name="designation">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputGender">Gender</label> <select id="inputGender"
					class="form-control"  name="gender">
					<option selected>--select one--</option>
					<option value="male" name="gender">male</option>
					<option value="female" name="gender" >female</option>
					<option value="other" name="gender">other</option>
				</select>
			</div>
			<div class="col">
				<label for="exampleInputEmail1">Date of Birth</label> <input
					type="date" class="form-control" placeholder="dd-mm-yyyy"  name="dob">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">SALARY</label> <input type="text"
					class="form-control" placeholder="SALARY"  name="salary">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">DEPAETMENT ID</label> <input
					type="text" class="form-control" placeholder="DEPAETMENT ID"  name="deptid">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputEmail1">PHONE NUMBER</label> <input
					type="text" class="form-control" placeholder="PHONE NUMBER"  name="phnum">
			</div>
			<div class="col">
				<label for="exampleInputEmail1">MANAGER ID</label> <input
					type="text" class="form-control" placeholder="MANAGER ID"  name="mgrid">
			</div>
		</div>
		<div class="row">

			<div class="col-6">
				<label for="exampleInputEmail1">JOINING DATE</label> <input
					type="date" class="form-control" placeholder="JOINING DATE"  name="doj">
			</div>
		</div>
      <div class="col-6">
        <label for="exampleInputEmail1">Password</label>
        <input type="password" class="form-control" placeholder="Enter The Password" name="password">
      </div>
      <div class="col-6">
        <label for="exampleInputEmail1">Confirm Password</label>
        <input type="password" class="form-control" placeholder="Enter The Confirm Password" name="confirm">
      </div>
     
          <div class="row" style="margin-left: 250px">
      <div class="col-3">
        <br>
        <button type="submit" class="form-control"> Submit</button>

      </div>
      <div class="col-3">
        <br>
        <button type="reset" class="form-control">Reset</button>
      </div>
	</div>


  </form>
</body>
</html>