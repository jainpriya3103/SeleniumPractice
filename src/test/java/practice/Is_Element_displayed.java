package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Element_displayed {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement logoElement = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		boolean isElememtDisplayed = logoElement.isDisplayed();
		if (isElememtDisplayed) {
			System.out.println("element dispayed");
		}
		
		else
		{
			System.out.println("element not displayed");
		}
	}

}
