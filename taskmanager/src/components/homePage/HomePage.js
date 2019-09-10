import React, { Component } from 'react';
import Axios from 'axios';
import './HomePage.css';
import { Nav, NavDropdown } from 'react-bootstrap'
import { NavLink } from 'react-router-dom';
import SearchNavabar from '../navBar/SearchNavabar';
import { Draggable, Droppable } from 'react-drag-and-drop'

export class HomePage extends Component {

    constructor(props) {
        super(props)

        this.state = {
            todo: [],
            complete: [],
            blocked: [],
            onProgress: [],


            i: [],
            a: '',
            userEmail: JSON.parse(window.localStorage.getItem('beans')),
            isUpdate: false,
            showIconHigh: true,
            showIconLow: true,
            showIcon: true

        }
        this.pRef = React.createRef();



        console.log('bean ', this.state.taskBean);
        this.getTask = this.getTask.bind(this);

    }
    drop = (ev) => {
        ev.preventDefault();
        var data = ev.dataTransfer.getData("text");
        ev.target.appendChild(document.getElementById(data));

    }

    onDragOver = (ev) => {
        ev.preventDefault();
    }
    allowDrop(ev) {
        ev.preventDefault();
    }

    drag(ev) {
        console.log("drag", ev.dataTransfer.setData("text", ev.target.id));

    }
    componentDidMount() {
        this.getTask();

    }
    getTask() {
        Axios.get('http://localhost:8080/getAssignToTask?email=' + this.state.userEmail.email)
            .then((response) => {
                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    //setstat
                    this.setState({
                        todo: response.data.taskBean.filter(item => item.status === 'todo')

                    })
                    this.setState({
                        complete: response.data.taskBean.filter(item => item.status === 'complete')
                    })
                    this.setState({
                        blocked: response.data.taskBean.filter(item => item.status === 'blocked')
                    })
                    this.setState({
                        onProgress: response.data.taskBean.filter(item => item.status === 'onProgress')
                    })
                    console.log('bean if', this.state.todo);
                }

            }).catch((error) => {
                console.log(error)
            })

    }
    right(e, a) {
        e.preventDefault()
        if (a === "high") {
            console.log("aaa")
            this.setState({
                showIconHigh: false
            })
        }
    }
    update(a, b) {
        console.log("id", a)
        console.log("status", b)
        if (b === "todo") {
            b = "onProgress"
        } else if (b === "onProgress") {
            b = "blocked"
        }
        else if (b === "blocked") {
            b = "onProgress"
        }
        console.log("status", b)
        Axios.put('http://localhost:8080/updateTaskStatus?taskId=' + a + '&status=' + b)
            .then((response) => {
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
    render() {
        return (
            <div>
                <SearchNavabar />
              
                <div className="container-fluid">
                    <div className="row ">
                        <div className="col-md-4">
                            <div className="row">
                                <div className="col-md-12">
                                    <div id="mainCard" className="cards">
                                        <h5 className="card-header header">
                                            <center >TO DO</center>
                                        </h5>
                                        <div className="card-body">
                                            <p className="card-text">
                                            </p><div className="row">
                                                <div className="col-md-12">
                                                    {this.state.todo.filter(item => item.priority === 'high').map(item => {
                                                        return (

                                                            <div id="drag1" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                                onDragStart={(e) => this.drag(e)} >
                                                                <p style={{ backgroundColor: "rgb(216, 133, 112)" }} class="danger">
                                                                    <div className="textarea">{item.description} </div></p>
                                                            </div>
                                                        )
                                                    }
                                                    )}
                                                    {this.state.todo.filter(item => item.priority === 'intermediate').map(item => {
                                                        return (

                                                            <div id="drag2" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                                onDragStart={(e) => this.drag(e)} >
                                                                <p style={{ backgroundColor: "rgb(188, 241, 144)" }} class="danger"  >
                                                                    <div className="textarea">{item.taskId}{item.description} </div></p>
                                                            </div>
                                                        )
                                                    }
                                                    )}
                                                    {this.state.todo.filter(item => item.priority === 'low').map(item => {
                                                        return (
                                                            <div id="drag3" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                                onDragStart={(e) => this.drag(e)} >
                                                                <p style={{ backgroundColor: "rgb(232, 241, 144)" }} class="danger"  >
                                                                    <div className="textarea">{item.description} </div></p>
                                                            </div>
                                                        )
                                                    }
                                                    )}
                                                </div>
                                            </div>
                                            <p />
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-md-4">
                            <div className="row">
                                <div className="col-md-12">
                                    <div id="mainCard" className="cards">
                                        <h5 className="card-header header">
                                            <center> Progress </center>
                                        </h5>
                                        <div onDragLeave={(e) => this.drop(e)} onDragOver={(e) => this.allowDrop(e)} className="a">
                                            {this.state.onProgress.filter(item => item.priority === 'high').map(item => {
                                                return (
                                                    <div id="drag4" onDragLeave={() => this.update(item.taskId, item.status)} class="sticky" draggable="true"
                                                        onDragStart={(e) => this.drag(e)}  >
                                                        <div className="v" style={{ visibility: this.state.showIconHigh ? 'hidden' : 'visible' }} >v</div>
                                                        <div className="i" onClick={(e) => this.right(e, "high")}>i</div>
                                                        <p style={{ backgroundColor: "rgb(216, 133, 112)" }} class="danger"  >
                                                            <div className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.onProgress.filter(item => item.priority === 'intermediate').map(item => {
                                                return (
                                                    <div id="drag5" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e)}  >
                                                        <div className="v" style={{ visibility: this.state.showIcon ? 'hidden' : 'visible' }} >v</div>
                                                        <div className="i" onClick={(e) => this.right(e)}>i</div>
                                                        <p style={{ backgroundColor: "rgb(188, 241, 144)" }} class="danger">
                                                            <div className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.onProgress.filter(item => item.priority === 'low').map(item => {
                                                return (
                                                    <div id="drag6" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e)}  >
                                                        <div className="v" style={{ visibility: this.state.showIcon ? 'hidden' : 'visible' }} >v</div>
                                                        <div className="i" onClick={(e) => this.right(e)}>i</div>
                                                        <p style={{ backgroundColor: "rgb(232, 241, 144)" }} class="danger">
                                                            <div className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-md-4">
                            <div className="row">
                                <div className="col-md-12">
                                    <div id="mainCard" className="cards">
                                        <h5 className="card-header header">
                                            <center> Blocked </center>
                                        </h5>

                                        <div onDragLeave={(e) => this.drop(e)} onDragOver={(e) => this.allowDrop(e)} className="a">

                                            {this.state.blocked.filter(item => item.priority === 'high').map(item => {

                                                return (

                                                    <div id="drag7" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e)} >
                                                        <p style={{ backgroundColor: "rgb(216, 133, 112)" }} class="danger">
                                                            <div className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.blocked.filter(item => item.priority === 'intermediate').map(item => {

                                                return (

                                                    <div id="drag8" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e)} >
                                                        <p style={{ backgroundColor: "rgb(188, 241, 144)" }} class="danger">
                                                            <div className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.blocked.filter(item => item.priority === 'low').map(item => {

                                                return (

                                                    <div id="drag9" class="sticky" draggable="true" onDragLeave={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e)} >
                                                        <p style={{ backgroundColor: "rgb(232, 241, 144)" }} class="danger">
                                                            <div className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}

                                        </div>
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


export default HomePage

