package com.pack.mockitodemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;


public class MockCalculatorService {
   Calculator c1=null;
   CalculatorService cs=Mockito.mock(CalculatorService.class);
	@Test
	public void testOperation() {
		assertEquals(0,c1.performCalculation(cs));
		System.out.println("Tested operation!!");
	}
	@Before
	public  void createObject()
	{
		System.out.println("Object created");
		c1=new Calculator();
		/*Anonymous class
		cs=new CalculatorService() {
			
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}*/
		}
	
	@After
	public void removeObject() {
		System.out.println("Object dereferenced..");
		c1=null;
		
	}
	
}
