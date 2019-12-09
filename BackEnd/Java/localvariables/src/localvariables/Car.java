package localvariables;

public class Car extends Vehicle {
	int cost=10000;
	void carDetails()
	{
		int cost=50000;
		System.out.println("cost of car is"+cost);
		System.out.println("cost of car is"+this.cost);
		
	}

}
