package com.bean;

// To Carry Data----- Java Bean Reusable Component
// Rules to create a data carrier
//1. Data Class must be embedded in one of the packages
//2. Data carrier class must be public
//3. Data members of Data Carrier class must be private
//4. Per variable we must have one version of setter and getter method
//5. Should have parameterized constructor for data initialization
//6. Must have toString()

//What not to do: 1. Should not add business logic methods in Data Carrier class

public class Account 
{
	// Data Abstraction
		private int accNo;
		private String accType;
		private float accBal;
		
	public Account(int accNo, String accType,float accBal) 
	{		
		this.accNo = accNo;
		this.accType = accType;
		this.accBal = accBal;
		//System.out.println("Data inside constructor:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal);
		//If we print only this reference then also we get object content as it refers to current object.
		//System.out.println(this);
	}
	
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}	
	public void setAccType(String accType)
	{
		this.accType = accType;
	}	
	public void setAccBal(float accBal) 
	{
		this.accBal = accBal;
	}
	
	
	//getter to get object data
	public int getAccNo()
	{
		return accNo;
	}	
	public String getAccType()
	{
		return accType;
	}	
	public float getAccBal() 
	{
		return accBal;
	}
	
	public String toString()
	{
		return "The Account Details are:Account Number: "+accNo+"\nAccount Type: "+accType+"\nAccount balance:"+accBal;
	}	

}
