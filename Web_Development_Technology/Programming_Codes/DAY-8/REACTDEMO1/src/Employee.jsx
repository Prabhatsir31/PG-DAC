import React from 'react';
import Department from './Department';

function Employee({ name, salary, dept, head }) {
  return (
    <div>
      <p>Name : <b>{name}</b></p>
      <p>Salary : <b>{salary}</b></p>
      <Department dept={dept} head={head} />
    </div>
  );
}

export default Employee;
