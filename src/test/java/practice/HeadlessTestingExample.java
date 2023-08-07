package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessTestingExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe");

        // Create ChromeOptions to enable headless mode
        
        // Create a new instance of ChromeDriver with the headless options
        WebDriver driver = new HtmlUnitDriver();;

        // Open the webpage and perform headless testing
        driver.get("https://ggits.org/");
        System.out.println("Title: " + driver.getTitle());

        // Continue with your headless test actions

        // Close the browser
        driver.quit();
    }
}
