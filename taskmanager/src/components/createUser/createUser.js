import React, { Component } from 'react';
import Form from 'react-bootstrap/Form'
import { Button } from 'react-bootstrap'
import Login from '../login/Login'

import './createUser.css'
import Axios from 'axios'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
class CreateUser extends Component {
    constructor(props) {
        super(props)
        this.state = {
            empId: '',
            empName: '',
            email: '',
            password: '',
            designation: '',
            isUpdate: false

        }
    }

    cancle(e) {
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
                    this.props.history.push('/')
                } else {
                    this.pRef.current.style.visibility = "visible"
                }

            }).catch((error) => {
                console.log(error)
            })

    }

    render() {
        return (
                <div className="cardtask col-md-4 col-md-offset-4">
                    <div className="cardheader">
                        <h3>CreateUser </h3>
                    </div>

<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		
			 			<div class="panel-body">
			    		<form role="form">
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			                <input type="text" name="Name" id="Name" class="form-control input-sm" onChange={(event) => {
                                            this.setState({
                                                empName: event.target.value
                                            })
                                        }}  placeholder="First Name"/>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="Emp ID" id="Emp ID" onChange={(event) => {
                                            this.setState({
                                                empId: event.target.value
                                            })
                                        }} class="form-control input-sm" placeholder=" Emp ID"/>
			    					</div>
			    				</div>
			    			</div>

			    			<div class="form-group">
			    				<input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address" onChange={(event) => {
                                            this.setState({
                                                email: event.target.value
                                            })
                                        }} />
			    			</div>
                            <div class="form-group">
			    				<input type="text" name="Designation" id="Designation" class="form-control input-sm" placeholder="Designation" onChange={(event) => {
                                        this.setState({
                                            designation: event.target.value
                                        })
                                    }}  />
			    			</div>

			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="password" id="password" onChange={(event) => {
                                        this.setState({
                                            password: event.target.value
                                        })
                                    }} class="form-control input-sm" placeholder="Password"/>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password"/>
			    					</div>
			    				</div>
			    			</div>
			    			
			    			<input type="submit" value="Register"  onClick={this.create.bind(this)} class="btn btn-info btn-block"/>
			    			<input type="cancel" value="cancel"  onClick={this.cancle.bind(this)} class="btn btn-info btn-block"/>
			    		
			    		</form>
			    	</div>
	    		</div>
    		</div>
    	</div>
    </div>
    </div>
  
  
                      
/* 
                <div className="carduser col-md-4 offset-4">
                    <h2 className="header-pos">USER DETAILS</h2>

                    <div className="add-det">





                        <Form >
                            <br />
                            <div  >

                                <div class="col-sm- my-1  ">


                                    <Form.Group >
                                        
                                        <Form.Control type="text" placeholder="Emp Id" onChange={(event) => {
                                            this.setState({
                                                empId: event.target.value
                                            })
                                        }} />
                                    </Form.Group>
                                </div>

                                <div class="col-sm- my-1">


                                    <Form.Group controlId="formBasicEmail">
                                        <Form.Control type="text" placeholder="Emp Name" onChange={(event) => {
                                            this.setState({
                                                empName: event.target.value
                                            })
                                        }} />
                                    </Form.Group>
                                </div></div>


                            <div class="col-sm- my-1">


                                <Form.Group controlId="formBasicPassword">

                                    <Form.Control type="text" placeholder="Email" onChange={(event) => {
                                        this.setState({
                                            email: event.target.value
                                        })
                                    }} />
                                </Form.Group>
                            </div>


                            <div class="col-sm- my-1">

                                <Form.Group controlId="formBasicEmail">
                                    <Form.Control type="password" placeholder="password" onChange={(event) => {
                                        this.setState({
                                            password: event.target.value
                                        })
                                    }} />
                                </Form.Group>
                            </div>



                            <div class="col-sm- my-1">


                                <Form.Group controlId="formBasicEmail">
                                    <Form.Control type="text" placeholder="designation" onChange={(event) => {
                                        this.setState({
                                            designation: event.target.value
                                        })
                                    }} />
                                </Form.Group>
                            </div>

<div className="form-group">
                        
                    </div>
                        </Form>
                        <Button className="submit-button" variant="primary" type="submit" onClick={this.create.bind(this)}>
                                Submit
                                 </Button>
                            <Button className="submit-button cancel" variant="primary" type="cancel" onClick={this.cancle.bind(this)}>
                                cancel
                    </Button>
                    </div>
                </div> */

        )
    }
}
export default CreateUser