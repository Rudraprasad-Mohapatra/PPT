// Get the box element
const box = document.getElementById("myBox");

// Retrieve the rendered width and height

let currHeight = box.offsetHeight;
let currWidth = box.offsetWidth;
console.log(currHeight," ",currWidth)
const handleClick = ()=>{
    box.style.backgroundColor = "yellow"; 
    box.style.width = `${currWidth * 2}px`;
    console.log(box.style.width)
    box.style.height = `${currHeight * 2}px`;
    console.log(box.style.height);
}

box.addEventListener("click",handleClick);