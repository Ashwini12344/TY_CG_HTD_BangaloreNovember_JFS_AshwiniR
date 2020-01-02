let message='good morning folks'
console.log(message.charCodeAt(3));//returns ascii value at particular index
console.log(message.charAt(2));//returns the character in paricular index


let splittedMessage=message.split(' ').reverse().join();
console.log(splittedMessage);//if we pass two spaces full string will be considered as an array
console.log(message.includes('good'));//to check the string for a particular value present in that
//returns boolean
console.log(message.toUpperCase());
console.log(message.substr(1,5));//first argument is the starting index ,second is the length

function add(...nums){
    let sum=0;
    for(let num of nums){
        sum=sum+num;
    }
    console.log('sum of number is',sum)
}
add(12,23,45,67);

let student={
    id: 1234,
    name: 'Ashwini',
    age: 22
};
let {id,name,...theRest}=student;
console.log(name);
console.log(id);
console.log(theRest);



//array destructuring
let marks=[20,40,60,80,90];
let [maths,science,socialScience,...rest]=marks;
console.log('maths marks',maths);
console.log('science marks',science);
console.log('socialScience marks',socialScience);
console.log('rest of marks',rest);

navigator.geolocation.getCurrentPosition((position)=>{
    console.log(position.coords.latitude);
    console.log(position.coords.longitude);

});


// let heading=document.getElementById('heading');
// heading.style.b

function acceptProposal(){
    document.getElementById('proposal').src="http://www.loveimagesdownload.com/wp-content/uploads/2016/08/good-morning-love-wallpaper-4-768x480.jpg";
}
function rejectProposal(){
    document.getElementById('proposal').src="https://i.pinimg.com/236x/d4/d9/0b/d4d90b699c2f25f1a348320e022063f2.jpg";
}