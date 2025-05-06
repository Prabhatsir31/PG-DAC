import React from 'react';

const Department = ({ dept, head }) => {
  return (
    <div>
      <p>Department Name : <b>{dept}</b></p>
      <p>Department Head : <b>{head}</b></p>
    </div>
  );
};

export default Department;
