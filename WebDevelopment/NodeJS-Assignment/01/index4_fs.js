// 4. In this coding challenge, you will continue working with the file created in the previous assignments& Here your task is to access the existing nodejs_architecture&txt file and use the fs module to append additional data to it& Specifically, add some advantages of Node.js to the file and print the file content to the console.
const fs = require("fs");
const appendData = `\n1.Scalability and extensibility.
\n2.Flexibility and simplicity
\n3.Self-sufficiency and availability
\n4.Community support
\n5.Ability to incorporate it with various helpful tools
High-performance for real-time applications
\n6.Easy scalability for modern applications
\n7.Web app development`

fs.appendFileSync("nodejs_architecture.txt",appendData,{encoding: "utf8", mode: 0o666, flag: "a"},(err) => {
  if (err) {
    console.log(err);
  }})

fs.readFile("nodejs_architecture.txt",{encoding:"utf8",flag:"r+"},(err,data)=>{
    if(err) console.log(err);
    else console.log(data);
})