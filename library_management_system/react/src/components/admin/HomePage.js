import React, { Component } from 'react';
import Navbar from '../navbar/Navbar'
import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import Login from '../login/Login'
import './HomePage.css'
import Axios from 'axios'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
class AdminHome extends Component {
    constructor(props) {
        super(props)
        this.state = {
           user: []
        }
        this.getUser = this.getUser.bind(this);
    }
    componentDidMount() {
        this.getUser();
    }
    getUser() {
        Axios.get('http://localhost/library/user/getAllUser')
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.statusCode === 201) {
                 //setstate
                 let userData = response.data.beans[0].filter(item => item.userType !== 'admin')
               this.setState({
                   user: userData
               })
                // if(response.data.beans[0].userType === "admin") {
                //     this.props.history.push('/adminhome')
                // } else if(response.data.beans[0].userType === "user") {
                //     this.props.history.push('/user')
                // } else {
                //     //this.props.history.push('/home')
                // }

                
              
           } else if(response.data.statusCode === 501){
            //this.props.history.push('/')
               
           } else {
            this.pRef.current.style.visibility = "visible"
           }
            
        }).catch((error)=>{
            console.log(error)
        })
    }
    delete(uid) {
        Axios.delete('http://localhost/library/user/deleteUser?id='+uid)
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.statusCode === 201) {
                 //setstate
                 this.getUser();
               
           } else if(response.data.statusCode === 501){
            //this.props.history.push('/')
               
           } else {
            this.pRef.current.style.visibility = "visible"
           }
            
        }).catch((error)=>{
            console.log(error)
        })
      
        // setstate
    }
    render() {
       return (
            <div className="user">
                
                <Navbar/>
                

                <Link className= "add-user" to="/createUser"  ><img src='https://icon-library.net/images/login-icon/login-icon-2.jpg' className="imgcss"/> </Link>
                <div className="user-details">
                <h2 className="header">ADMIN HOME PAGE</h2>

                    <table >

                        <tr>
                            <th>User Name</th>
                        </tr>
                         { this.state.user.map(item =>  {
                                return (
                                    <tr className="table">
                                    <td className="user-name">
                                       {item.userName}
                                    </td>
                                    <td className='btn btn-success  user-action'>
                                        <Link className="user-update" to={{
                                                                            pathname: "/createuser",
                                                                            data: item
                                                                        }}>Update</Link>  
                                    </td>
                                    <td className='btn btn-danger user-action'>
                                        <Link onClick={() => this.delete(item.userId)} className="user-update">Delete</Link>  
                                    </td>
                                </tr> 
                              
                                )
                            }) 
                        } 
                         {/* <tr>
                                    <td className="user-name">
                                       abc
                                    </td>
                                    <td className='user-action'>
                                        <Link className="user-update" to={{
                                                                            pathname: "/createuser",
                                                                            data: {name:"abc",id:1} 
                                                                        }}>Update</Link>  
                                    </td>
                                    <td className='user-action'>
                                        {/* <Link onClick={() => this.delete(item.id)} className="user-update">Delete</Link> 
                                    </td>
                                </tr>   */}

                    </table>
                </div>
                </div> 
           
        )
    }
}
export default AdminHome