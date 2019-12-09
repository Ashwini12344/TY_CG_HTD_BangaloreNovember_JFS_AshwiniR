package Customexception;

public class ATMSimulation {
	void withdraw(double amount) {
		if(amount>40000)
		{
			throw new DayLimitException();
		}
	}

}
