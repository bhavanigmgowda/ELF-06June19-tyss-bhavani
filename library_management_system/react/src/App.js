import React from 'react';

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Login from './components/login/Login'
import AdminHome from './components/admin/HomePage'
import  './App.css';
import allUser from './components/admin/AdminSearch'
import createuser from './components/admin/CreateUser'

function App() {
  return (
    <Router>
          <Route exact path='/' component={Login}></Route>
          <Route  path='/adminhome' component={AdminHome}></Route>
          <Route  path='/createuser' component={createuser}></Route>
          
          <Route  path='/allUser' component={allUser}></Route>
        </Router>
      
  );
}

export default App;