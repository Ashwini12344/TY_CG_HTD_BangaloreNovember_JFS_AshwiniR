
public class Employee {
	String empName;
	int empAge;
	double empSalary;
	Employee(String Name,int age,double salary)
	{
		empName=Name;
		empAge=age;
		empSalary=salary;
	}
void empDetails()
{
	System.out.println("empName: "+empName+" empAge: "+empAge+" empSalary:"+empSalary);
}
}
