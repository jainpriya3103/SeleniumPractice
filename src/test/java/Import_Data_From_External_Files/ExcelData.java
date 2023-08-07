package Import_Data_From_External_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\FileData.properties");
        Properties pobj = new Properties();
        pobj.load(fis);
        String url = pobj.getProperty("Url1");
        WebDriver driver = new EdgeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//button[.='✕']")).click();
        FileInputStream fie = new FileInputStream(".\\ExcelData.xlsx");
        Workbook book = WorkbookFactory.create(fie);
        Sheet sheetName = book.getSheet("Practice");
        Row row = sheetName.getRow(0);
        Cell cel = row.getCell(0);
        String cellValue = cel.getStringCellValue();
        driver.findElement(By.name("q")).sendKeys(cellValue);
	}

}
