package login.client;

import login.serviceImpl.UserValidation;

public class LoginClientCode 
{

	public static void main(String[] args) 
	{
		UserValidation services = new UserValidation();
		services.SignUp("Anil", "anil@123", "What is your name");
		
		String msg = services.SignIn("Anil", "anil@12");
		System.out.println(msg);
		
		msg = services.ForgetPassword("What is your Name");
		System.out.println(msg);
		
		msg = services.updatePassword("Anil", "anil@123", "anil@789");
		System.out.println(msg);
		
		msg = services.SignIn("Anil", "anil@123");
		System.out.println(msg);
		
		msg = services.SignIn("Anil", "anil@789");
		System.out.println(msg);
	}

}
