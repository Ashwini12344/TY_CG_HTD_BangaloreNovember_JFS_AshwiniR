var a;//variable declaration
a=100;//variable initialisation
console.log('value of a is')
console.log(typeof a);

var name="ashwini"
console.log(name);
console.log(typeof name);

var age=67;
var details=`The name is ${name} and age is ${age}`;//string interpolation
console.log(details);
console.log(`the sum of 10 and 11 is ${10+11}`)


//having multiple line strings
var sampleText=` Lorem ipsum dolor sit amet consectetur adipisicing elit. Laborum exercitationem eligendi, odio sint possimus eum nesciunt. Reiciendis vel nihil non aliquam? Soluta velit nemo quibusdam similique, dignissimos inventore numquam itaque.`;
console.log(sampleText);
var icompassCleared=true;
console.log(typeof icompassCleared);


var b;
console.log(typeof b);


var empty=null;
console.log(typeof empty)

if(null==undefined){   //==
    console.log('true block')

}
else{
    console.log('false block')
}

if(null===undefined){//strict  equals comparision operator
    console.log('true block')
}
else{
    console.log('false block')
}
var userConfirmation=confirm('are you sure to proceed');
console.log(userConfirmation)

if(userConfirmation){
    console.log('the user selected ok')
}
else{
    console.log('the user cancelled operation')
}
//var userInput=prompt('please enter your name')
//console.log(userInput)


//document.write("welcome to javascript")
var a='xyz'
function demo(){
    console.log(a);
    var b=100;
    console.log('function demo is being processed')
}
//console.log(b)
//throws error b is not defined
//it is a local scoped variable

function add(a,b){
    return a+b;
}
console.log(add(1,2));

 var test=function(){
 console.log('anonymous function is assigned  to variable test')
 }
 test();
 
 
 (function demo1(){
     var myName="Ashwini"
     console.log('inside function',myName);
     console.log('IIFE running')
 })();

 console.log('outside function',myName)

 (function(a,b){
var myname='savithri';
console.log('inside fun',myname)
})(12,23);


function sample(x){
    console.log('sample function started')
    x();
    console.log('sample function ended')
}
sample(function(){
    console.log('callback function running')
});