import './App.css'
import { useEffect, useState } from 'react';


const fetchData = async () => {
  const res = await fetch("https://icanhazdadjoke.com/", {
    headers: { Accept: "application/json" }
  });
  const data = await res.json();
  return data
}

function App() {
  const [joke, setJoke] = useState('')
  const [list, setList] = useState([])

  const handleLike = (joke) => {
    const hasJoke = list.findIndex(item => item.id === joke.id)
    if (hasJoke > -1) return

    setList([...list, joke])
  }

  const handleDislike = () => { setList([...list]) }

  useEffect(() => {
    fetchData().then(joke => setJoke(joke))
  }, [list])

  return (
    <div className='container'>
      <Joke data={joke} onLike={handleLike} onDislike={handleDislike} />
      <ul>
        {list.map(item => (
          <li key={item.id}>{item.joke}</li>
        ))}
      </ul>
    </div>
  );
}

function Joke({ data, onLike, onDislike }) {
  return (
    <div className='joke-container'>
      <h1>Dad Jokes</h1>
      <span className='joke-box'>{data.joke}</span>
      <div>
        <button className="like" onClick={() => onLike(data)}>Like</button>
        <button className="dislike" onClick={() => onDislike()}>Dislike</button>
      </div>
    </div>
  )
}


export default App;
