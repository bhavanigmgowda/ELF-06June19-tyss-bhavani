import React from 'react';

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Login from './components/login/Login'
import HomePage from './components/homePage/HomePage'
import Stiky from './components/Sticky/Sticky'
import createTask from './components/createTask/CreateTask'
import createUser from './components/createUser/createUser'

function App() {
  return (
    <Router>
          <Route exact path='/' component={Login}></Route>
          <Route exact path='/homePage' component={HomePage}></Route>
          <Route exact path='/Stiky' component={Stiky}></Route>
          <Route exact path='/createTask' component={createTask}></Route>
          <Route exact path='/createUser' component={createUser}></Route>
         </Router>
      
  );
}

export default App;