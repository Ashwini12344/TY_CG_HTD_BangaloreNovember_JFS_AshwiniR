console.log('welcome to typescript')

let a=100;//implicitly considered as let a:number=100
//a='string' error cannot reassign type number to string

let b;
b=100;
b='ashwini'
console.log(b);

let student: { name:string,age:number,pass:boolean};
student={
    name:'XYZ',
    age:35,
    pass:true
}
console.log(student);



//class
class Sample{
    a=100;
    b='abc'
}
let sample1=new Sample();
console.log(a);
console.log(b);

class Student{
    constructor(
        public name: string,
        public age: number,
        public usn: string,
        public marks: number,
        public pan ?: string,
        public aadhar ?: string)
        {

        }

}
    let student1=new Student('Ashwini',23,'qwerty',106);
    console.log('student name is',student1.name);
    console.log('student age is',student1.age);
    console.log('student usn is',student1.marks);
    console.log();

  let student2=new Student('Saif',30,'ABC123',12,undefined,'BPT123RTS');
  console.log(student2);


  let clearedStudents=new Student('ashi',30,'abc123',75);
  console.log(clearedStudents);
  
  
  


console.log('typescrpt ended')