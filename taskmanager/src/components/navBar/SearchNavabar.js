import React, { Component } from 'react'
import { Nav, Navbar, NavbarBrand, NavDropdown, Form, FormControl, Button, Image} from 'react-bootstrap'
import {NavLink} from 'react-router-dom';
import Axios from 'axios';
import { withRouter } from "react-router";

  class SearchNavabar extends Component {
    constructor(props) {
        super(props);
        this.state = {
            search: '',
        }

        this.search = this.search.bind(this);
    }
componentDidMount(){
    console.log("search")
   
}
    search() {
        console.log("this.state.search:", this.state.search);
        Axios.get('http://localhost:8080/searchAll?search=' + this.state.search).then((response) => {
            console.log('Response Object', response.data);
            if (response.data.message === "Success") {
                console.log("datasearch")
                localStorage.setItem("searchtask", JSON.stringify(response.data.taskBean));

                this.props.history.push('/searchPage')
            } else {
                this.props.history.push('/homePage');
                localStorage.setItem('nouser', response.data.description);
            }
        }).catch((error) => {
            console.log('Error', error);
        })
    }
    getdata(){

    }
homepage(e){
    e.preventDefault();
    this.props.history.push('/homePage');

}
    logout(e) {
        e.preventDefault();
        Axios.get('http://localhost:8080/logout', null
        ).then((response) => {
            localStorage.clear();
            console.log('Response Object', response.data);
            if (response.data.message === "Success") {
                console.log(this.props);
                this.props.history.push('/');
                localStorage.setItem('logoutmsg', response.data.description);
            }

        }).catch((error) => {
            console.log('Error', error);
        })
    }    
    render() {
        return (
            <div>
                <Navbar bg="light" expand="lg">
                    <NavbarBrand Link="/TaskHome" onClick={(e) => this.homepage(e)}>Task Manager</NavbarBrand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Form inline className="mr-auto">
                            <FormControl type="text" name="search"
                                onChange={(event) => { this.setState({ search: event.target.value }) }}
                               
                                value={this.state.search} placeholder="Search" className="mr-sm-2" />
                            <Button variant="outline-success" onClick={(event)=>{this.search()}}  >Search</Button>
                        </Form>
                        <Nav className="nav-link">
                            <NavLink className="nav-link" to="/CreateTask">Create Task</NavLink>                            
                            <NavDropdown title={<Image src="src/assets/images.jpeg" roundedCircle />} id="basic-nav-dropdown">
                                <NavDropdown.Item variant="link" onClick={this.logout.bind(this)}>Logout</NavDropdown.Item>
                                <NavLink className="nav-link" to="/myprofile">MyProfile</NavLink>
                            </NavDropdown>
                        </Nav>
                        
                    </Navbar.Collapse>
                    
                </Navbar>
                <Nav >
                    <NavDropdown title="ToMe" id="basic-nav-dropdown">
                        <NavLink className="nav-link" to="/tome" >To Me</NavLink>
                        <NavLink className="nav-link" to="/byme">By Me</NavLink>
                    </NavDropdown>
                    <NavLink className="nav-link" to="/completedTask" style={{ marginLeft: 1600 }}>Completed Task</NavLink>
                </Nav>

            </div>
        )
    }
}
export default  withRouter(SearchNavabar)