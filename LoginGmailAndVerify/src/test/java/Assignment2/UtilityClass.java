package Assignment2;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilityClass {
    public static String getTD(int rowIndex,int colIndex) throws IOException, InvalidFormatException
    {
        FileInputStream file = new FileInputStream("/home/knoldus/Downloads/adi01.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
        String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
        return value;
    }

    public static void CaptureScreenshot(WebDriver driver, int TCID)
    {
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
       File Dest = new File("/home/knoldus/Pictures/screenshot"+TCID+".jpg");
    }
}
