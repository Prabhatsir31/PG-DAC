// var fs = require("fs");
// // var data = fs.readFileSync("input.txt");

// var data = fs.readFile("input.txt",function(err,data){
//     if(err) return console.log(err);
//     console.log(data.toString());
// });

// console.log("Program ended");


var http=require('http');
var url=require('url');
var fs=require('fs');
http.createServer(function(req,res){
var q=url.parse(req.url,true);
var filename="."+q.pathname;
fs.readFile(filename,function(err,data){

if(err){
res.writeHead(404,{'Content-Type':'text/html'});
return res.end("404NotFound");
}
res.writeHead(200,{'Content-Type':'text/html'});
res.write(data);
return res.end();
});
}).listen(8080);
console.log("server started")
