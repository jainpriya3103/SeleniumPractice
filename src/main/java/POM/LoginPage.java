package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username") 
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(className="initial")
	private WebElement loginButton;

	public WebElement getUsername() {
		return usernameTextField;
	}

	public void setUsername(WebElement username) {
		this.usernameTextField = username;
	}

	public WebElement getPassword() {
		return passwordTextfield;
	}

	public void setPassword(WebElement password) {
		this.passwordTextfield = password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	public void loginToApp(String userName,String password)
	{
		usernameTextField.sendKeys(userName);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
}
