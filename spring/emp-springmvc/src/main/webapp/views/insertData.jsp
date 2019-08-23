<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Employee</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<form action="./empSubmit" method="post">
<div style="background: lightgoldenrodyellow">
		<span> ${msg}
			<p class="h3" style="margin-left: 40%">EMPLOYEE INFORMATION</p>
			<hr>
			 <!-- 	EmployeeInfo-->
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">ID</label> <input type="text"
						class="form-control" placeholder="ID" name="id">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
						type="text" class="form-control" placeholder="ACCOUNT NUMBER"
						name="infoBean.accountNumber">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">NAME</label> <input type="text"
						class="form-control" placeholder="NAME" name="name">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">EMAIL ID</label> <input type="text"
						class="form-control" placeholder="EMAIL ID" name="email">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">AGE</label> <input type="text"
						class="form-control" placeholder="AGE" name="age">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">DESIGNATION</label> <input
						type="text" class="form-control" placeholder="DESIGNATION"
						name="designation">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputGender">Gender</label> <select id="inputGender"
						class="form-control" name="gender">
						<option selected>--select one--</option>
						<option value="male" name="gender">male</option>
						<option value="female" name="gender">female</option>
						<option value="other" name="gender">other</option>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputEmail1">Date of Birth</label> <input
						type="date" class="form-control" placeholder="dd-mm-yyyy"
						name="dob">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">SALARY</label> <input type="text"
						class="form-control" placeholder="SALARY" name="salary">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">DEPAETMENT ID</label> <input
						type="text" class="form-control" placeholder="DEPAETMENT ID"
						name="departmentId">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputEmail1">PHONE NUMBER</label> <input
						type="text" class="form-control" placeholder="PHONE NUMBER"
						name="phnum">
				</div>
				<div class="col">
					<label for="exampleInputEmail1">MANAGER ID</label> <input
						type="text" class="form-control" placeholder="MANAGER ID"
						name="managerId">
				</div>
			</div>
			<div class="row">

				<div class="col-6">
					<label for="exampleInputEmail1">JOINING DATE</label> <input
						type="date" class="form-control" placeholder="JOINING DATE"
						name="joiningDate">
				</div>
			</div>
			<div class="col-6">
				<label for="exampleInputEmail1">Password</label> <input
					type="password" class="form-control"
					placeholder="Enter The Password" name="password">
			</div>
			<div class="col-6">
				<label for="exampleInputEmail1">Confirm Password</label> <input
					type="password" class="form-control"
					placeholder="Enter The Confirm Password" name="confirm">
			</div>
			</div>
			</div> <!-- EMPLOYEE OTHER INFORMATION -->

			<p class="h3" style="margin-left: 40%">EMPLOYEE OTHER INFORMATION</p>
			<hr>
			<div class="row">
				<div class="col">
					<label for="exampleInputemergenum">Emergency Contact Number</label>
					<input type="text" class="form-control"
						placeholder="Please Enter Emergency Contact Number"
						name="empotherinfo.emergencyContactNumber">
				</div>
				<div class="col">
					<label for="exampleInputmotname">Mother Name</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Mother Name"
						name="empotherinfo.motherNm">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="exampleInputPan">Pan Number</label> <input type="text"
						class="form-control" placeholder="Please Enter Pan Number"
						name="empotherinfo.pan">
				</div>
				<div class="col">
					<label for="exampleInputemergeName">Emergency Contact
						Number</label> <input type="text" class="form-control"
						placeholder="Please Enter Emergency Contact Name"
						name="empotherinfo.emergencyContactNumber">
				</div>
				<div class="col">
					<label for="exampleInputspouse">Spouse Name</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Spouse Name"
						name="empotherinfo.spouseNm">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputStatus">Marital Status</label> <select
						id="inputStatus" class="form-control"
						name="empotherinfo.isMarried">
						<option selected>Married</option>
						<option value="married">Married</option>
						<option value="unmarried">Unmarried</option>
						<option value="divorcee">Divorcee</option>
					</select>
				</div>
				<div class="col">
					<label for="inputnationality">Nationality</label> <select
						id="inputnationality" class="form-control"
						name="empotherinfo.nationality">
						<option selected>---Select One---</option>
						<option value="indian">Indian</option>
						<option value="other">Other</option>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputpassport">Passport Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Passport Number"
						name="empotherinfo.passport">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputbloodgrp">Blood Group</label> <select
						id="inputbloodgrp" class="form-control"
						name="empotherinfo.bloodGroup">
						<option selected>---Select One---</option>
						<option value="AB+">AB+</option>
						<option value="AB-">AB-</option>
						<option value="A+">A+</option>
						<option value="A-">A-</option>
						<option value="o+">o+</option>
						<option value="o-">o-</option>
					</select>
				</div>
				<div class="col">
					<label for="inputreligion">Religion</label> <select
						id="inputreligion" class="form-control"
						name="empotherinfo.religion">
						<option selected>---Select One---</option>
						<option value="hindu">Hindu</option>
						<option value="christian">Christian</option>
						<option value="muslim">Muslim</option>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputaadhar">Aadhar Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Aadhar Number" name="empotherinfo.adhar">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="inputphysicallych">Physically Challnged</label> <select
						id="inputphysicallych" class="form-control"
						name="empotherinfo.isChallenged">
						<option selected>---Select One---</option>
						
						<option value="yes">Yes</option>
						<option value="no">No</option>
					</select>
				</div>
				<div class="col">
					<label for="exampleInputfather">Father Number</label> <input
						type="text" class="form-control"
						placeholder="Please Enter Father Number"
						name="empotherinfo.fatherNm">
				</div>
			</div>
			</div>
			</div> 
			<!-- EMPLOYEE ADDRESS INFORMATION 1 -->
			</div>
			<h4 class="text-center border-bottom">EMPLOYEE ADDRESS
				INFORMATION</h4>

			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Address Type</label> <input
						type="text" class="form-control" id="inputPassword4"
						placeholder="Enter Address Type"
						name="addressInfobean[0].empPK.addresType">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">City</label> <input type="text"
						class="form-control" id="inputPassword4" placeholder="Enter City"
						name="addressInfobean[0].city">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputPassword4"> State</label> <input type="text"
						class="form-control" id="inputPassword4" placeholder="Enter State"
						name="addressInfobean[0].state">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address1</label> <input type="text"
						class="form-control" id="inputEmail4" placeholder="Enter Address1"
						name="addressInfobean[0].address1">
				</div>
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address2</label> <input type="text"
						class="form-control" id="inputEmail4" placeholder="Enter Address2"
						name="addressInfobean[0].address2">
				</div>
			</div>
			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Country</label> <input type="text"
						class="form-control" id="inputPassword4"
						placeholder="Enter Country" name="addressInfobean[0].country">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Pincode</label> <input type="text"
						class="form-control" id="inputPassword4"
						placeholder="Enter Pincode" name="addressInfobean[0].pincode">
				</div>
			</div>


			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">LandMark </label> <input type="text"
						class="form-control" id="inputEmail4"
						placeholder="Enter Address LandMark"
						name="addressInfobean[0].landmark">
				</div>

			</div>
			</div>
			</div> <!-- EMPLOYEE ADDRESS INFORMATION 2-->

			<h4 class="text-center border-bottom">EMPLOYEE ADDRESS
				INFORMATION</h4>

			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Address Type</label> <input
						type="text" class="form-control" id="inputPassword4"
						placeholder="Enter Address Type"
						name="addressInfobean[1].empPK.addresType">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">City</label> <input type="text"
						class="form-control" id="inputPassword4" placeholder="Enter City"
						name="addressInfobean[1].city">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputPassword4"> State</label> <input type="text"
						class="form-control" id="inputPassword4" placeholder="Enter State"
						name="addressInfobean[1].state">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address1</label> <input type="text"
						class="form-control" id="inputEmail4" placeholder="Enter Address1"
						name="addressInfobean[1].address1">
				</div>
				<div class="form-group col-md-6">
					<label for="inputEmail4">Address2</label> <input type="text"
						class="form-control" id="inputEmail4" placeholder="Enter Address2"
						name="addressInfobean[1].address2">
				</div>
			</div>
			<div class="form-row">

				<div class="form-group col-md-6">
					<label for="inputPassword4">Country</label> <input type="text"
						class="form-control" id="inputPassword4"
						placeholder="Enter Country" name="addressInfobean[1].country">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Pincode</label> <input type="password"
						class="form-control" id="inputPassword4"
						placeholder="Enter Pincode" name="addressInfobean[1].pincode">
				</div>
			</div>


			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">LandMark </label> <input type="text"
						class="form-control" id="inputEmail4"
						placeholder="Enter Address LandMark"
						name="addressInfobean[1].landmark">
				</div>

			</div>
			</div> <i class="fa fa-twitter-square"></i>
			<h4 class="text-center border-bottom">Educational Details</h4>

			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Educational Type</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername"
						placeholder="Enter Educational Type"
						name="eduInfobean[0].eduPk.educationType">
				</div>


				<div class="col-sm- my-1">
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">Degree Type</div>
						</div>
						<input type="text" class="form-control"
							id="inlineFormInputGroupUsername" placeholder="Enter Degree Type"
							name="eduInfobean[0].degreeType">
					</div>
				</div>

				<div class="col-sm- my-1">
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">Branch</div>
						</div>
						<input type="text" class="form-control"
							id="inlineFormInputGroupUsername"
							placeholder="Enter Degree Branch" name="eduInfobean[0].branch">
					</div>
				</div>
			</div>
	<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">College Name</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername" placeholder="Enter College Name"
						name="eduInfobean[0].collageNm">
				</div>
			</div>
			</div>
			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">University</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername"
						placeholder="Enter University Name"
						name="eduInfobean[0].university">
				</div>
			</div>
			</div> <br>
			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Year of Passing</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
						name="eduInfobean[0].yop">
				</div>
			</div>
			</div> <br>
			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Percentage</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername" placeholder="Enter Percentage"
						name="eduInfobean[0].percentage">
				</div>
			</div>
			</div> <br>
			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Location</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername"
						placeholder="Enter college Location"
						name="eduInfobean[0].location">
				</div>
			</div>
			</div> <br> <!-- Educational Details --> <i
			class="fa fa-twitter-square"></i>
			<h4 class="text-center border-bottom">Educational Details</h4>
			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Educational Type</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername"
						placeholder="Enter Educational Type"
						name="eduInfobean[1].eduPk.educationType">
				</div>
				<br>
				<div class="col-sm- my-1">
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">Degree Type</div>
						</div>
						<input type="text" class="form-control"
							id="inlineFormInputGroupUsername" placeholder="Enter Degree Type"
							name="eduInfobean[1].degreeType">
					</div>
					<br>
					<div class="col-sm- my-1">
						<div class="input-group">
							<div class="input-group-prepend">
								<div class="input-group-text">Branch</div>
							</div>
							<input type="text" class="form-control"
								id="inlineFormInputGroupUsername"
								placeholder="Enter Degree Branch" name="eduInfobean[1].branch">
						</div>
						<br>


						<div class="col-sm- my-1">
							<div class="input-group">
								<div class="input-group-prepend">
									<div class="input-group-text">College Name</div>
								</div>
								<input type="text" class="form-control"
									id="inlineFormInputGroupUsername"
									placeholder="Enter College Name"
									name="eduInfobean[1].collageNm">
							</div>
							<br>


							<div class="col-sm- my-1">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">University</div>
									</div>
									<input type="text" class="form-control"
										id="inlineFormInputGroupUsername"
										placeholder="Enter University Name"
										name="eduInfobean[1].university">
								</div>
								<br>


								<div class="col-sm- my-1">
									<div class="input-group">
										<div class="input-group-prepend">
											<div class="input-group-text">Year of Passing</div>
										</div>
										<input type="text" class="form-control"
											id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
											name="eduInfobean[1].yop">
									</div>
									<br>

									<div class="col-sm- my-1">
										<div class="input-group">
											<div class="input-group-prepend">
												<div class="input-group-text">Percentage</div>
											</div>
											<input type="text" class="form-control"
												id="inlineFormInputGroupUsername"
												placeholder="Enter Percentage"
												name="eduInfobean[1].percentage">
										</div>
										<br>

										<div class="col-sm- my-1">
											<div class="input-group">
												<div class="input-group-prepend">
													<div class="input-group-text">Location</div>
												</div>
												<input type="text" class="form-control"
													id="inlineFormInputGroupUsername"
													placeholder="Enter college Location"
													name="eduInfobean[1].location">
											</div>
											<br>
										</div>
									</div>
								</div>
							</div>


							<i class="fa fa-twitter-square"></i>

							<h4 class="text-center border-bottom">Employee Experience
								Details</h4>

							<div class="col-sm- my-1">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">Company Name</div>
									</div>
									<input type="text" class="form-control"
										id="inlineFormInputGroupUsername"
										placeholder="Enter Company Name"
										name="expInfobean[0].empExp.companyNm">
								</div>
								<br>

								<div class="col-sm- my-1">
									<div class="input-group">
										<div class="input-group-prepend">
											<div class="input-group-text">Designation</div>
										</div>
										<input type="text" class="form-control"
											id="inlineFormInputGroupUsername"
											placeholder="Enter Designation"
											name="expInfobean[0].designation">
									</div>
									<br>

									<div class="col-sm- my-1">
										<div class="input-group">
											<div class="input-group-prepend">
												<div class="input-group-text">Joining Date</div>
											</div>
											<input type="text" class="form-control"
												id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
												name="expInfobean[0].joinimgDate">
										</div>
										<br>


										<div class="col-sm- my-1">
											<div class="input-group">
												<div class="input-group-prepend">
													<div class="input-group-text">Leaving Date</div>
												</div>
												<input type="text" class="form-control"
													id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
													name="expInfobean[0].leavingDate">
											</div>
											<br>


										</div>
									</div>

									<!-- 	Employee Experience Details	 -->


									<i class="fa fa-twitter-square"></i>

									<h4 class="text-center border-bottom">Employee Experience
										Details</h4>


									<div class="col-sm- my-1">
										<div class="input-group">
											<div class="input-group-prepend">
												<div class="input-group-text">Company Name</div>
											</div>
											<input type="text" class="form-control"
												id="inlineFormInputGroupUsername"
												placeholder="Enter Company Name"
												name="expInfobean[1].empExp.companyNm">
										</div>
										<br>

										<div class="col-sm- my-1">
											<div class="input-group">
												<div class="input-group-prepend">
													<div class="input-group-text">Designation</div>
												</div>
												<input type="text" class="form-control"
													id="inlineFormInputGroupUsername"
													placeholder="Enter Designation"
													name="expInfobean[1].designation">
											</div>
											<br>

											<div class="col-sm- my-1">
												<div class="input-group">
													<div class="input-group-prepend">
														<div class="input-group-text">Joining Date</div>
													</div>
													<input type="text" class="form-control"
														id="inlineFormInputGroupUsername" placeholder="dd-mm-yyyy"
														name="expInfobean[1].joinimgDate">
												</div>
												<br>


												<div class="col-sm- my-1">
													<div class="input-group">
														<div class="input-group-prepend">
															<div class="input-group-text">Leaving Date</div>
														</div>
														<input type="text" class="form-control"
															id="inlineFormInputGroupUsername"
															placeholder="dd-mm-yyyy"
															name="expInfobean[1].leavingDate">
													</div>
													<br>

												</div>
											</div>
											<div class="row" style="margin-left: 250px">
												<div class="col-3">
													<br>
													<button type="submit" class="form-control">
														Submit</button>

												</div>
												<div class="col-3">
													<br>
													<button type="reset" class="form-control">Reset</button>
												</div>
											</div>
		</span>
	</form>

</body>
</html>