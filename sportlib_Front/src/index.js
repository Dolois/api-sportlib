// J'importe React et React dom pour pouvoir créer une application avec React
import React from 'react';
import ReactDOM from 'react-dom';

// J'importe mon composant App qui sera le parent principal de mon application
import App from './App';

// Nous utilisons ReactDOM.render pour initialiser notre application avec le composant App.
ReactDOM.render(
  <App />,

  // Nous allons instancier cette application dans l'élément node qui a pour ID root
  document.getElementById('root')
);