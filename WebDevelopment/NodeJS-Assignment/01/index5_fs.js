// 5.To wind up the fs module walk"through challenges, let’s delete the nodejs_architecture&txt file& On deletion print "File Deleted SuccessFully" to the console.
const fs = require("fs");
fs.unlink("nodejs_architecture.txt",(err)=>{
    if(err) 
        console.error(err);
    else
        console.log("File Deleted SuccessFully");
})