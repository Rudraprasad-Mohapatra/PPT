// 3.Continuing assignment 2. Here, let’s create a new file named index2.js and use the fs module to read the content of nodejs_architecture&txt and print the content to the console.

const fs = require("fs");
const filedata = fs.readFileSync("nodejs_architecture.txt",{ encoding: 'utf-8', flag: 'r+'
})

console.log(filedata); //if encoding and flag is not mentioned so write filedata.toString()

fs.readFile("nodejs_architecture.txt",{encoding:"utf8",flag:"r+"},(err,data)=>{
    if(err) console.log(err);
    else console.log(data);
})