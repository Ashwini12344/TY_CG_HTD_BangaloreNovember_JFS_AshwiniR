// var person={
//     aadharno=2345678
//  }
// var student={...person//spread
// id:1234,
// name:'Ashwini',
// degree:'BE fail',
// phone:9090909090,
// address: {
//     city:'bangalore',
//     state:'karnataka',
//     pinCode:560078
// }

// }
// console.log(student.address.city)
// console.log(student.name)
// console.log(student["degree"])
// //console.log(student.aadharno)
// // console.log(student.phone)


// var technologies=['java','jdbc','spring','hibernate',1234,true,null];
// console.log(technologies[6])//drawback even if data does not belong it stores
// for(let technology of technologies){//forOf
//     console.log(technology)
// }
// for(let index in technologies){
//     console.log('index is'+index+'value is'+technologies[index])
// }
// for(let key in student){
//     console.log(key+':::'+student[key])
// }
// technologies.forEach((value,index) => {
//     console.log(value);
//     console.log(index);
// });
// var marks=[1,20,30,11,15,22]
// console.log(marks*3)

// console.log('index of spring is'+technologies.indexOf('spring'));
// console.log('before pop',technologies)
// technologies.pop();//returns value in the last index
// console.log('after pop',technologies)

// console.log('before pushing the element',technologies)
// technologies.push('spring boot','spring rest');//push
// console.log('after pushing the elements',technologies)

// console.log('before shift',technologies);
// console.log(technologies.shift());
// console.log('after shift',technologies);
// technologies.splice(2,0,'bootstrap','javascrip','java')
// console.log('splice applied to add few elements',technologies)
// technologies.splice(technologies.indexOf(1234),2)
// console.log('after deleting unwanted elements',technologies)
// console.log(technologies.length);//to find the length of the array
// technologies.reverse();
// console.log('reversed array',technologies);


// let  marks1=[12,30,45,60,90,11,34,67,86];
// console.log(marks1);
// //filtering array for marks greater then 40
// let filteredArray1=marks1.filter((value,index,array)=>{
// return value>40;
// });

// console.log(filteredArray1.length);

// let marks2=[20,20,20,30,40,40,50,60,70,70];//for unique elements
// console.log(marks2);
// let filteredArray2=marks2.filter((value,index,array)=>{
//     return array.indexOf(value)===index;
// });



// //map 
// let newArray=marks2.map((value,index,array)=>{
//     return {ind:index, val:value};
//     console.log(newArray);
// });

let marks=[12,45,54,23,34,67,53,78,90,63];
let ascendingOrderOfMarks=marks.sort((a,b)=>{
    return a-b;
});
console.log('in ascending order',ascendingOrderOfMarks);
let descendingOrderOfMarks=marks.sort((a,b)=>{
    return b-a;
});
console.log('descending order',descendingOrderOfMarks);