var express = require("express");
var app = express();
app.use(express.json());

app.use(express.static("public"));

// app.get("/getform", function (req, res) {
//   res.sendFile(__dirname + "/" + "index_get.html");
// });
// app.get("/process_get", function (req, res) {
  
//   response = {
//     first_name: req.query.first_name,
//     last_name: req.query.last_name,
//   };
//   console.log(response);
//   res.end(JSON.stringify(response));
// });

// app.use(express.urlencoded({ extended: false }));
// app.get("/postdata", function (req, res) {
//   res.sendFile(__dirname + "/" + "index_post.html");
// });



app.post('/myjson', (req,res) => {
  // console.log('Recieved JSON: ', req.body);

  res.json(req.body);
});


// app.post("/process_post", function (req, res) {
//   //PrepareoutputinJSONformat
//   response = {
//     first_name: req.body.first_name,
//     last_name: req.body.last_name,
//   };
//   console.log(response);
//   res.end(JSON.stringify(response));
// });

var server = app.listen(8081, function () {
  var host = server.address().address;
  var port = server.address().port;
  console.log("Example app listening at http://%s:%s", host, port);



});
