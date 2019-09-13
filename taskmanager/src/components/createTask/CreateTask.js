import React, { Component } from 'react'
import '../createUser/createUser.css'
import Axios from 'axios'
import $ from 'jquery'
import SearchNavabar from '../navBar/SearchNavabar';

export class CreateTask extends Component {
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
            show: false
        }
    }
    cancel(e) {
        e.preventDefault();
        this.props.history.push('/homePage')
    }
    textarea = () => {
        document.getElementById("info").hidden = false;
        $("#textarea").keyup(function () {
            $("#info").text("Characters left: " + (180 - $(this).val().length)).css('font', '11px').css('text-align', 'center').css('margin-top', '-20px').css('color', 'red');
        });
    }
    hide = () => {
        document.getElementById("info").hidden = true;
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
        Axios.post('http://localhost:8080/createTask', this.state,
        {
            params: {
              email:this.state.assignedTo
            }
        }
            ).then((response) => {
                console.log(response)
                this.setState({ show: true })
                console.log("book details" + this.state.taskId)

                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    alert("Task added Successfully redirecting to homepage")
                    this.props.history.push('/homePage')

                } else if(response.data.statusCode === 401){
                    this.setState({ show: true })
                
                }

            }).catch((error) => {

                console.log(error)
            })
    }
    render() {
        return (
            <div className="mainHeader">
                <SearchNavabar/>
                <div className="adduser">
                    <div>
                    {this.state.show ? <div id="alert" class="alert alert-danger" role="alert">Task Creation Failed email does not Exist!!! </div> : null}
                        <div className="row col-lg-4 offset-4">
                            <div className="col-lg">
                                <div id="fillForm" className="card">
                                    <h5 id="chead" className="card-header ">
                                        <legend className="mx-auto " style={{ width: '110px' }}>Task Form</legend>
                                    </h5>
                                    <div className="card-body">
                                        <p className="card-text">
                                        </p>
                                        <form role="form" onSubmit={this.create.bind(this)}>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100%' }} className="input-group-text" id="basic-addon1">Subject</span>
                                                </div>
                                                <input required type="text" name="Subject" id="Subject" class="form-control input-lg" onChange={(event) => {
                                                    this.setState({
                                                        subject: event.target.value
                                                    })
                                                }} placeholder="Subject" />
                                            </div>
                                            <div class="form-group">
                                                <textarea onBlur={this.hide} id="textarea" onFocus={this.textarea} maxlength="180" type="text" placeholder="Enter Description (character limit: 180)" onChange={(event) => {
                                                    this.setState({
                                                        description: event.target.value
                                                    })
                                                }} /></div>
                                            <div id="info" ></div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100%' }} className="input-group-text" id="basic-addon1">AssignTo</span>
                                                </div>
                                                <input required type="email" name="To" id="TO" onChange={(event) => {
                                                    this.setState({
                                                        assignedTo: event.target.value
                                                    })
                                                }} class="form-control input-lg" placeholder="Enter email whom to be assigned" />
                                            </div>
                                            <div className="input-group mb-3">
                                                <select required name="dropdown" className="prio" onChange={(event) => {
                                                    this.setState({
                                                        priority: event.target.value
                                                    })
                                                }} placeholder="priority">
                                                    <option value="low" selected disabled hidden>Choose Priority (default:low)</option>
                                                    <option value="low" >low</option>
                                                    <option value="intermediate">intermediate</option>
                                                    <option Value="high">high</option>
                                                </select>
                                            </div>
                                            <div className="input-group mb-3">
                                                <div className="input-group-prepend">
                                                    <span style={{ width: '100%' }} className="input-group-text" id="basic-addon1">End-Date</span>
                                                </div>
                                                <input required type="date" name="endDate" id="endDate" onChange={(event) => {
                                                    this.setState({
                                                        endDate: event.target.value
                                                    })
                                                }} class="form-control input-lg" placeholder="endDate" />
                                            </div>
                                            <div className=" mx-auto" style={{ width: '233px', marginBottom: '20px' }}>
                                                <button type="reset" className="btn btn-outline-primary" style={{ marginRight: '10px' }}>Reset</button>
                                                <button type="submit" className="btn btn-outline-success">Submit</button>
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

export default CreateTask