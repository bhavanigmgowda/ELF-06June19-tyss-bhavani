<!DOCTYPE html>
<%@page import="com.tyss.emp.dto.EmployeeExperinceInfoBean"%>
<%@page import="com.tyss.emp.dto.EmployeeEducationInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.tyss.emp.dto.EmployeeAddresInfoBean"%>
<%@page import="com.tyss.emp.dto.EmployeeInfoBean"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<form action="./Submit" method="post">
		<div style="background: lightgoldenrodyellow">
			<%EmployeeInfoBean infoBean=(EmployeeInfoBean)session.getAttribute("bean"); %>
			<span> ${msg}
				<p class="h3" style="margin-left: 40%">EMPLOYEE INFORMATION</p>
				<hr> <!-- 	EmployeeInfo-->
				<div class="row">
					<div class="col">
						<label for="exampleInputEmail1">ID</label> <input type="text"
							class="form-control" value="<%=infoBean.getId()%>" name="id">
					</div>
					<div class="col">
						<label for="exampleInputEmail1">ACCOUNT NUMBER</label> <input
							type="text" class="form-control" placeholder="ACCOUNT NUMBER"
							value="<%=infoBean.getAccountNumber()%>" name="accountNumber">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="exampleInputEmail1">NAME</label> <input type="text"
							class="form-control" value="<%=infoBean.getName()%>" name="name">
					</div>
					<div class="col">
						<label for="exampleInputEmail1">EMAIL ID</label> <input
							type="text" class="form-control" value="<%=infoBean.getEmail()%>"
							name="email">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="exampleInputEmail1">AGE</label> <input type="text"
							class="form-control" value="<%=infoBean.getAge()%>" name="age">
					</div>
					<div class="col">
						<label for="exampleInputEmail1">DESIGNATION</label> <input
							type="text" class="form-control"
							value="<%=infoBean.getDesignation()%>" name="designation">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="inputGender">Gender</label> <select id="inputGender"
							class="form-control" name="gender" value="<%=infoBean.getId() %>">
							<%if(infoBean.getGender().equals("male")){ %>
							<option value="male" name="gender" selected="selected">male</option>
							<option value="male" name="gender">female</option>
							<% } else {%>
							<option value="male" name="gender">male</option>
							<option value="male" name="gender" selected="selected">female</option>
							<%} %>
						</select>
					</div>
					<div class="col">
						<label for="exampleInputEmail1">Date of Birth</label> <input
							type="date" class="form-control" value="<%=infoBean.getDob()%>"
							name="dob">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="exampleInputEmail1">SALARY</label> <input type="text"
							class="form-control" value="<%=infoBean.getSalary()%>"
							name="salary">
					</div>
					<div class="col">
						<label for="exampleInputEmail1">DEPAETMENT ID</label> <input
							type="text" class="form-control"
							value="<%=infoBean.getDepartmentId()%>" name="departmentId">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="exampleInputEmail1">PHONE NUMBER</label> <input
							type="text" class="form-control" value="<%=infoBean.getDob()%>"
							name="phnum">
					</div>
					<div class="col">
						<label for="exampleInputEmail1">MANAGER ID</label> <input
							type="text" class="form-control"
							value="<%=infoBean.getManagerId()%>" name="id">
					</div>
				</div>
				<div class="row">

					<div class="col-6">
						<label for="exampleInputEmail1">JOINING DATE</label> <input
							type="date" class="form-control"
							value="<%=infoBean.getJoiningDate()%>"
							name="infoBean.joiningDate">
					</div>
				</div>
				<div class="col-6">
					<label for="exampleInputEmail1">Password</label> <input
						type="password" class="form-control"
						value="<%=infoBean.getPassword()%>" name="infoBean.password">
				</div>
				<div class="col-6">
					<label for="exampleInputEmail1">Confirm Password</label> <input
						type="password" class="form-control"
						placeholder="Enter The Confirm Password" name="infoBean.confirm">
				</div>
		</div>
		</div>


		<!-- EMPLOYEE OTHER INFORMATION -->

		<p class="h3" style="margin-left: 40%">EMPLOYEE OTHER INFORMATION</p>
		<hr>
		<div class="row">
			<div class="col">
				<label for="exampleInputemergenum">Emergency Contact Number</label>
				<input type="text" class="form-control"
					value="<%=infoBean.getOtherInfo().getEmergencyContactNumber()%>"
					name="empotherinfo.emergencyContactNumber">
			</div>
			<div class="col">
				<label for="exampleInputmotname">Mother Name</label> <input
					type="text" class="form-control"
					value="<%=infoBean.getOtherInfo().getMotherNm()%>"
					name="empotherinfo.motherNm">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="exampleInputPan">Pan Number</label> <input type="text"
					class="form-control"
					value="<%=infoBean.getOtherInfo().getMotherNm()%>"
					name="empotherinfo.pan">
			</div>
			<div class="col">
				<label for="exampleInputemergeName">Emergency Contact Number</label>
				<input type="text" class="form-control"
					value="<%=infoBean.getOtherInfo().getEmergencyContactNumber()%>"
					name="empotherinfo.emergencyContactNumber">
			</div>
			<div class="col">
				<label for="exampleInputspouse">Spouse Name</label> <input
					type="text" class="form-control"
					value="<%=infoBean.getOtherInfo().getSpouseNm()%>"
					name="empotherinfo.spouseNm">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputStatus">Marital Status</label> <select
					id="inputStatus" class="form-control" name="empotherinfo.isMarried">
					<%if(infoBean.getOtherInfo().getIsMarried().equals("Married")){ %>
					<option value="married" selected="selected">Married</option>
					<option value="unmarried">Unmarried</option>
					<% } else {%>
					<option value="married">Married</option>
					<option value="unmarried" selected="selected">Unmarried</option>
					<%} %>
				</select>
			</div>
			<div class="col">
				<label for="inputnationality">Nationality</label> <select
					id="inputnationality" class="form-control"
					name="empotherinfo.nationality">
					<%if(infoBean.getOtherInfo().getNationality().equals("Indian")){ %>
					<option value="indian" selected="selected">Indian</option>
					<option value="other">Other</option>
					<% } else {%>
					<option value="indian">Indian</option>
					<option value="other" selected="selected">Other</option>
					<%} %>
				</select>
			</div>
			<div class="col">
				<label for="exampleInputpassport">Passport Number</label> <input
					type="text" class="form-control"
					value="<%=infoBean.getOtherInfo().getPassport()%>"
					name="empotherinfo.passport">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputbloodgrp">Blood Group</label> <select
					id="inputbloodgrp" class="form-control"
					name="empotherinfo.bloodGroup">
					<%switch(infoBean.getOtherInfo().getBloodGroup()){
						case "AB+": %>
					<option value="AB+" selected="selected">AB+</option>
					<option value="AB-">AB-</option>
					<option value="A+">A+</option>
					<option value="A-">A-</option>
					<option value="o+">o+</option>
					<option value="o-">o-</option>
					<%break; 
							case "AB-": %>
					<option value="AB+">AB+</option>
					<option value="AB-" selected="selected">AB-</option>
					<option value="A+">A+</option>
					<option value="A-">A-</option>
					<option value="o+">o+</option>
					<option value="o-">o-</option>
					<%break;
							case "A+": %>
					<option value="AB+">AB+</option>
					<option value="AB-">AB-</option>
					<option value="A+" selected="selected">A+</option>
					<option value="A-">A-</option>
					<option value="o+">o+</option>
					<option value="o-">o-</option>
					<%break;
							case "A-": %>
					<option value="AB+">AB+</option>
					<option value="AB-">AB-</option>
					<option value="A+">A+</option>
					<option value="A-" selected="selected">A-</option>
					<option value="o+">o+</option>
					<option value="o-">o-</option>
					<%break;
							case "o+": %>
					<option value="AB+">AB+</option>
					<option value="AB-">AB-</option>
					<option value="A+">A+</option>
					<option value="A-">A-</option>
					<option value="o+" selected="selected">o+</option>
					<option value="o-">o-</option>
					<%break;
							case "o-": %>
					<option value="AB+">AB+</option>
					<option value="AB-">AB-</option>
					<option value="A+">A+</option>
					<option value="A-">A-</option>
					<option value="o+">o+</option>
					<option value="o-" selected="selected">o-</option>
					<%break;%>
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
					value="<%=infoBean.getOtherInfo().getAdhar()%>"
					name="empotherinfo.adhar">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label for="inputphysicallych">Physically Challnged</label> <select
					id="inputphysicallych" class="form-control"
					name="empotherinfo.isChallenged">

					<option value="yes" selected="selected">Yes</option>
					<option value="no">No</option>
				</select>
			</div>
			<div class="col">
				<label for="exampleInputfather">Father Number</label> <input
					type="text" class="form-control"
					value="<%=infoBean.getOtherInfo().getFatherNm()%>"
					name="empotherinfo.fatherNm">
			</div>
		</div>
		</div>
		</div>


		<!-- EMPLOYEE ADDRESS INFORMATION 1 -->
		</div>
		<% 
		List<EmployeeAddresInfoBean> addresInfoBeans=infoBean.getAddressInfobean();
						int i=0;
						for(EmployeeAddresInfoBean addresInfoBean:addresInfoBeans){
						
						
		 %>
		<h4 class="text-center border-bottom">EMPLOYEE ADDRESS
			INFORMATION</h4>

		<div class="form-row">

			<div class="form-group col-md-6">
				<label for="inputPassword4">Address Type</label> <input type="text"
					class="form-control" id="inputPassword4"
					value="<%=addresInfoBean.getEmpPK().getAddresType()%>"
					name="addressInfobean[<%=i%>].empPK.addresType">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">City</label> <input type="text"
					class="form-control" id="inputPassword4" placeholder="Enter City"
					value="<%=addresInfoBean.getCity()%>
					name=" addressInfobean[
					<%=i%>].city">
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputPassword4"> State</label> <input type="text"
					class="form-control" id="inputPassword4"
					value="<%=addresInfoBean.getState()%>
					name=" addressInfobean[
					<%=i%>].state">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Address1</label> <input type="text"
					class="form-control" id="inputEmail4"
					value="<%=addresInfoBean.getAddress1()%>
					name="
					addressInfobean[ <%=i%>].address1">
			</div>
			<div class="form-group col-md-6">
				<label for="inputEmail4">Address2</label> <input type="text"
					class="form-control" id="inputEmail4" placeholder="Enter Address2"
					value="<%=addresInfoBean.getAddress2()%>
					name="
					addressInfobean[ <%=i%>].address2">
			</div>
		</div>
		<div class="form-row">

			<div class="form-group col-md-6">
				<label for="inputPassword4">Country</label> <input type="text"
					class="form-control" id="inputPassword4"
					value="<%=addresInfoBean.getCountry()%> name=" addressInfobean[
					<%=i%>].country">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Pincode</label> <input type="text"
					class="form-control" id="inputPassword4"
					value="<%=addresInfoBean.getPincode()%> name=" addressInfobean[
					<%=i%>].pincode">
			</div>
		</div>


		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">LandMark </label> <input type="text"
					class="form-control" id="inputEmail4"
					value="<%=addresInfoBean.getLandmark()%>
					name="
					addressInfobean[ <%=i%>].landmark">
			</div>

		</div>
		</div>
		</div>
		<% i++;
		} %>


		<% 
		List<EmployeeEducationInfoBean> educationInfoBeans=infoBean.getEduInfobean();
						int i=0;
						for(EmployeeEducationInfoBean educationInfoBean:educationInfoBeans){
						
						
		 %>
		<!-- Educational Details -->
		<i class="fa fa-twitter-square"></i>
		<h4 class="text-center border-bottom">Educational Details</h4>
		<div class="col-sm- my-1">
			<div class="input-group">
				<div class="input-group-prepend">
					<div class="input-group-text">Educational Type</div>
				</div>
				<input type="text" class="form-control"
					id="inlineFormInputGroupUsername"
					value="<%=educationInfoBean.getEduPk().getEducationType()%>
					name="
					eduInfobean[ <%=i%>].eduPk.educationType">
			</div>
			<br>
			<div class="col-sm- my-1">
				<div class="input-group">
					<div class="input-group-prepend">
						<div class="input-group-text">Degree Type</div>
					</div>
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername"
						value="<%=educationInfoBean.getDegreeType()%>
						name="
						eduInfobean[ <%=i%>].degreeType">
				</div>
				<br>
				<div class="col-sm- my-1">
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">Branch</div>
						</div>
						<input type="text" class="form-control"
							id="inlineFormInputGroupUsername"
							value="<%=educationInfoBean.getBranch()%> name=" eduInfobean[
							<%=i%>].branch">
					</div>
					<br>


					<div class="col-sm- my-1">
						<div class="input-group">
							<div class="input-group-prepend">
								<div class="input-group-text">College Name</div>
							</div>
							<input type="text" class="form-control"
								id="inlineFormInputGroupUsername"
								value="<%=educationInfoBean.getCollageNm()%> name=" eduInfobean[
								<%=i%>].collageNm">
						</div>
						<br>


						<div class="col-sm- my-1">
							<div class="input-group">
								<div class="input-group-prepend">
									<div class="input-group-text">University</div>
								</div>
								<input type="text" class="form-control"
									id="inlineFormInputGroupUsername"
									value="<%=educationInfoBean.getUniversity()%>
									name="
									eduInfobean[ <%=i%>].university">
							</div>
							<br>


							<div class="col-sm- my-1">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">Year of Passing</div>
									</div>
									<input type="text" class="form-control"
										id="inlineFormInputGroupUsername"
										value="<%=educationInfoBean.getYop()%>
										name="
										eduInfobean[ <%=i%>].yop">
								</div>
								<br>

								<div class="col-sm- my-1">
									<div class="input-group">
										<div class="input-group-prepend">
											<div class="input-group-text">Percentage</div>
										</div>
										<input type="text" class="form-control"
											id="inlineFormInputGroupUsername"
											value="<%=educationInfoBean.getPercentage()%>
											name="
											eduInfobean[ <%=i%>].percentage">
									</div>
									<br>

									<div class="col-sm- my-1">
										<div class="input-group">
											<div class="input-group-prepend">
												<div class="input-group-text">Location</div>
											</div>
											<input type="text" class="form-control"
												id="inlineFormInputGroupUsername"
												value="<%=educationInfoBean.getLocation()%>
												name="
												eduInfobean[ <%=i%>].location">
										</div>
										<br>
									</div>
								</div>
							</div>
						</div>
<% i++; }  %>
						<% 
		List<EmployeeExperinceInfoBean> employeeExperinceInfoBeans=infoBean.getExpInfobean();
						int i=0;
						for(EmployeeExperinceInfoBean employeeExperinceInfoBean:employeeExperinceInfoBeans){
						
						
		 %>
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
									value="<%=employeeExperinceInfoBean.getEmpExp().getCompanyNm()%>
									name="
									expInfobean[ <%=i%>].empExp.companyNm">
							</div>
							<br>

							<div class="col-sm- my-1">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">Designation</div>
									</div>
									<input type="text" class="form-control"
										id="inlineFormInputGroupUsername"
										value="<%=employeeExperinceInfoBean.getDesignation()%>
										name="
										expInfobean[ <%=i%>].designation">
								</div>
								<br>

								<div class="col-sm- my-1">
									<div class="input-group">
										<div class="input-group-prepend">
											<div class="input-group-text">Joining Date</div>
										</div>
										<input type="text" class="form-control"
											id="inlineFormInputGroupUsername"
											value="<%=employeeExperinceInfoBean.getJoinimgDate()%>
											name="
											expInfobean[ <%=i%>].joinimgDate">
									</div>
									<br>


									<div class="col-sm- my-1">
										<div class="input-group">
											<div class="input-group-prepend">
												<div class="input-group-text">Leaving Date</div>
											</div>
											<input type="text" class="form-control"
												id="inlineFormInputGroupUsername"
												value="<%=employeeExperinceInfoBean.getLeavingDate()%>
												name="
												expInfobean[ <%=i%>].leavingDate">
										</div>
										<br>


									</div>
								</div>


								<div class="row" style="margin-left: 250px">
									<div class="col-3">
										<br>
										<button type="submit" class="form-control">Submit</button>

									</div>
									<div class="col-3">
										<br>
										<button type="reset" class="form-control">Reset</button>
									</div>
								</div>
								<%i++;} %>
								</span>
								
	</form>

</body>
</html>