package users;

public class GenericPublicUser implements User 
{
	private String username, password;
	public void setUserName(String username) 
	{	
		this.username=username;
	}
	public void setPassWord(String password) 
	{	
		this.password=password;
	}
	public String getUserName() 
	{
		return username;
	}
	public String getPassWord()
	{
		return password;
	}
}
