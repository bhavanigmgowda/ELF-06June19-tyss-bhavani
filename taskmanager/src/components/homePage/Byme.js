import React, { Component } from 'react'
import Axios from 'axios';
import SearchNavabar from '../navBar/SearchNavabar';
import './HomePage.css';
import { Nav, NavDropdown } from 'react-bootstrap'
import { NavLink } from 'react-router-dom';
export default class Byme extends Component {
    constructor(props) {
        super(props)
        this.state = {
            Byme: [],
            email: JSON.parse(window.localStorage.getItem('beans')),
        }
    }

    componentDidMount() {
        console.log('componentDidMount');
        Axios.get('http://localhost:8080/getAssignToTask?email=' + this.state.email.email

        ).then((response) => {
            console.log('Response taskBean', response);
            if (response.data.message === "Success") {
                this.setState({
                    Byme: response.data.taskBean

                })
 }
        }).catch((error) => {
            console.log('Error', error);
        })


    }
    render() {
        return (

            <div>
                <SearchNavabar />
                <Nav >
                    <NavDropdown title="ByMe" id="basic-nav-dropdown">
                        <NavLink className="nav-link" to="/homePage" >To Me</NavLink>
                        <NavLink className="nav-link" to="/byme">By Me</NavLink>
                    </NavDropdown>
                    <NavLink className="nav-link" to="/completedTask" style={{ marginLeft:'91%',marginTop: '-46px'}}>Completed Task</NavLink>
                </Nav>


                <div className="container-fluid">

                    <div className="row ">
                        <div className="col-lg-3 offset-1 col-md-4 col-sm-12" id="todo"  >
                            <div className="col-md-12">
                                <div id="card bg-default" >
                                    <h5 id="card-header" className="card-header header">
                                        <center >TO DO</center>
                                    </h5>

                                </div>
                                <div className=" card-body cards">
                                    <br></br>

                                    {this.state.Byme.filter(item => (item.priority === 'high')&&(item.status==='todo')).map(item => {
                                        return (
                                            <div id="div1" class="col-lg-3 col-md-4 col-sm-12 offset-2 st " >
                                               
                                               
                                                <p id="drag1"  className="prHigh"  >
                                                    <div id="div" className="textarea">{item.description} </div></p>
                                            </div>
                                        )
                                    }
                                    )}
                                    {this.state.Byme.filter(item =>( item.priority === 'intermediate')&&(item.status==='todo')).map(item => {
                                        return (

                                            <div id="div2" class="col-lg-3 col-md-4 col-sm-12 offset-2 st"  >                                                   
                                                
                                                

                                                <p div id="drag2"  className="prInit"   >
                                                    <div id="d2" className="textarea">{item.taskId}{item.description} </div></p>
                                            </div>
                                        )
                                    }
                                    )}
                                    {this.state.Byme.filter(item => (item.priority === 'low')&&(item.status==='todo')).map(item => {
                                        return (
                                            <div id="div3" class="col-lg-3 col-md-4 col-sm-12 offset-2 st" >
                                                                                              
                                                <p id="drag3"  className="prLow"   >
                                                    <div id="d3" className="textarea">{item.description} </div></p>
                                            </div>
                                        )
                                    }
                                    )}
                                </div>
                            </div>
                        </div>


                        <div className="col-lg-3 col-md-4 col-sm-12 onProgress" id="onProgress" >
                            <div className="row">

                                <div className="col-md-12">
                                    <div id="card bg-default" >
                                        <h5 id="card-header" className="card-header header">
                                            <center> On Progress </center>
                                        </h5>
                                    </div>
                                    <div className=" card-body cards">
                                        {this.state.Byme.filter(item => (item.priority === 'high')&&(item.status==='onProgress')).map(item => {
                                            return (
                                                <div id="div4" class="col-lg-3 col-md-4 col-sm-4 offset-2 st">
                                                   
                                                    <p id="drag4"  class="prHigh"  >
                                                        <div id="d4" className="textarea ">{item.description} </div></p>


                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.Byme.filter(item => (item.priority === 'intermediate')&&(item.status==='onProgress')).map(item => {
                                            return (

                                                <div id="div5" class="col-lg-3 col-md-4 col-sm-4 offset-2 st"  >
                                                        <p id="drag5"  class="prInit ">
                                                        <div id="d5" className="textarea ">{item.description} </div></p>

                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.Byme.filter(item => (item.priority === 'low')&&(item.status==='onProgress')).map(item => {
                                            return (
                                                <div id="div6" class="col-lg-3 col-md-4 col-sm-4 offset-2 st"  >

                                                     <p id="drag6"  class="prLow ">
                                                        <div id="d6" className="textarea ">{item.description} </div></p>
                                                </div>


                                            )
                                        }
                                        )}

                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-lg-3  col-md-4 col-sm-12blocked" id="blocked">
                            <div className="row">

                                <div className="col-md-12">
                                    <div id="card bg-default" >
                                        <h5 id="card-header" className="card-header header">
                                            <center> Blocked </center>
                                        </h5>
                                    </div>
                                    <div className=" card-body cards">

                                        {this.state.Byme.filter(item => (item.priority === 'high')&&(item.status==='blocked')).map(item => {

                                            return (

                                                <div id="div7" class="col-lg-3 col-md-4 col-sm-4 offset-2 st">
                                                   
                                                    <p id="drag7"  class="prHigh ">

                                                        <div id="d7" className="textarea">{item.description} </div></p>

                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.Byme.filter(item => (item.priority === 'intermediate')&&(item.status==='blocked')).map(item => {

                                            return (

                                                <div id="div8" class="col-lg-3 col-md-4 col-sm-4 offset-2 st"  >
                                                    <p id="drag8"  class="prInit ">
                                                        <div id="d8" className="textarea">{item.description} </div></p>

                                                </div>
                                            )
                                        }
                                        )}
                                        {this.state.Byme.filter(item => (item.priority === 'low')&&(item.status==='blocked')).map(item => {

                                            return (

                                                <div id="div9" class="col-lg-3 col-md-4 col-sm-4 offset-2 st" >

                                                    <p id="drag9"  class="prLow ">
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