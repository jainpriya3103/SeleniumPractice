package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Css_Value {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement fontSizeElement= driver.findElement(By.xpath("//img[contains(@class,\"u img\")]"));
		String fontSize = fontSizeElement.getCssValue("color");
		System.out.println(fontSize);
		Thread.sleep(1000);
		driver.close();
		

	}

}
