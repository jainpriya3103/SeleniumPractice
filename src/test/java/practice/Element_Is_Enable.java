package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Is_Enable {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement buttonElement = driver.findElement(By.xpath("//div[text()='Login ']"));
		if (usernameTextField.isEnabled()) {
			usernameTextField.sendKeys("admin");
		}
		else
		{
			System.out.println("not enable");
		}
		
		if (buttonElement.isEnabled()) {
			buttonElement.click();
		}
		else
		{
			System.out.println("not enable");
		}

	}

}
