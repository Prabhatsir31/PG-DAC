import React from "react";

const user = {
  name: "John Doe",
  imageUrl:
    "https://www.skyweaver.net/images/media/wallpapers/wallpaper1.jpg",
  imageSize: 120,
};
function ImageData() {
  return (
    <>
      <h1>{user.name}</h1> {" "}
      <img className="avatar" src={user.imageUrl} alt={"Photo of " + user.name} 
        style={{ width: user.imageSize, height: user.imageSize}}
      />
    {" "}
    </>
  );
}

export default ImageData;
