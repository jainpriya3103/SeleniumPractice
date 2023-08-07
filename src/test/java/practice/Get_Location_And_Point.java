package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location_And_Point {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement gujratiElement = driver.findElement(By.xpath("//a[.='ગુજરાતી']"));
		Rectangle data1 = gujratiElement.getRect();
		System.out.println("x coordinate "+data1.getX());
		System.out.println("y coordinate "+data1.getY());
		System.out.println("height "+data1.getHeight());
		System.out.println("width "+data1.getWidth());

	}

}
