function call()
{
    document.write("Hello from script.js <br />");
}

document.write("<br />");

function go()
{
    document.write("Hello");
}
document.write("<br />");

go();
document.write("<br />");

var r = go();
console.log(r);

document.write("<br />");

document.write(typeof(go));


document.write("<hr />");


document.write(go);
document.write("<br />");

(function(){
    document.write("IIFE");
}())

document.write("<br />");

function call(a,b)
{
    var p;
    b=b || 3;
    p=a*b;
    return p;
}

var x ,y;
x=5;
y=7;
var r = call(x);
document.write(typeof(r));
document.write("<br />");
document.write(call(3,3));

document.write("<br />");

function findMax() {
var i, max = arguments[0];
    for (i = 1; i < arguments.length; i++) {
        if (arguments[i] > max) {
            max = arguments[i];
}
 console.log(arguments);
 console.log(typeof arguments)//Object
     }
     return max;
 }
 var x = findMax(1, 123, 500, 115, 44, 88);

 document.write(x);

 document.write("<br />");

function myFunction(x, y, z) 
{   
return x+y+z;
}
var args = [0, 1, 2];
var r=myFunction(...args);
console.log(r);

document.write("<br />");

function myFunction(v, w, x, y, z) { }
var args = [0, 1];
myFunction(-1, ...args, 2)

document.write("<br />");

//NOT A GOOD PRACTISE
//observe you have not used use strict
var x; //global variable
function call()
{
//a=5; //global variable
var c=7; //local variable
document.write("welcome");
document.write("<br />");
alert("hi");
x=9;
}
//document.write(a); //uninitialized variable as function call is not done yet
call();
//document.write(a); //5  as it is define after function call
//document.write("with var"+c); //out of scope
document.write(x);

document.write("<br />");


let s=function(a){
return a*a
}

let c=function(a) {
return a*a*a
}

var go=function(w,d) {
document.write(w(d));    
document.write("<br />");
}

let ans=go(c,2)
document.write(ans);

document.write("<br />");


var r=(function(a){
return a*a;
}(5))
document.write(r);

var reflect = function(value) {
return value;
};
document.write(reflect(22));
document.write("<br />");

//Arrow function
var reflect1 = value => value;
document.write(reflect1(67));

document.write("<br />");

var sum = function(num1,num2)
{
return num1 + num2;
};
document.write(sum(5,5));
document.write("<br />");


//Arrow function
var sum1 = (num1, num2) => num1 + num2;
document.write(sum(5,7));

function myFunction() {
    alert("HELLO");
    OBJHI = document.getElementById("Demo");
    alert(OBJHI);

    OBJHI.innerHTML = "Paragraph changed";
}