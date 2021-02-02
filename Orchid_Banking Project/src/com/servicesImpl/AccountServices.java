package com.servicesImpl;
import com.bean.Account;

// Holding Business Logic Methods
public class AccountServices 
{
	// Data for Business Logic
	private Account acc;
	
	// Business Logic Method
	public int openAccount(String accType, float amount)
	{
		acc = new Account(accType,amount);
		return acc.getAccNo(); //Acknowledging Account number to customer
	}
	
	public static String getIfscCode()
	{
		return Account.ifscCode;
	}
	
	public String displayAccountDetails(int accNo)
	{
		String details=null;
		if(acc.getAccNo()==accNo)
		{
			details = acc.toString();
		}
		else
			details = "Invalid Account Number";
		
		return details;
	}
	
	public float deposit(int no,float amount)
	{
		float updatedBal=0.0f;
		if(acc.getAccNo()==no)
		{
			updatedBal = acc.getAccBal()+amount;
			acc.setAccBal(updatedBal);
		}
		else 
		{
			System.out.println("Wrong Account Number");
		}
		
		return updatedBal;
	}
	
	public float withdrawl(int accNo, float amount)
	{
		float updatedBal = 0.0f;
		if(acc.getAccNo() == accNo)
		{
			if(amount < acc.getAccBal())
			{
				updatedBal = acc.getAccBal()-amount;
				acc.setAccBal(updatedBal);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}			
		}
		else
		{
			System.out.println("Wrong Account Number");
		}
		return updatedBal;
	}
	
	public float balanceEnquiry(int accNo)
	{
		if(acc.getAccNo() == accNo)
		{
			return acc.getAccBal();
		}
		else
		{
			System.out.println("Wrong Account Number");
			return 0;
		}
	}
}
