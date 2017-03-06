package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import test.Counter;

import junit.framework.TestCase;

public class CounterTest extends TestCase {

	public Counter c;
	
@Before
	protected void setUp() throws Exception {
	c = new Counter();
	}
@After
	protected void tearDown() throws Exception {
		
	}



@Test
public void testCounter() {
	c.GetCount();
	assertEquals(0, c.GetCount());
	
}

@Test
public void testIncrement() {
	
	c.Increment();
	assertEquals(1, c.GetCount());
}

@Test
public void testCounterInt() {
	
	Counter c = new Counter(2);
	assertEquals(2, c.GetCount());
}



@Test
public void testDecrement_Once() {
	
	c.Decrement();
	assertEquals(-1, c.GetCount());
}

@Test
public void testDecrement_Twice() 
{
	c.Decrement(); c.Decrement();
	assertEquals(-2, c.GetCount());
}


@Test
public void testGetCount() {
		assertEquals(0, c.GetCount());
}

}