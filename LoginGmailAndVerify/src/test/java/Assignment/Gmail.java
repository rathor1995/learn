package Assignment;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;


import java.io.*;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;

import static java.lang.System.getProperty;

public class Gmail {
    @Test
    public void login() throws IOException, InvalidFormatException {
        System.setProperty("webdriver.chrome.driver","/home/knoldus/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/");

        //XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File("/home/knoldus/Documents/aditya.xlsx)));
        //XSSFSheet sheet = workbook.getSheet("Sheet1")

       // File xlsxFile = new File( "/home/knoldus/Documents/aditya.xlsx" );
        //FileInputStream finXLSX = new FileInputStream( xlsxFile ); //line1
        //FileOutputStream foutXLSX = new FileOutputStream( xlsxFile ); //line2
        //XSSFWorkbook workSheet = new XSSFWorkbook( finXLSX ); //line3

      FileInputStream file = new FileInputStream("/home/knoldus/Downloads/adi01.xlsx");
       Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
        driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();

       // driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
       // driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();






    }

}


