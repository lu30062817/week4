
public class FishTankCollectionImplementation implements FishTankCollection
{
    public String[] fishTank= {"Categories: Small, mid-sized and Large",
    							"Types: ColdWaterTank, Tropical Freshwater tank, Reef tank, Brackish tank etc..",
    							"Filled capacity varies from 5 gallon to 180 gallons"};
	@Override
	public Iterator getIterator() 
	{
		return new FishTankIteratorImplementation();
	}

	private class FishTankIteratorImplementation implements Iterator
	{
		int index=0;

		@Override
		public Object next() 
		{
			if(hasNext())
			{
				return fishTank[index++];
			}
			else
			{
				return null;
			}
		}

		@Override
		public boolean hasNext() 
		{
			if(index<fishTank.length)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}
}
