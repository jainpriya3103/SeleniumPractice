package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Multiple_Elements {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		int count = 0;
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> allLinks= driver.findElements(By.xpath("//a"));
        for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText());
			count++;
		}
        System.out.println("total no of links :" +count);
	}

}
