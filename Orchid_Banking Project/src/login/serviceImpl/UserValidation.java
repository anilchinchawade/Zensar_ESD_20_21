package login.serviceImpl;
import login.bean.User;

public class UserValidation 
{
	private User user;
	
	public void SignUp(String userName,String password, String securityQuestion,String securityAnswer) 	
	{
		user=new User(userName,password,securityQuestion,securityAnswer);
		/*
		 * user.setUserName(userName); user.setPassword(password);
		 * user.setSecurityQuestion(securityQuestion);
		 */
	}
	
	public String SignIn(String userName, String password)
	{
		String message=null;
		if(user.getUserName() == userName && user.getPassword() == password)
		{
			message = "Login Successful";
		}
		else
		{
			message = "Username and/or password is/are not matching";
		}
		return message;
	}
	
	public String ForgetPassword(String SecurityQuestion,String securityAnswer)
	{
		if(user.getSecurityQuestion() == SecurityQuestion && user.getSecurityAnswer() == securityAnswer)
		{
			return user.getPassword();
		}
		else
			return "Your Security Question and/or Security Answer is/are not matching";
	}
	
	public String updatePassword(String userName, String oldpassword, String newPassword)
	{
		String message=null;
		if(user.getUserName() == userName && user.getPassword()==oldpassword)
		{
			user.setPassword(newPassword);
			return "New Password Set successfully";
		}
		else
			return "Username and/or password is/are not matching";
	}
}

