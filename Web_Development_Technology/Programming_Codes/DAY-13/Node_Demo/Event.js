const { log } = require("console");
var events = require("events");
var eventEmitter = new events.EventEmitter();

var connectHandler = function connected() {
    console.log("Connnection successful.");
}

eventEmitter.on("connection", connectHandler);

eventEmitter.on("data_recieved", function () {
    console.log("Data recieved duccessful"); 
});

eventEmitter.emit("connection");

eventEmitter.emit("data_recieved");

console.log("Program Ended.");
