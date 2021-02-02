package com.client;

import com.servicesImpl.AccountServices;

//Managing flow of execution of your client-code
public class ClientCode 
{

	public static void main(String[] args) 
	{
		AccountServices services = new AccountServices();
		
		int accNo1 = services.openAccount("Demat", 20000f);
		System.out.println("The new account opened with account number "+accNo1);
		
		String details = services.displayAccountDetails(accNo1);
		System.out.println(details);
		
		int accNo2 = services.openAccount("Savings", 5000f);
		System.out.println("The new account opened with account number "+accNo2);
		
		details = services.displayAccountDetails(accNo2);
		System.out.println(details);
		
		int accNo3 = services.openAccount("Current", 55000f);
		System.out.println("The new account opened with account number "+accNo3);
		
		details = services.displayAccountDetails(accNo3);
		System.out.println(details);
	}

}
