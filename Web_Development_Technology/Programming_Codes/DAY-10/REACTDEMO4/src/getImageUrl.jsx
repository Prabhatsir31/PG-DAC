import React from "react";

function getImageUrl(person) {
  return "https://i.imgur.com/" + person.imageId + "s.jpg";
}

export default getImageUrl;