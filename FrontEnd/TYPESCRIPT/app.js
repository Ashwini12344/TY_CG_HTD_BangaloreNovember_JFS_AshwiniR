"use strict";
console.log('welcome to typescript');
var a = 100; //implicitly considered as let a:number=100
//a='string' error cannot reassign type number to string
var b;
b = 100;
b = 'ashwini';
console.log(b);
var student;
student = {
    name: 'XYZ',
    age: 35,
    pass: true
};
console.log(student);
//class
var Sample = /** @class */ (function () {
    function Sample() {
        this.a = 100;
        this.b = 'abc';
    }
    return Sample;
}());
var sample1 = new Sample();
console.log(a);
console.log(b);
var Student = /** @class */ (function () {
    function Student(name, age, usn, marks, pan, aadhar) {
        this.name = name;
        this.age = age;
        this.usn = usn;
        this.marks = marks;
        this.pan = pan;
        this.aadhar = aadhar;
    }
    return Student;
}());
var student1 = new Student('Ashwini', 23, 'qwerty', 106);
console.log('student name is', student1.name);
console.log('student age is', student1.age);
console.log('student usn is', student1.marks);
console.log();
var student2 = new Student('Saif', 30, 'ABC123', 12, undefined, 'BPT123RTS');
console.log(student2);
var clearedStudents = new Student('ashi', 30, 'abc123', 75);
console.log(clearedStudents);
console.log('typescrpt ended');
