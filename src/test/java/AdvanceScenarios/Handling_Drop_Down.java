package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(1000);

	WebElement dayDropDown = 	driver.findElement(By.id("day"));
	Select sel = new Select(dayDropDown);
	sel.selectByIndex(0);
	WebElement monthDropDown =   driver.findElement(By.id("month"));
	//Thread.sleep(1000);
	Select selMonth = new Select(monthDropDown);
	//selMonth.selectByIndex(4);
	selMonth.selectByVisibleText("Mar");
	WebElement yearDropDown = 	driver.findElement(By.id("year"));
	Select selYear = new Select(yearDropDown);
	//selYear.selectByIndex(11);
	selYear.selectByValue("2020");
	}

}
