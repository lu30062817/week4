
public class Test {

	public static void main(String[] args) 
	{
		FishTankCollectionImplementation fishTank = new FishTankCollectionImplementation();
		Iterator iter=fishTank.getIterator();
		while(iter.hasNext())
		{
			String message=(String)iter.next();
			System.out.println(message);
		}

	}

}
