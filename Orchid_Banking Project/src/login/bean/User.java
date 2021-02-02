package login.bean;

public class User 
{
	private String userName;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	
		
	public User(String userName, String password, String securityQuestion,String securityAnswer) 
	{
		this.userName = userName;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	public String getPassword() 
	{
		return password;
	}
	public String getSecurityQuestion() 
	{
		return securityQuestion;
	}
	
	public String getSecurityAnswer() 
	{
		return securityAnswer;
	}
		
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public void setSecurityQuestion(String securityQuestion) 
	{
		this.securityQuestion = securityQuestion;
	}
	
	public void setSecurityAnswer(String securityAnswer) 
	{
		this.securityAnswer = securityAnswer;
	}
	
	@Override
	public String toString() 
	{
		return "User [userName=" + userName + ", password=" + password + ", Security Question=" + securityQuestion + ", Security Answer=" + securityAnswer+ "]";
	}
	
}
