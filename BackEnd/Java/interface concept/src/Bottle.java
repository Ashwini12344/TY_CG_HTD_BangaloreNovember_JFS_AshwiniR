
public interface Bottle {
	void open();
	void drink();
	default void juice()
	{
		
	}
	static void close()
	{
		System.out.println("bottle is closed");
	}

}
