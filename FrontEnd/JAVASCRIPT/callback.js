// console.log('javascript started')
// setTimeout(function(){//blocking code here it will act asynchronously
// console.log('10 seconds done');
// },10000);
// console.log('javascript ended')


// var i=0;
// setInterval(function(){
//     console.log(i);
//     i++;
//     console.log('1 sec done');
// },1000);

// console.log('javascript ended')


//fat arrow function
var test=(a,b)=>{
    return a*b
}

var test=(a,b)=>a*b;//single row fat arrow functions
console.log(test(12,23))
var demo=a=>a*5;
console.log(demo(12));

