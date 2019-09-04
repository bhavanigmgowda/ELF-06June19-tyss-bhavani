import React, { Component } from 'react';
/* import Navbar from '../navbar/Navbar'
 */import Form from 'react-bootstrap/Form'
import Dropdown from 'react-bootstrap/Dropdown'
import { Button } from 'react-bootstrap'
import Login from '../login/Login'

import './CreateTask.css'
import Axios from 'axios'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
class CreateTask extends Component {
    constructor(props) {
        super(props)
        this.state = {
            taskId: '',
            description: '',
            email: '',
            subject: '',
            priority: '',
            assignDate: '',
            assignedTo: '',
            status: '',
            endDate: '',
            userBean: JSON.parse(window.localStorage.getItem('beans')),

        }
    }

    cancle(e) {
        e.preventDefault();
        this.props.history.push('/homePage')
    }
    create(e) {
        e.preventDefault();
        console.log(this.state.taskId);

        console.log(this.state.description);
        console.log(this.state.email);
        console.log(this.state.subject);
        console.log(this.state.priority);


        console.log(" details" + this.state.taskId)


        console.log(this.state.userBean);
        Axios.post('http://localhost:8080/task/createTask', this.state)
            .then((response) => {
                console.log("book details" + this.state.taskId)

                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    this.props.history.push('/homePage')

                } else if (response.data.statusCode === 501) {
                    //this.props.history.push('/')

                } else {
                    this.pRef.current.style.visibility = "visible"
                }

            }).catch((error) => {
                console.log(error)
            })

    }
    userBeanSet(event) {

    }
    render() {
        return (
            <div >
                {/*  <Navbar /> */}
                <div className="back" >
                    <div className="carduser col-md-4 offset-4" >
                        <h2 className="header-pos">ADD TASK</h2>

                        <div className="add-det">
                            <Form >


                                <div class="col-sm- my-1">
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">Task ID</div>
                                        </div>
                                        <Form.Group controlId="formBasicEmail">
                                            <Form.Control className="input-width" type="text" placeholder="Task Id" onChange={(event) => {
                                                this.setState({
                                                    taskId: event.target.value
                                                })
                                            }} />
                                        </Form.Group>

                                    </div>
                                </div>


                                <div class="col-sm- my-1">
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">Email</div>
                                        </div>
                                        <Form.Group controlId="formBasicPassword">

                                            <Form.Control className="input-width" type="text" placeholder="email" onChange={(event) => {
                                                this.setState({
                                                    email: event.target.value
                                                })
                                            }} />
                                        </Form.Group>

                                    </div>
                                </div>

                                <div class="col-sm- my-1">
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">Subject</div>
                                        </div>
                                        <Form.Group controlId="formBasicEmail">
                                            <Form.Control className="input-width" type="text" placeholder="subject" onChange={(event) => {
                                                this.setState({
                                                    subject: event.target.value
                                                })
                                            }} />
                                        </Form.Group>

                                    </div>
                                </div>

                                <div class="col-sm- my-1">
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">description</div>
                                        </div>
                                        <Form.Group controlId="formBasicEmail">
                                            <textarea className="input-width " type="text" placeholder="description" onChange={(event) => {
                                                this.setState({
                                                    description: event.target.value
                                                })
                                            }} />
                                        </Form.Group>

                                    </div>
                                </div>

                                <div class="col-sm- my-1">
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            
                            <div class="input-group-text">Priority</div>
                                        </div>
                                        <select name="dropdown" onChange={(event) => {
                                            this.setState({
                                                priority: event.target.value
                                            })
                                        }}>
                                            <option value="high" selected>High</option>
                                            <option value="intermediate">Intermediate</option>
                                            <option value="low">Low</option>
                                        </select>
                                        </div></div>

                                        <div class="col-sm- my-1">
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <div class="input-group-text">Assign Date</div>
                                                </div>
                                                <Form.Group controlId="formBasicEmail">
                                                    <Form.Control className="input-width" type="date" placeholder="assignDate" onChange={(event) => {
                                                        this.setState({
                                                            assignDate: event.target.value
                                                        })
                                                    }} />
                                                </Form.Group>

                                            </div>
                                        </div>

                                        <div class="col-sm- my-1">
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <div class="input-group-text">Assigned To</div>
                                                </div>
                                                <Form.Group controlId="formBasicEmail">
                                                    <Form.Control className="input-width" type="text" placeholder="assignedTo" onChange={(event) => {
                                                        this.setState({
                                                            assignedTo: event.target.value
                                                        })
                                                    }} />
                                                </Form.Group>

                                            </div>
                                        </div>

                                        <div class="col-sm- my-1">
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <div class="input-group-text">End Date</div>
                                                </div>
                                                <Form.Group controlId="formBasicEmail">
                                                    <Form.Control className="input-width" type="Date" placeholder="endDate" onChange={(event) => {
                                                        this.setState({
                                                            endDate: event.target.value
                                                        })
                                                    }} />
                                                </Form.Group>

                                            </div>
                                        </div>
                                        <div class="col-sm- my-1">
                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <div class="input-group-text">Status</div>
                                                </div>

                                                <Form.Group controlId="formBasicEmail">
                                                    <Form.Control className="input-width" type="text" placeholder="status" onChange={(event) => {
                                                        this.setState({
                                                            status: event.target.value
                                                        })
                                                    }} />
                                                </Form.Group>

                                            </div>
                                        </div>
                                        <Button className="submit-button" variant="primary" type="submit" onClick={this.create.bind(this)}>
                                            Submit
                    </Button>
                                        <Button className="submit-button" variant="primary" type="cancel" onClick={this.cancle.bind(this)}>
                                            cancel
                    </Button>
                            </Form>
                                </div>
                    </div>
                        </div>
                    </div>
                    )
                }
            }
export default CreateTask