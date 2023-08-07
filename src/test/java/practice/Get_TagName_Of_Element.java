package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_TagName_Of_Element {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        WebElement userNameElement = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        String tagName = userNameElement.getTagName();
        System.out.println("html tag for username textfield is: "+tagName);
        WebElement logoElement = driver.findElement(By.cssSelector(".atLogoImg"));
        String logoTagName = logoElement.getTagName();
        System.out.println("html tag for logo is " +logoTagName);
	}

}
