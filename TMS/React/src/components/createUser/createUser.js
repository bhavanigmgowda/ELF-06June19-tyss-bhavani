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
        this.props.history.push('/homePage')
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
            <div >
                    <div className="carduser col-md-4 offset-4">
                        <h2 className="header-pos">USER DETAILS</h2>

                        <div className="add-det">
                            <Form >
<br/>
<div  >

                          <div class="col-sm- my-1 ">
                        <div class="input-group back">
                                <div class="input-group-prepend">
                            <div class="input-group-text createuser">Emp ID</div>
                          </div>
                                <Form.Group controlId="formBasicEmail">
                                    <Form.Control className="input-width" type="text" placeholder="Emp Id" onChange={(event) => {
                                        this.setState({
                                            empId: event.target.value
                                        })
                                    }} />
                                </Form.Group><br/><br/>
</div></div>
<br/>
<div class="col-sm- my-1">
                        <div class="input-group back">
                                <div class="input-group-prepend">
                            <div class="input-group-text createuser">Emp Name</div>
                          </div>
                                <Form.Group controlId="formBasicEmail">
                                    <Form.Control className="input-width" type="text" placeholder="Emp Name" onChange={(event) => {
                                        this.setState({
                                            empName: event.target.value
                                        })
                                    }} />
                                </Form.Group>
                                </div></div><br/>


                                <div class="col-sm- my-1">
                        <div class="input-group back">
                                <div class="input-group-prepend">
                            <div class="input-group-text createuser">Email</div>
                          </div>
                                <Form.Group controlId="formBasicPassword">

                                    <Form.Control className="input-width" type="text" placeholder="Email" onChange={(event) => {
                                        this.setState({
                                            email: event.target.value
                                        })
                                    }} />
                                </Form.Group>
                                </div></div><br/>
                                
                                
                            <div class="col-sm- my-1">
                        <div class="input-group back">
                                <div class="input-group-prepend">
                            <div class="input-group-text createuser">password</div>
                          </div>
                                <Form.Group controlId="formBasicEmail">
                                    <Form.Control className="input-width" type="password" placeholder="password" onChange={(event) => {
                                        this.setState({
                                            password: event.target.value
                                        })
                                    }} />
                                </Form.Group>
                                </div></div><br/> 
                                
                                
                                
                            <div class="col-sm- my-1">
                        <div class="input-group back">
                                <div class="input-group-prepend">
                            <div class="input-group-text createuser">Task ID</div>
                          </div>
                                <Form.Group controlId="formBasicEmail">
                                    <Form.Control className="input-width" type="text" placeholder="designation" onChange={(event) => {
                                        this.setState({
                                            designation: event.target.value
                                        })
                                    }} />
                                </Form.Group>
                                </div></div><br/>

                                </div>
                                <Button className="submit-button" variant="primary" type="submit" onClick={this.create.bind(this)}>
                                    Submit
                    </Button>
                                <Button className="submit-button cancel" variant="primary" type="cancel" onClick={this.cancle.bind(this)}>
                                    cancel
                    </Button>
                            </Form>
                        </div>
                    </div>
                
            </div>
        )
    }
}
export default CreateUser