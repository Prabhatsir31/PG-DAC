import { useState } from "react";
import { people } from "./data.js";
import getImageUrl from "./getImageUrl.jsx";

export default function List() {
    const[data,setData] = useState(people)
     
 
    // let data = people
    function handeldata(){
        const chemist =people.filter(person => person.profession == "chemist")
        setData(chemist)
        console.log(data)
    }
    const listItems = data.map(person =>
        <li>
            
            <img
                src={getImageUrl(person)}
                alt={person.name}
            />
            <p>
                <b>{person.name}:</b>
                {' ' + person.profession + ' '}
                known for {person.accomplishment}
            </p>
        </li>
    );
    return (
        <div>
            <h1><i>List of Chemists</i></h1>
            <ul>{listItems}</ul>
            <button onClick={handeldata}> filter chem</button>
        </div>
    )
    
}

