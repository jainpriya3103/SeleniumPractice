package Import_Data_From_External_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class FetchDataForActitime {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fip = new FileInputStream(".\\FileData.properties");
		Properties pobj = new Properties();
		pobj.load(fip);
		String URL = pobj.getProperty("Url");
		String USERNAME = pobj.getProperty("UserName");
		String PASSWORD = pobj.getProperty("Password");
		FileInputStream fie = new FileInputStream(".\\ExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(fie);
		Row rw = wb.getSheet("Practice").getRow(1);
		String workName = rw.getCell(1).getStringCellValue();
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
        driver.findElement(By.linkText("Types of Work")).click();
        driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
        driver.findElement(By.name("name")).sendKeys(workName);
        driver.findElement(By.id("billingType_setBillable")).click();
        driver.findElement(By.xpath("//input[contains(@value,' Cancel')]")).click();
        Alert alt = driver.switchTo().alert();
        Thread.sleep(2000);
        alt.accept();
	}

}
