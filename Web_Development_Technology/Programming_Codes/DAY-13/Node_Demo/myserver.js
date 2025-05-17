const http = require("http");
const hostname = "127.0.0.1";
const port = 3000;
var dt = require("./file03modul")
var add1 = require("./add")
// var url = require("./myurl")
var url = require("url")

const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/html');
    // res.write("Current Date Time :"+dt.myDateTime())
    // const result = add1(5,7);
    // console.log(result);
    // res.write(req.url);
    var q = url.parse(req.url , true).query;
    console.log(q);
    console.log(url);
    var txt = "Year : "+q.year + " "+"Month : " + q.month;
    res.end(txt);
    
});

server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
});