import React, { Component } from 'react';
import Axios from 'axios';
import './HomePage.css';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import NavBar from '../navBar/NavBar'
import ReactStickies from 'react-stickies'; //ES6
import { Draggable, Droppable } from 'react-drag-and-drop'

export class HomePage extends Component {

    constructor(props) {
        super(props)
        this.state = {
            todo: [],
            complete: [],
            blocked: [],
            onProgress: [],
            notes: [],
            i: '',
            tasks: [
                { name: "1", category: "todo", bgcolor: "yellow" },
                { name: "2", category: "onProgress", bgcolor: "pink" },
                { name: "3", category: "complete", bgcolor: "skyblue" },
                { name: "4", category: "blocked", bgcolor: "red" }
            ]
        }


        console.log('bean ', this.state.taskBean);
        this.getTask = this.getTask.bind(this);

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

    drop(ev) {
        ev.preventDefault();
        var data = ev.dataTransfer.getData("text");
        console.log("dorp", ev.target.appendChild(document.getElementById(data)));
       /*  if(this.state.todo[0].status==="todo"){
                this.setState({
                    todo: this.state.todo[0].status="onProgress"
                })

                console.log("change",this.state.todo)

        } */
        console.log("update",this.state.todo[0].status)
    }



    componentDidMount() {
        this.getTask();

    }
updateTask(e){
    e.preventDefault();
   
        Axios.put('http://localhost:8080/updateTaskStatus', this.state)
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.statusCode === 201) {
            this.props.history.push('/homePage')
               
           } 
            
        }).catch((error)=>{
            console.log(error)
        })
      
     
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
    render() {

        return (

            <div>
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

                                                    {this.state.todo.map(item => {
                                                        return (
                                                            <div id="drag4" className="sticky" draggable="true"
                                                                onDragStart={(e) => this.drag(e)} onClick={(e) => this.drop(e)}>
                                                                     <p hidden>{item.taskId}</p>
                                                                <p class="danger">{item.description} </p>
                                                               
                                                            </div>
                                                        )
                                                    })}
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
                                        <div onDrop={(e) => this.drop(e)} onDragOver={(e) => this.allowDrop(e)}>
                                            {this.state.onProgress.map(item => {
                                                return (
                                                    <div id="drag4" className="sticky" draggable="true"
                                                        onDragStart={(e) => this.drag(e)}>
                                                        <p class="danger">{item.description} </p>
                                                    </div>
                                                )
                                            })}
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
                                            <center> Blocked </center>
                                        </h5>
                                        <div onDrop={(e) => this.drop(e)} onDragOver={(e) => this.allowDrop(e)}>

                                            {this.state.blocked.map(item => {
                                                return (
                                                    <div id="drag4" className="sticky" draggable="true"
                                                        onDragStart={(e) => this.drag(e)}>
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

