import React, { Component } from 'react'

export default class AllTask extends Component {
    constructor(props){
        super(props)
        this.state={
            searchtask:JSON.parse(window.localStorage.getItem("searchtask"))
        }
    }
    render() {
        return (
            <div>
                
            </div>
        )
    }
}
