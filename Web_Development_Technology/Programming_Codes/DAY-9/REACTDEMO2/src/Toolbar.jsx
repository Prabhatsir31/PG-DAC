import React from 'react'
import Button from './Button'

function Toolbar({onPlayMovie, onUploadImage}) {
  return (
    <div>
        <Button onClick={onPlayMovie}>Play Movie</Button>{" "}
        <Button onClick={onUploadImage}>Upload Image</Button>

        {/* <Button onData={onPlayMovie}>Play Movie</Button>{" "}
        <Button onData={onUploadImage}>Upload Image</Button> */}
    </div>
  )
}

export default Toolbar
