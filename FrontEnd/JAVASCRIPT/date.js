var date=new Date();
console.log(date.getDate());
console.log(date.getMonth()+1)
console.log(date.getFullYear());
console.log(date.getHours());
console.log(date.getMinutes());
setInterval(()=>{
document.getElementById('todaysDate').innerHTML=`Date::: ${date.getDate()}-${date.getMonth()+1}-${date.getFullYear()}`
})