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
            userEmail: JSON.parse(window.localStorage.getItem('beans')),
            containerName: '',
            showButton: false,
        }
        console.log('bean ', this.state.taskBean);
        this.getTask = this.getTask.bind(this);

    }
    onDragOver = (ev, a) => {
        var x = document.getElementById(a).id;
        this.setState({
            containerName: x
        })
        ev.preventDefault();
    }
    drag(ev) {
        console.log("drag", ev.dataTransfer.setData("text", ev.target.id));
    }
    componentDidMount() {
        console.log("componentDidMount")
        this.getTask();
    }
    getTask() {
        Axios.get('http://localhost:8080/getAssignedTask?email=' + this.state.userEmail.email)
            .then((response) => {
                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    //setstat
                    this.setState({
                        todo: response.data.taskBean.filter(item => item.status === 'todo')

                    })
                    this.setState({
                        complete: response.data.taskBean.filter(item => item.status === 'completed')
                    })
                    this.setState({
                        blocked: response.data.taskBean.filter(item => item.status === 'blocked')
                    })
                    this.setState({
                        onProgress: response.data.taskBean.filter(item => item.status === 'onProgress')
                    })
                    console.log('bean if', this.state.todo);
                } else {
                    this.pRef.current.style.visibility = "visible"
                }

            }).catch((error) => {
                console.log(error)
            })

    }
    update(a, b) {
        console.log("=======classname of update======", this.state.containerName);
        var c = this.state.containerName
        if (b === "todo") {
            b = "onProgress"
        } else if (b === "onProgress") {
            b = "blocked"
        }
        else if (b === "blocked") {
            b = "onProgress"
        }
        console.log("==========status=======", b)
        if (b === "onProgress" && c == "onProgress" || b === "blocked" && c == "blocked" || b === "completed") {
            Axios.put('http://localhost:8080/updateTaskStatus?taskId=' + a + '&status=' + b)
                .then((response) => {
                    console.log(response.data.message)
                    if (response.data.statusCode === 201) {
                        this.getTask();
                        this.props.history.push('/homePage')
                        this.getTask();
                    }
                }).catch((error) => {
                    console.log(error)
                })
        }
    }
    showvis(){
        console.log("showbutton")
        this.setState({
            showButton:this.state.showButton ? false : true
        })
    }
    render() {
        return (
            <div>
                <SearchNavabar />
                <Nav >
                    <NavDropdown title="ToMe" id="basic-nav-dropdown">
                        <NavLink className="nav-link" to="/homePage" >To Me</NavLink>
                        <NavLink className="nav-link" to="/byme">By Me</NavLink>
                    </NavDropdown>
                    <NavLink className="nav-link" to="/completedTask" style={{ marginLeft:'91%',marginTop: '-46px'}}>Completed Task</NavLink>
                </Nav>


                <div className="container-fluid">

                    <div className="row ">
                        <div className="col-lg-3 offset-1 col-md-4 col-sm-12" id="todo" onDragOver={(e) => this.onDragOver(e, "todo")} >
                            <div className="col-md-12">
                                <div id="card bg-default" >
                                    <h5 id="card-header headerHomepage" className="card-header header">
                                        <center >TO DO</center>
                                    </h5>

                                </div>
                                <div className=" bodyuser cards">
                                    <br></br>

                                    {this.state.todo.filter(item => item.priority === 'high').map(item => {
                                        return (
                                            <div id="div1" class="col-lg-3 col-md-4 col-sm-12 offset-2 st " onDragEnd={() => this.update(item.taskId, item.status)}
                                                onDragStart={(e) => this.drag(e, "todo")} >
                                                <div id="i7" className="col-lg-4 col-md-4 col-sm-4" >
                                                    <img onClick={()=>this.showvis()} className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>
                                                <p id="drag1" draggable="true" className="prHigh"  >
                                                
                                                
                                                    <div id="div" className="textarea">{item.description} </div></p>
                                            </div>
                                        )
                                    }
                                    )}
                                    {this.state.todo.filter(item => item.priority === 'intermediate').map(item => {
                                        return (
                                            <div id="div2" class="col-lg-3 col-md-4 col-sm-12 offset-2 st" onDragEnd={() => this.update(item.taskId, item.status)}
                                                onDragStart={(e) => this.drag(e, "todo")} >                                                    
                                                <div id="i7" className="col-lg-4 col-md-4 col-sm-4" >
                                                    <img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>
                                                    
                                                <p div id="drag2" draggable="true" className="prInit"   >
                                                    <div id="d2" className="textarea">{item.taskId}{item.description} </div></p>
                                            </div>
                                        )
                                    }
                                    )}
                                    {this.state.todo.filter(item => item.priority === 'low').map(item => {
                                        return (
                                            <div id="div3" class="col-lg-3 col-md-4 col-sm-12 offset-2 st" onDragEnd={() => this.update(item.taskId, item.status)}
                                                onDragStart={(e) => this.drag(e, "todo")} >
                                                <div id="i7" className="col-lg-4 col-md-4 col-sm-4" >
                                                    <img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>
                                                <p id="drag3" draggable="true" className="prLow"   >
                                                    <div id="d3" className="textarea">{item.description} </div></p>
                                            </div>
                                        )
                                    }
                                    )}
                                </div>
                            </div>
                        </div>


                        <div className="col-lg-3 col-md-4 col-sm-12 onProgress" id="onProgress" onDragOver={(e) => this.onDragOver(e, "onProgress")}>
                            <div className="row">

                                <div className="col-md-12">
                                    <div id="card bg-default" >
                                        <h5 id="card-header headerHomepage" className="card-header header">
                                            <center> On Progress </center>
                                        </h5>
                                    </div>
                                    <div className=" bodyuser cards">
                                        {this.state.onProgress.filter(item => item.priority === 'high').map(item => {
                                            return (
                                                <div id="div4" onDragEnd={() => this.update(item.taskId, item.status)} class="col-lg-3 col-md-4 col-sm-4 offset-2 st"
                                                    onDragStart={(e) => this.drag(e, "onProgress")}  >

                                                    <div id="v4" className="col-lg-4 col-md-4 col-sm-4" onClick={() => this.update(item.taskId, "completed")}><img className="right" src="https://icon-library.net/images/right-icon/right-icon-20.jpg" /></div>

                                                    <div id="i7" className="col-lg-4 col-md-4 col-sm-4" ><img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>


                                                    <p id="drag4" draggable="true" class="prHigh"  >
                                                        <div id="d4" className="textarea ">{item.description} </div></p>


                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.onProgress.filter(item => item.priority === 'intermediate').map(item => {
                                            return (

                                                <div id="div5" class="col-lg-3 col-md-4 col-sm-4 offset-2 st" onDragEnd={() => this.update(item.taskId, item.status)}
                                                    onDragStart={(e) => this.drag(e, "onProgress")}  >
                                                    <div id="v4" className="col-lg-4 col-md-4 col-sm-4" onClick={() => this.update(item.taskId, "completed")}>
                                                        <img className="right" src="https://icon-library.net/images/right-icon/right-icon-20.jpg" /></div>
                                                    <div id="i7" className="col-lg-4 col-md-4 col-sm-4" ><img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>


                                                    <p id="drag5" draggable="true" class="prInit ">
                                                        <div id="d5" className="textarea ">{item.description} </div></p>

                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.onProgress.filter(item => item.priority === 'low').map(item => {
                                            return (
                                                <div id="div6" class="col-lg-3 col-md-4 col-sm-4 offset-2 st" draggable="true" onDragEnd={() => this.update(item.taskId, item.status)}
                                                    onDragStart={(e) => this.drag(e, "onProgress")}  >

                                                    <div id="v4" className="col-lg-4 col-md-4 col-sm-4" onClick={() => this.update(item.taskId, "completed")}><img className="right" src="https://icon-library.net/images/right-icon/right-icon-20.jpg" /></div>
                                                    <div id="i7" className="col-lg-4 col-md-4 col-sm-4" ><img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>
                                                    <p id="drag6" draggable="true" class="prLow ">
                                                        <div id="d6" className="textarea ">{item.description} </div></p>
                                                </div>
                                            )
                                        }
                                        )}

                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-lg-3  col-md-4 col-sm-12blocked" id="blocked" onDragOver={(e) => this.onDragOver(e, "blocked")}>
                            <div className="row">

                                <div className="col-md-12">
                                    <div id="card bg-default" >
                                        <h5 id="card-header headerHomepage" className="card-header header">
                                            <center> Blocked </center>
                                        </h5>
                                    </div>
                                   
                                    <div className=" bodyuser cards">
                                    <br></br>
                                        {this.state.blocked.filter(item => item.priority === 'high').map(item => {

                                            return (
                                                <div id="div7" class="col-lg-3 col-md-4 col-sm-4 offset-2 st"
                                                    onDragEnd={() => this.update(item.taskId, item.status)}
                                                    onDragStart={(e) => this.drag(e, "blocked")} >
                                                    <div id="i7" className="col-lg-4 col-md-4 col-sm-4" ><img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>
                                                    <p id="drag7" draggable="true" class="prHigh ">
                                                        <div id="d7" className="textarea">{item.description} </div></p>
                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.blocked.filter(item => item.priority === 'intermediate').map(item => {
                                            return (
                                                <div id="div8" class="col-lg-3 col-md-4 col-sm-4 offset-2 st" onDragEnd={() => this.update(item.taskId, item.status)}
                                                    onDragStart={(e) => this.drag(e, "blocked")} >

                                                    <div id="i8" className="col-lg-4 col-md-4 col-sm-4" ><img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" /></div>

                                                    <p id="drag8" draggable="true" class="prInit ">

                                                        <div id="d8" className="textarea">{item.description} </div></p>

                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.blocked.filter(item => item.priority === 'low').map(item => {

                                            return (

                                                <div id="div9" class="col-lg-3 col-md-4 col-sm-4 offset-2 st"
                                                    onDragEnd={() => this.update(item.taskId, item.status)}
                                                    onDragStart={(e) => this.drag(e, "blocked")} >

                                                    <div id="i9" className="col-lg-4 col-md-4 col-sm-4" >
                                                        <img className="icon" src="https://cdn4.iconfinder.com/data/icons/miu/24/circle-info-more-information-detail-outline-stroke-512.png" />
                                                    </div>
                                                    <p id="drag9" draggable="true" class="prLow ">
                                                        <div id="d9" className="textarea">{item.description} </div></p>

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


        )
    }
}


export default HomePage

