interface Trainee{
    name: string,
    age: number,
    printData(): void
}
class Training implements Trainee{
    name= 'abc';
    age=22;
    usn='1ck15cs008'
    marks=100;
    aadharNo=123;
    panNo='abc1234'
    printData(){
        console.log('hi')
    }
}

let trainee1:Trainee={
    name:'Deepika',
    age:45,
    
}