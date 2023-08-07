package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_Drag_And_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		//First way of drag and drop
		/*Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/
		// second way of drag and drop
		Actions act = new Actions(driver);
		act.clickAndHold(drag).perform();
		act.release(drop).perform();
		
		

	}

}
