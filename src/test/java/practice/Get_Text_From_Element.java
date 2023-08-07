package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_From_Element {

	public static void main(String[] args) throws InterruptedException {
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("iphone13");
		searchTextField.submit();
		Thread.sleep(1000);
        WebElement phoneNameElement = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"));
        String phoneName = phoneNameElement.getText();
        System.out.println(phoneName);
        Thread.sleep(1000);
        
        //1 here we going to supermost parent by using /.. 
       /* WebElement phonePriceElement = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']/../../../"
        		+ "div[2]/div[2]/div[1]/div[1]/div[1]"));*/
        //2 here we are using ancestor to reach supermost parent to reduce the length of xpath
        /*WebElement phonePriceElement = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']/ancestor::"
        		+ "div[2]/div[2]/div[1]/div[1]/div[1]"));*/
        WebElement phonePriceElement = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']/ancestor::div[2]/descendant::div[9]"));
        String phonePrice = phonePriceElement.getText();
        System.out.println(phonePrice);
	}

}
