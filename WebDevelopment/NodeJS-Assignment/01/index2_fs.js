// 1.In this coding challenge, your task is to create a package&json file for your project using the npm init command & The package.json file is essential for managing dependencies, scripts, and other project"related details" Below is the expected folder structure

// 2.In the same project directory created in the above assignment, your task is to create a new file index&js and using the fs module add information about Node&js architecture to a new file nodejs_architecture&txt& Below are the expected files in the project folder
const fs = require("fs");
const data = "Node.js is a JavaScript-based platform that is mainly used to create I/O-intensive web applications such as chat apps, multimedia streaming sites, etc."
fs.writeFile("nodejs_architecture.txt",data,"utf8",function(err) {console.log(err);});