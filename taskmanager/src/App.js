 import React from 'react';

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Login from './components/login/Login'
import HomePage from './components/homePage/HomePage'
import Stiky from './components/Sticky/Sticky'
import createTask from './components/createTask/CreateTask'
import createUser from './components/createUser/createUser'
import myprofile from './components/createUser/MyProfile'

import navBar from './components/navBar/NavBar'
import tome from './components/homePage/Tome'
import byme from './components/homePage/Byme'

import AllTask from './components/createTask/AllTask';
import searchPage from './components/createTask/AllTask';
import completedTask from './components/homePage/CompletedTask';
import forgot from './components/login/forgot';
import conform from './components/login/conform';

import dnd from './components/Dnd';
function App() {
  return (

<div>

    <Router>

          <Route exact path='/' component={Login}></Route>
          <Route exact path='/homePage' component={HomePage}></Route>
          <Route exact path='/Stiky' component={Stiky}></Route>
          <Route exact path='/createTask' component={createTask}></Route>
          <Route exact path='/createUser' component={createUser}></Route>
          <Route exact path='/tome' component={tome}></Route>
          <Route exact path='/allTask' component={AllTask}></Route>
          <Route exact path='/completedTask' component={completedTask}></Route>
          <Route exact path='/searchPage' component={searchPage}></Route>
          <Route exact path='/navBar' component={navBar}></Route>
          <Route exact path='/myprofile' component={myprofile}></Route>
          <Route exact path='/byme' component={byme}></Route>
          <Route exact path='/dnd' component={dnd}></Route>  
          <Route exact path='/conform' component={conform}></Route> 
          <Route exact path='/forgot' component={forgot}></Route> 
          </Router>
         </div>
  );
}

export default App; 


