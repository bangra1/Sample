package test;


public class Counter {
	

	private int count;
	
	
	Counter () {count = 0;}
	
	Counter (int c)
	{
		this.count = c;
	}
	
	public void Increment ()
	{
		this.count++;
	}
	
	

	public void Decrement ()
	{
		this.count--;
	}
	
	
	public int GetCount ()
	{
		return count;
		
	}
	
}
