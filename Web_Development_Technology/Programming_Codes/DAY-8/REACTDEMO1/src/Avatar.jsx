import Getmimg from "./Getming";

export function Avatar({person,size=200}) {

//read image name from array and concat
 const imgurl=Getmimg(person.imageId);
 const imgsrc='Images/'+imgurl+'.jpg';
 <img src={person.imageId} alt={person.name} />
 return (
    <>
   <img
        style={{ borderRadius: "50%", border: "2px solid gray" }}
        src={imgsrc}
        alt={person.name}
        width={size}
        height={size}
/>
   <h3>{person.name}</h3>
    </> 
 );
}   
