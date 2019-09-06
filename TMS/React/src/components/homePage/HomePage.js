import React, { Component } from 'react';
import Axios from 'axios';
import './HomePage.css';
import { Nav, NavDropdown } from 'react-bootstrap'
import { NavLink } from 'react-router-dom';
import SearchNavabar from '../navBar/SearchNavabar';

export class HomePage extends Component {

    constructor(props) {
        super(props)

        this.state = {
            todo: [],
            complete: [],
            blocked: [],
            onProgress: [],
            notes: [],
            i: [],
            a: '',
            isUpdate:false

        }


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
    funToDo(e,tid) {
        e.preventDefault();
        if (this.state.todo[tid].status === "todo") {
            console.log("update", this.state.todo[tid])

            this.setState({
                status: this.state.todo[tid].status = "onProgress",
                isUpdate:true
            })
            this.updateTask(e,tid);
            console.log("update", this.state.todo[tid]);

        }

    }
    funOnProgress(e,tid) {
        let i = 0;
        let j = this.state.onProgress.taskId = tid;
        console.log("tid", this.state.onProgress);
        if (i === j) {
            if (this.state.onProgress[tid].status === "onProgress") {
                console.log("update", this.state.onProgress[i])

                this.setState({
                    status: this.state.onProgress[i].status = "blocked",
                    isUpdate: true

                })
                this.updateTask(e,tid);

                console.log("update", this.state.onProgress[i]);

            }
        }else{
            i++;
        }
        

    }
    funBlocked(tid) {
        let i = 0;
        let j = this.state.blocked.taskId = tid;
        console.log("tid", this.state.blocked);
        if (i === j) {
            if (this.state.blocked[tid].status === "blocked") {
                console.log("update", this.state.blocked[i])

                this.setState({
                    status: this.state.blocked[i].status = "onProgress",
                    isUpdate: true

                })
                this.updateTask(tid);
                
                console.log("update", this.state.blocked[i]);
                console.log("isupdate", this.state.isUpdate);

            }
        } else {
            i++;
        }

    }
    updateTask=(e,tid) => {
        e.preventDefault();
        console.log("updateTaskid",tid);
if(this.state.isUpdate){
    console.log("updateTask1");

        Axios.put('http://localhost:8080/updateTaskStatus', tid)
            .then((response) => {
                console.log(response.data.message)
                if (response.data.statusCode === 201) {
                    this.props.history.push('/homePage')
                }
            }).catch((error) => {
                console.log(error)
            })
            this.setState({
                isUpdate: false
            }) 
        }
    }
 

    getTask() {
        Axios.get('http://localhost:8080/getAllTask')
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
    ID() {
        return Math.random().toString(36).substr(2, 9);
    }
    render() {

        return (

            <div>
                <SearchNavabar />
                <Nav className="nav-link">
                    <NavDropdown title="ToMe" id="basic-nav-dropdown">
                        <NavLink className="nav-link" to="/tome" >To Me</NavLink>
                        <NavLink className="nav-link" to="/byme">By Me</NavLink>
                    </NavDropdown>
                </Nav>
                <div className="container-fluid">
                    <div className="row">
                        <div className="col-md-4">
                            <div className="row">
                                <div className="col-md-12">
                                    <div id="mainCard" className="card">
                                        <h5 className="card-header">
                                            <center>TO DO</center>
                                        </h5>
                                        <div className="card-body">
                                            <p className="card-text">
                                            </p><div className="row">
                                                <div className="col-md-12">

                                                    <div >

                                                        {this.state.todo.map(item => {
                                                            return (

                                                                <div id="drag3" className="sticky" draggable="true"
                                                                onDragStart={(e) => this.drag(e)} onDragLeave={(e) => this.funToDo(e,item.taskId)} >
                                                                <p class="danger">{item.description} </p>
                                                            </div>
                                                            )
                                                        })}
                                                    </div>
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
                                    <div id="mainCard" className="card">
                                        <h5 className="card-header">
                                            <center> Progress </center>
                                        </h5>


                                            {this.state.onProgress.map(item => {
                                                return (

                                                    <div id="drag3" className="sticky" draggable="true"
                                                        onDragStart={(e) => this.drag(e)} onDragLeave={(e) => this.funOnProgress(e, item.taskId)} >
                                                        <p class="danger">{item.description} </p>
                                                    </div>

                                                )
                                            })}
                                        </div>
                                    </div>
                            </div>
                        </div>
                        <div className="col-md-4">
                            <div className="row">
                                <div className="col-md-12">
                                    <div id="mainCard" className="card">
                                        <h5 className="card-header">
                                            <center> Blocked </center>
                                        </h5>

                                        <div onDrop={(e) => this.drop(e)} onDragOver={(e) => this.allowDrop(e) }>

                                            {this.state.blocked.map(item => {
                                                return (
                                                    <div id="drag8" className="sticky" draggable="true"
                                                        onDragStart={(e) => this.drag(e)} onClick={(e) => this.funBlocked(e,item.taskId)} >
                                                        <p class="danger">{item.description} </p>
                                                    </div>
                                                )
                                            })}
                                        
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

