import Container from './Container';
import Search from './Search';
import { useState } from 'react';

function Displayemp() {
    const [query, setquery] = useState("");
    return (
        <div className="App">
            <Search onQuery={setquery} />
            <Container query={query} />

        </div>
    );
} 
export default Displayemp;