package Finally;

public class GoogleMap {
	void findLocation(String loc) {
		try {
			System.out.println(loc.length());
		}
		catch(NullPointerException n)
		{
			System.out.println(" Google map user please fill the location");
		throw n;	
		}
		}

}
