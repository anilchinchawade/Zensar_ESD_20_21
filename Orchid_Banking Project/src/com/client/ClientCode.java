package com.client;

import com.servicesImpl.AccountServices;

//Managing flow of execution of your client-code
public class ClientCode 
{

	public static void main(String[] args) 
	{
		AccountServices services = new AccountServices();
		
		int accNo = services.openAccount("Demat", 20000f);
		System.out.println("The new account opened with account number "+accNo);
		
		String details = services.displayAccountDetails(accNo);
		System.out.println(details);
	}

}
