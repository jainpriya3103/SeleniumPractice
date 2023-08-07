package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Type_Of_WebElement {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
        String typeOfElement = passwordElement.getAriaRole();
        System.out.println("type of element is " +typeOfElement);
        WebElement logoElement = driver.findElement(By.cssSelector(".atLogoImg"));
        String typeOfLogoElement = logoElement.getAriaRole();
        System.out.println(typeOfLogoElement);
        WebElement remembermeCheckBox = driver.findElement(By.cssSelector("#keepLoggedInCheckBox"));
        System.out.println(remembermeCheckBox.getAriaRole());
	}

}
