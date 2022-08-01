import logo from './logo.svg';
import './App.css';
import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
    const [hello, setHello] = useState('');
    const [cities, setCities] = useState([]);

    useEffect(() => {
        axios.get('/api/home')
            .then(response => setHello(response.data))
            .catch(error => console.log(error))
    }, []);
    useEffect(() => {
        axios.get('/auth/city/doviewall')
            .then(response => setCities(response.data))
            .catch(error => console.log(error))
    }, []);
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <h3 key={hello}>{hello}</h3>
            </header>
            <div>
                {cities.map(item =>
                    <p key={item.codeId}>{item.nameKor}({item.nameEng}) {item.population}명</p>)}
            </div>
        </div>
    );
}

/*function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    axios.get('/api/home')
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
  }, []);

  return (
      <div>
        백엔드에서 가져온 데이터입니다 : {hello}
      </div>
  );
}*/

export default App;
