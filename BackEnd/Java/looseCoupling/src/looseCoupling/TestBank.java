package looseCoupling;

public class TestBank {
	public static void main(String[] args) {
		HDFC h=new HDFC();
		Bank b1=new Bank();
		SBI s1=new SBI();
		h.anyCard(s1);
		
	}

}
