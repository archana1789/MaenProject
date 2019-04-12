package com.flexon.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotationIntestNG {

	@BeforeTest
	public void testOne()
	{	
		System.out.println("We are in the before test");	
	}
	@BeforeClass
	public void testTwo()
	{	
		System.out.println("We are in the before test");	
	}
	@BeforeMethod
	public void testThree()
	{
		System.out.println("We are in before method");
		
	}
	@Test
	public void testFour()
	{
		
		System.out.println("You are in First Test Method");
	}
	@Test
	public void testFive()
	{
		
		System.out.println("You are in second Test Method");
	}
	//---------------------------------------------------------------------
	@AfterTest
	public void testSix()
	{	
		System.out.println("We are in the After test");	
	}
	@AfterClass
	public void testSeven()
	{	
		System.out.println("We are in the After test");	
	}
	@AfterMethod
	public void testEight()
	{
		System.out.println("We are in After method");
		
	}
	

}
