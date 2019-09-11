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
           containerName:'',
           

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

    onDragOver = (ev,a) => {
      var x= document.getElementById(a).id;
      this.setState({
          containerName:x
      })
        ev.preventDefault();
    }
    allowDrop(ev) {
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
                }else {
                    this.pRef.current.style.visibility = "visible"
               }

            }).catch((error) => {
                console.log(error)
            })

    }
    droptask(e){
        e.preventDefault()
        console.log("droptask")
    }
    update(a, b) {

        console.log("=======classname of update======",this.state.containerName);

        var c=this.state.containerName
     
     
       
        if (b === "todo") {
            b = "onProgress"
        } else if (b === "onProgress") {
            b = "blocked"
        }
        else if (b === "blocked") {
            b = "onProgress"
        }
       
        
       
        console.log("==========status=======", b)
        if(b==="onProgress"&&c=="onProgress"||b==="blocked"&&c=="blocked"||b==="onProgress"&&c=="onProgress"|| b==="completed"){
        Axios.put('http://localhost:8080/updateTaskStatus?taskId=' + a + '&status=' + b)
            .then((response) => {
                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    this.getTask();
                    this.props.history.push('/homePage')
                    this.getTask();

                } else if (response.data.statusCode === 501) {
                    //this.props.history.push('/')

                } else {
                    this.pRef.current.style.visibility = "visible"
                }

            }).catch((error) => {
                console.log(error)
            })
    }}
    render() {
        return (
            <div>
                <SearchNavabar />
              
                <div className="container-fluid">
              
                    <div className="row ">
                        <div className="col-md-4 " id="todo" onDragOver={(e) => this.onDragOver(e,"todo")} >
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

                                                            <div id="div1" class="sticky" draggable="true" onDragEnd={()=> this.update(item.taskId, item.status)}
                                                                onDragStart={(e) => this.drag(e,"todo")} >
                                                                <p id="drag1"style={{ backgroundColor: "rgb(216, 133, 112)" }} class="danger">
                                                                    <div id="div" className="textarea">{item.description} </div></p>
                                                            </div>
                                                        )
                                                    }
                                                    )}
                                                    {this.state.todo.filter(item => item.priority === 'intermediate').map(item => {
                                                        return (

                                                            <div  id="div2" class="sticky" draggable="true" onDragEnd={() => this.update(item.taskId, item.status)}
                                                                onDragStart={(e) => this.drag(e,"todo")} >
                                                                <p div id="drag2" style={{ backgroundColor: "rgb(188, 241, 144)" }} class="danger"  >
                                                                    <div id="d2"className="textarea">{item.taskId}{item.description} </div></p>
                                                            </div>
                                                        )
                                                    }
                                                    )}
                                                    {this.state.todo.filter(item => item.priority === 'low').map(item => {
                                                        return (
                                                            <div  id="div3" class="sticky" draggable="true" onDragEnd={() => this.update(item.taskId, item.status)}
                                                                onDragStart={(e) => this.drag(e,"todo")} >
                                                                <p  id="drag3"  style={{ backgroundColor: "rgb(232, 241, 144)" }} class="danger"  >
                                                                    <div id="d3" className="textarea">{item.description} </div></p>
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

                        <div className="col-md-4 onProgress"  id="onProgress" onDragOver={(e) => this.onDragOver(e,"onProgress")}>
                            <div className="row">

                                <div className="col-md-12">
                                    <div id="mainCard" className="cards">
                                        <h5 className="card-header header">
                                            <center> Progress </center>
                                        </h5>

                                       
                                            {this.state.onProgress.filter(item => item.priority === 'high').map(item => {
                                                return (
                                                    <div id="div4" onDragEnd={() => this.update(item.taskId, item.status)} onDrop={(e)=>this.droptask(e)} class="sticky" draggable="true"
                                                        onDragStart={(e) => this.drag(e,"onProgress")}  >
                                                        <div id="v4" className="v"  onClick={() => this.update(item.taskId,"completed")}>v</div>
                                                        <div id="i4" className="i" >i</div>
                                                        <p id="drag4" style={{ backgroundColor: "rgb(216, 133, 112)" }} class="danger"  >
                                                            <div id="d4" className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.onProgress.filter(item => item.priority === 'intermediate').map(item => {
                                                return (
                                                    <div  id="div5" class="sticky" draggable="true" onDrop={(e)=>this.droptask(e)} onDragEnd={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e,"onProgress")}  >
                                                          <div id="v5" className="v"  onClick={() => this.update(item.taskId,"completed")}>v</div>
                                                        <div id="i5" className="i" >i</div>
                                                        <p id="drag5" style={{ backgroundColor: "rgb(188, 241, 144)" }} class="danger">
                                                            <div id="d5" className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.onProgress.filter(item => item.priority === 'low').map(item => {
                                                return (
                                                    <div id="div6" class="sticky" onDrop={(e)=>this.droptask(e)} draggable="true" onDragEnd={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e,"onProgress")}  >
                                                        <div id="v6" className="v"  onClick={() => this.update(item.taskId,"completed")}>v</div>
                                                        <div id="i6" className="i" >i</div>
                                                        <p id="drag6" style={{ backgroundColor: "rgb(232, 241, 144)" }} class="danger">
                                                            <div id="d6" className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                      
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-md-4 blocked" id="blocked" onDragOver={(e) => this.onDragOver(e,"blocked")}>
                            <div className="row">
                                <div className="col-md-12">
                                    <div id="mainCard" className="cards">
                                        <h5 className="card-header header">
                                            <center> Blocked </center>
                                        </h5>

                                       

                                            {this.state.blocked.filter(item => item.priority === 'high').map(item => {

                                                return (

                                                    <div id="div7" class="sticky" onDrop={(e)=>this.droptask(e)} draggable="true" onDrop={(e)=>this.droptask(e)}
                                                     onDragEnd={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e,"blocked")} >
                                                              <div id="v7" className="v"  onClick={() => this.update(item.taskId,"completed")}>v</div>
                                                        <div id="i7" className="i" >i</div>
                                                        <p id="drag7" style={{ backgroundColor: "rgb(216, 133, 112)" }} class="danger">
                                                            <div id="d7" className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.blocked.filter(item => item.priority === 'intermediate').map(item => {

                                                return (

                                                    <div id="div8" class="sticky" onDrop={(e)=>this.droptask(e)} draggable="true" onDragEnd={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e,"blocked")} >
                                                              <div id="v8" className="v"  onClick={() => this.update(item.taskId,"completed")}>v</div>
                                                        <div id="i8" className="i" >i</div>
                                                        <p id="drag8" style={{ backgroundColor: "rgb(188, 241, 144)" }} class="danger">
                                                            <div id="d8" className="textarea">{item.description} </div></p>
                                                    </div>
                                                )
                                            }
                                            )}
                                            {this.state.blocked.filter(item => item.priority === 'low').map(item => {

                                                return (

                                                    <div id="div9" class="sticky"  onDrop={(e)=>this.droptask(e)} draggable="true" onDragEnd={() => this.update(item.taskId, item.status)}
                                                        onDragStart={(e) => this.drag(e,"blocked")} >
                                                              <div id="v9" className="v"  onClick={() => this.update(item.taskId,"completed")}>v</div>
                                                        <div id="i9" className="i" >i</div>
                                                        <p id="drag9" style={{ backgroundColor: "rgb(232, 241, 144)" }} class="danger">
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

