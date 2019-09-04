import React, {Component} from 'react';
import Axios from 'axios';
import './HomePage.css';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'

export class HomePage extends Component{
    constructor(props){
        super(props)
       var allCookies = document.cookie;
console.log("cookie",allCookies);

    }
    render(){
        return(
            <div>


<table border="1px"  className="table" >

<tr className="heading" >
    <th>To Do </th>

    <th>On Progress</th>
    <th>Bloked</th>
</tr>
 <tr className="card-table">
     <td></td>
     <td></td>
     <td></td>
 </tr>
 

</table>

</div>
        )
    }
}
export default HomePage