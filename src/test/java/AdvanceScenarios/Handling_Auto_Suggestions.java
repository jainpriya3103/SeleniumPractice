package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Auto_Suggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		int count = 0;
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		List<WebElement> allList= driver.findElements(By.xpath("//li"));
		System.out.println(allList.size());
		for (WebElement webElement : allList) {
			if (webElement.getText().contains(" earphone")) {
				Thread.sleep(1000);
				System.out.println(webElement.getText());
				webElement.click();
				break;
			}
			
		}
		
		
		System.out.println("total no of autosuggestion " +count);

	}

}
