import React, { Component } from 'react';
import $ from 'jquery'
import './createUser'
import Axios from 'axios'

export class CreateUser extends Component {
    constructor(props) {
        super(props)
        this.state = {
            empId: '',
            empName: '',
            email: '',
            password: '',
            designation: '',
            isUpdate: false,
            show: false

        }
    }
    checkPass = () => {
        var pass = document.getElementById("password").value;
        var rpass = document.getElementById('password_confirmation').value;
        if (pass != rpass) {
            document.getElementById("submit").disabled = true;
            document.getElementById("alert").hidden = false;
            $('#message').html("Entered Password is not matching").css('font-size', '12px');
        } else {
            $('#message').html("");
            document.getElementById("alert").hidden = true;
            document.getElementById("submit").disabled = false;
        }
    }


    cancel(e) {
        e.preventDefault();
        this.props.history.push('/')
    }



    create(e) {
        e.preventDefault();

        Axios.post('http://localhost:8080/createUser', this.state)
            .then((response) => {
                console.log(" details" + this.state.empId)

                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    alert("User Created successfully Redirecting to loginPage")
                    this.props.history.push('/')

                } else {

                    this.pRef.current.style.visibility = "visible"
                }

            }).catch((error) => {
                this.setState({ show: true })
                console.log(error)
            })
    }
    render() {
        return (
            <div className="mainHeader">
                
                {this.state.show ? <div id="alert" class="alert alert-danger" role="alert">User Creation Failed email already exist </div> : null}
                <div className="adduser">
                    <div>
                        <div className="row col-lg-4 offset-4">
                            <div className="col-lg">
                                <div id="fillForm" className="card">
                                    <h5 id="chead" className="card-header ">
                                        <legend className="mx-auto " style={{ width: '115px' }}>User Form </legend>
                                    </h5>
                                    <div className="card-body">
                                        <p className="card-text">
                                        </p>
                                        <form role="form" onSubmit={this.create.bind(this)}>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100% ' }} className="input-group-text" id="basic-addon1">Name</span>
                                                </div>
                                                <input required="required" aria-describedby="basic-addon1" type="text" name="Name" id="Name" class="form-control input-lg" onChange={(event) => {
                                                    this.setState({
                                                        empName: event.target.value
                                                    })
                                                }} placeholder="Enter name of Employee" />
                                            </div>



                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100% ' }} className="input-group-text" id="basic-addon1">Email</span>
                                                </div>
                                                <input required="required" type="email" name="email" id="email" class="form-control input-lg" placeholder="Enter email address" onChange={(event) => {
                                                    this.setState({
                                                        email: event.target.value
                                                    })
                                                }} />
                                            </div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100% ' }} className="input-group-text" id="basic-addon1">Designation</span>
                                                </div>
                                                <input type="text" required="required" name="Designation" id="Designation" class="form-control input-lg" placeholder="Enter Designation" onChange={(event) => {
                                                    this.setState({
                                                        designation: event.target.value
                                                    })
                                                }} />
                                            </div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100% ' }} className="input-group-text" id="basic-addon1">Password</span>
                                                </div>
                                                <input type="password" name="password" id="password" onChange={(event) => {
                                                    this.setState({
                                                        password: event.target.value
                                                    })
                                                }} class="form-control input-lg" placeholder="Enter Password" required="required" />
                                            </div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '150px' }} className="input-group-text" id="basic-addon1">Confirm Password</span>
                                                </div>
                                                <input type="password" name="password_confirmation" id="password_confirmation" onKeyUp={this.checkPass.bind(this)} class="form-control input-lg" placeholder="Confirm Password" required />

                                            </div>
                                            <div style={{ textAlign: 'center' }}><div id="alert" style={{ marginBottom: '10px' }} class="alert alert-danger" role="alert" hidden="true"><h6 id="message"></h6> </div></div>


                                            <div className=" mx-auto" style={{ width: '233px', marginBottom: '20px' }}>
                                                <button type="reset" className="btn btn-outline-primary" style={{ marginRight: '10px' }}>Reset</button>
                                                <button id="submit" type="submit" className="btn btn-outline-success">Submit</button>
                                                <button type="cancel" style={{ marginTop: '-38px', width: '78px', marginLeft: '161px' }} onClick={this.cancel.bind(this)} class="btn btn-outline-info btn-block">Cancel</button>
                                            </div>
                                            <p />
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default CreateUser