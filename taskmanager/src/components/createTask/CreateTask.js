import React, { Component } from 'react';
/* import Navbar from '../navbar/Navbar'
 */import Form from 'react-bootstrap/Form'
import Dropdown from 'react-bootstrap/Dropdown'
import { Button } from 'react-bootstrap'
import Login from '../login/Login'

import './CreateTask.css'
import Axios from 'axios'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import SearchNavabar from '../navBar/SearchNavabar';
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
            status: 'todo',
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
        this.setState({
            email: this.state.userBean.email,

        })

        console.log(" details" + this.state.taskId)


        console.log(this.state.userBean);
        Axios.post('http://localhost:8080/createTask', this.state)
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
            <div className="">  
    <SearchNavabar></SearchNavabar>
                          <div className=" taskcard col-md-4 col-md-offset-4">
                    <div className="cardheader">
                        <h3>CreateTask </h3>
                    </div >

                    <div class="container">
                        <div class="row centered-form c">
                            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                                <div class="panel panel-default">
                                    <div class="panel-body">
                                        <form role="form">
                                        Subject:
                                                    <div class="form-group">
                                                  
                                                        <input type="text" name="Subject" id="Subject" class="form-control input-sm" onChange={(event) => {
                                                            this.setState({
                                                                subject: event.target.value
                                                            })
                                                        }} placeholder="Subject" />
                                                    </div>
                                                
                                            <div class="form-group">
                                            Description:
                                            <textarea type="text" placeholder="description" onChange={(event) => {
                                     this.setState({
                                         description: event.target.value
                                     })
                                 }} /></div>
                                            <div class="form-group">
                                            <div class="row">

                                            <div class="col-xs-6 col-sm-6 col-md-6">
                                                    <div class="form-group">
                                                    Assigned To:
                                                        <input type="text" name="To" id="TO" onChange={(event) => {
                                                            this.setState({
                                                                assignedTo: event.target.value
                                                            })
                                                        }} class="form-control input-sm" placeholder="To" />
                                                    </div>
                                                </div>
                                                <div class="col-xs-6 col-sm-6 col-md-6">
                                                Priority:
                                             <select name="dropdown" className="prio" onChange={(event) => {
                                                    this.setState({
                                                        priority: event.target.value
                                                    })
                                                }} placeholder="priority">
                                                    <option value="high" >High</option>
                                                    <option value="intermediate">Intermediate</option>
                                                    <option value="low">Low</option>
                                                </select>
                                            </div></div></div>


                                            <div class="row">
                                                <div class="col-xs-6 col-sm-6 col-md-6">
                                                    <div class="form-group">
                                                    Assign Date
                                                        <input type="date" name="AssignDate" id="AssignDate" class="form-control input-sm" placeholder="AssignDate"
                                                            onChange={(event) => {
                                                                this.setState({
                                                                    assignDate: event.target.value
                                                                })
                                                            }} />
                                                    </div>
                                                    </div>
                                                    <div class="col-xs-6 col-sm-6 col-md-6">

                                                    <div class="form-group">
                                                    End Date
                                                        <input type="date" name="endDate" id="endDate" onChange={(event) => {
                                                            this.setState({
                                                                endDate: event.target.value
                                                            })
                                                        }} class="form-control input-sm" placeholder="endDate" />
                                                    </div>
                                                </div>


                                            </div>

                                            <input type="submit" value="Add" onClick={this.create.bind(this)} class="btn btn-info btn-block" />
                                            <input type="cancel" value="cancel" onClick={this.cancle.bind(this)} class="btn btn-info btn-block" />

                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                </div>

            /*  <div >
           
                 <div className="back" >
                     <div className="carduser col-md-4 offset-4" >
                         <h2 className="header-pos">ADD TASK</h2>
 
                         <div className="add-det">
                             <Form >
                                 <Form.Group controlId="formBasicEmail">
                                     <Form.Control className="input-width" type="text" placeholder="subject" onChange={(event) => {
                                         this.setState({
                                             subject: event.target.value
                                         })
                                     }} />
                                 </Form.Group>
 
 
 
                                 <textarea type="text" placeholder="description" onChange={(event) => {
                                     this.setState({
                                         description: event.target.value
                                     })
                                 }} />
 
 
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
 
 
                                 <Form.Group controlId="formBasicEmail">
                                     <Form.Control className="input-width" type="date" placeholder="assignDate" onChange={(event) => {
                                         this.setState({
                                             assignDate: event.target.value
                                         })
                                     }} />
                                 </Form.Group>
 
 
 
 
                                 <Form.Group controlId="formBasicEmail">
                                     <Form.Control className="input-width" type="text" placeholder="assignedTo" onChange={(event) => {
                                         this.setState({
                                             assignedTo: event.target.value
                                         })
                                     }} />
                                 </Form.Group>
 
 
 
                                 <Form.Group controlId="formBasicEmail">
                                     <Form.Control className="input-width" type="Date" placeholder="endDate" onChange={(event) => {
                                         this.setState({
                                             endDate: event.target.value
                                         })
                                     }} />
                                 </Form.Group>
 
 
 
 
 
 
                                 <Button className="submit-button" variant="primary" type="submit" onClick={this.create.bind(this)}>
                                     ADD
                     </Button>
                                 <Button className="submit-button" variant="primary" type="cancel" onClick={this.cancle.bind(this)}>
                                     cancel
                     </Button>
                             </Form>
                         </div>
                     </div>
                 </div>
             </div> */
        )
    }
}
export default CreateTask