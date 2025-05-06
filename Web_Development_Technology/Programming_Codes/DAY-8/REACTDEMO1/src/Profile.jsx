import React from "react";
import { Avatar } from "./Avatar";

export default function Profile() {
  return (
    <div>
      <Avatar person={{ name: "img", imageId: 0 }} size={200} />
      <Avatar person={{ name: "img1", imageId: 1 }} size={200} />
      <br />
    </div>
  );
}
