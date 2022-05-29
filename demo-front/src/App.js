import logo from './logo.svg';
import React, { useState } from "react";
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <AdditionButton />
      </header>
    </div>
  );
}

function AdditionButton (props) {

    const [buttonText, setButtonText] = useState("1");

    async function add() {

       const data = {
       valueA : buttonText
       };
       const response = await fetch('http://localhost:3000/addition?' + new URLSearchParams(data));
       const res = await response.json();
       console.log(JSON.stringify(res));
       setButtonText(JSON.stringify(res));
    }

    return (
        <>
            <button onClick={add}>Click</button>
            <p>{buttonText}</p>
        </>
    );

}

export default App;
