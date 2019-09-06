import React, { Component } from 'react'
import Axios from 'axios';

export default class Byme extends Component {
    constructor(props){
        super(props)
        this.state={
            email:'aaa'
        }
    }

    task(){
        console.log('componentDidMount');
        Axios.get('http://localhost:8080/getAssignToTask?email='+this.state.email
           
        ).then((response)=>{
            console.log('Response Object',response);
            if(response.data.message === "success"){
              localStorage.setItem("beans",JSON.stringify(response.data.beans));
                     
            }
      }).catch((error)=>{
             console.log('Error',error);
         })
     

    }
    render() {
        return (
            <div onClick={() => this.task()}>
                 To Me
            </div>
        )
    }
}