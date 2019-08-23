import React, { Component } from 'react'
import Axios from 'axios'

import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import { withRouter } from 'react-router-dom'
import './Navbar.css'


export class Navbar extends Component {
    constructor(props) {
        super(props);
        this.state = {
            search: '',
            bean: JSON.parse(localStorage.getItem("bean"))
        }
        this.search = this.search.bind(this);
    
       
    }
    search(e) {
        e.preventDefault();
        console.log("this.state.search:", this.state.search);
        Axios.get('http://localhost//library/user/searchUser?userName='+ this.state.search).then((response) => {
            console.log('Response Object', response.data);
            if (response.data.message === "successfull") {
                localStorage.setItem("beans", JSON.stringify(response.data.beans[0]));
                this.props.history.push('/allUser');
            } else {
                this.props.history.push('/adminhome');
                localStorage.setItem('nouser', response.data.description);
            }
        }).catch((error) => {
            console.log('Error', error);
        })
    }
    logout() {
        Axios.get('http://localhost/login/logoutsubmit')
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.message === 'Success') {
               this.props.history.push('/')
           }
        }).catch((error)=>{
            console.log(error)
        })
    }

    render() {
        return (
            <div>
             
            
                    <div>
                        <nav className="navbar navbar-expand-lg navbar-light bg-header">
                            <div className="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul className="navbar-nav mr-auto container">
                                    <li className="nav-item active search">
                                    <Form>
                                            <Form.Group controlId="formBasicEmail">
                                                <Form.Control type="text"  placeholder="Search" onChange={(event) => { this.setState({ search: event.target.value })}}/>
                                                <Button className="b" onClick={this.search.bind(this)}  variant="outline-success">Search</Button>
                                            </Form.Group>
                                        </Form>
                                    </li>
                                    <li className="nav-item active heading">
                                        <h2 className="heddinglib" onClick={()=>{this.props.history.push('/adminhome')}} >Library Management System</h2>                                                                                        
                                    </li>     
                                    <li className="nav-item">
                                        <Button variant="light" className="log" onClick={this.logout.bind(this)}>Logout</Button>    
                                    </li>                          
                                </ul>
                                    {/* <form className="form-inline my-2 my-lg-0">
                                        <input className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"/>
                                        <Link className="btn btn-outline-success my-2 my-sm-0" type="submit" to="../Search/Search">Search</Link>
                                    </form> */}
                                    
                                </div>
                        </nav>

                        {/* <Route path='/CreateEmp/Employee/info' component={info}></Route> */}
                        {/* <Route path='/home' component={HomePage}></Route> */}
                        {/* <Route path='/Search/Search' component={Search}></Route> */}

                    </div>
            </div>
        )
    }
}

export default withRouter(Navbar)