import React, { Component } from 'react'
import './CompletedTask.css'
import Axios from 'axios';
import SearchNavabar from '../navBar/SearchNavabar';


export default class CompletedTask extends Component {
    constructor(props) {
        super(props)
        this.state = {
            doneTask: []
        }
    }
    componentDidMount() {
        console.log('componentDidMount');
        Axios.get('http://localhost:8080/getAllTask').then((response) => {
            console.log('Response Object', response);
            if (response.data.message === "Success") {
                this.setState({
                    doneTask: response.data.taskBean.filter(item => item.status === 'completed')

                })

                console.log('Response Status true', this.state.doneTask);
            }
        }).catch((error) => {
            console.log('Error', error);
        })


    }

    render() {
        return (
            <div>
                <SearchNavabar />
                <div>
                    {this.state.doneTask.map(item => {
                           /*   <div>
                             <p>
                             <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                              {item.assignDate}
                             </a>
                             <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
                             {item.assignDate}
                             </button>
                           </p>
                           <div class="collapse" id="collapseExample">
                             <div class="card card-body">
                             <div id="drag3" className="sticky" >
                                     <p class="danger">{item.description} </p>
                                 </div>                        </div>
                           </div>
                            </div>
                                 */
                        return (
                            <div id="drag3" className="sticky" >
                                <p class="danger">{item.description} </p>
                            </div>
                        )
                    })}
                </div>



            </div>
        )
    }
}
