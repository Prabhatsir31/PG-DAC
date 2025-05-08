import React from 'react'
import { useState } from 'react'

function Calculator() {

    const[no1,setno1]=useState(0);
    const[no2,setno2]=useState(0);
    const[no3,setno3]=useState(0);
    const [rd,setrd]=useState(null);
    const add=()=>{ 
    let result=""
    if(rd=='+')
        result=(+no1 + +no2);
    else if(rd=='-')
        result=(+no1 - +no2);
    else if(rd=='*')
        result=(+no1 * +no2);
    else if(rd=='/')
        result= +no1 / +no2;
    else if(rd=='%')
        result=(+no1 % +no2);
    else
        alert("Invalid operator");

    setno3(result);
     }
    
  return (
    <>
        <h2><u><i>Calculator</i></u></h2>
        <input name="no1" value={no1} onChange={(e)=>setno1(e.target.value)}/><br />
        <input name="no2" value={no2}  onChange={(e)=>setno2(e.target.value)}/><br /><br />
        <button type="button" onClick={add}>Result</button><br />
        <input name="no3" value={no3}  disabled={true}/><br />
        <input type='radio' name="rd" value='+' checked={rd==='+'} onChange={(e)=>setrd(e.target.value)} />+ 
        <input type='radio' name="rd" value='-' checked={rd==='-'} onChange={(e)=>setrd(e.target.value)} />-
        <input type='radio' name="rd"  value='*' checked={rd==='*'} onChange={(e)=>setrd(e.target.value)}/>*
        <input type='radio' name="rd" value='/' checked={rd==='/'} onChange={(e)=>setrd(e.target.value)}/>/
        <input type='radio' name="rd" value='%' checked={rd==='%'} onChange={(e)=>setrd(e.target.value)}/>%
        
    </>
    );
}

export default Calculator
