package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void outputText(WebElement element) {
		System.out.println(element.getText());

	}

	public static void downDrop(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static void buttonClick(WebElement element) {
		element.click();

	}

	public static void moveTo(WebElement element) {

		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static String stringData(int row, int cell) throws IOException {
		File f = new File("C:\\Users\\User\\eclipse-workspace\\cucumberProject\\testData\\data.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("n");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		String stringvalue = c.getStringCellValue();

		return stringvalue;

	}
	
	public static String numaricData(int row,int cell) throws IOException  {
		File f =new File("C:\\Users\\User\\eclipse-workspace\\cucumberProject\\testData\\data.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("n");
		Row r = s.getRow(row);
		Cell c= r.getCell(cell);
		double d=c.getNumericCellValue();
		long l=(long)d;
		String numaricData = String.valueOf(l);
		return numaricData;
		
		
		
		
	}

}
