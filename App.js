import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import CiudadanosCrud from './Components/CiudadanosCrud';

function App() {
  const handleLogin = (role) => {
    // Aquí podrías agregar lógica para manejar el inicio de sesión con El Ojo o Miranda
    console.log(`Iniciar sesión como ${role}`);
  };

  return (
    <Router>
      <div className="App">
        <header className="App-header">
          <h1>Bienvenido a Eastview</h1>
          <div className="login-buttons">
            <button className="login-button" onClick={() => handleLogin('El Ojo')}>
              Entrar como El Ojo
            </button>
            <button className="login-button" onClick={() => handleLogin('Miranda')}>
              Entrar como Miranda
            </button>
          </div>
        </header>
      </div>
      <Routes>
        <Route path="/ciudadanos-crud" element={<CiudadanosCrud />} />
      </Routes>
    </Router>
  );
}

export default App;
