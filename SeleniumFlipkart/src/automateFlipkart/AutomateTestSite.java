package automateFlipkart;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class AutomateTestSite {
	
	static int count = 0;
	
	static void snip(WebDriver x) throws IOException
	{
		for(int i = count; i == count; i++)
		{
			  SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");  
			  Date date = new Date();  
			  String d = (formatter.format(date));  
			  
			  File sourse = ((TakesScreenshot)x).getScreenshotAs(OutputType.FILE);
			  File dest = new File("F:\\Screen\\screen " + d + ".jpg" );
			  Files.copy(sourse, dest);
		}
		count++;
	}
	
	static void tableCell(WebDriver driver)
	{
		int a = 0;
		int b = 20;
		List<WebElement> row = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr"));
		
		for(int j = 1; j < row.size(); j++)
		{
			List<WebElement> cell = row.get(j).findElements(By.xpath("//table[@name = 'BookTable']//td"));
			
			for(int i = a; i < ((cell.size())-b); i++)
			{
				String text = cell.get(i).getText();
				System.out.print(text + ", ");
				
			}
			a = a+4;
			b = b-4;
			System.out.println();
		}	
		
	}
	
	static void table(WebDriver driver,int a, int b)
	{
		List<WebElement> cells = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr//td"));
		String text1 = cells.get(a).getText();
		String text2 = cells.get(b).getText();
		System.out.println(text1 + ", " + text2);
	}
	
	static void excel(Sheet x, int a, int b, int c)
	{
		if(a<21 && b < 2 && c < 2)
		{
			String text1 = x.getRow(a).getCell(b).getStringCellValue();
			String text2 = x.getRow(a).getCell(c).getStringCellValue();
			System.out.println(text1 + " " + text2);
			
		}
		
	}
	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\STUDY DATA\\coding\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://testautomationpractice.blogspot.com/");
//		
//		Actions mouseRun = new Actions(driver);
//		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		snip(driver);
		
		
//		
//		Dimension d = new Dimension(300,500);
//		driver.manage().window().setSize(d);
//		
//		Point p = new Point(400,200);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(2000);
//		
//		driver.manage().window().maximize();
		
//		WebElement googleSearchBar = driver.findElement(By.xpath(""));
		
//		WebElement PageTitle = driver.findElement(By.xpath("//h1[@class='title']"));
//		String title = PageTitle.getText();
//		System.out.println(title);
//		Thread.sleep(2000);
//		
//		WebElement field1 = driver.findElement(By.xpath("//input[@id = 'field1']"));
//		field1.clear();
//		field1.sendKeys("macho man");
//		Thread.sleep(2000);
//		
//		WebElement copyText = driver.findElement(By.xpath("//button[contains(text(), 'Copy Text')]"));
//		mouseRun.moveToElement(copyText).doubleClick().build().perform();
//		
//		WebElement fileDrop = driver.findElement(By.xpath("//select[@id = 'files']"));
//		
//		JavascriptExecutor j = ((JavascriptExecutor)driver);
//		j.executeScript("window.scrollBy(0,250");  scrolls into pixels
//		j.executeScript("arguments[0].scrollIntoView(true);", fileDrop); //scroll till fileDrop element appears
		
//		WebElement speedDrop = driver.findElement(By.xpath("//select[@id = 'speed']"));
//		speedDrop.click();
//		Select speed = new Select(speedDrop);
//		speed.selectByVisibleText("Faster");
//		Thread.sleep(2000);
//		
//		
//		fileDrop.click();
//		Select file = new Select(fileDrop);
//		file.selectByVisibleText("PDF file");
//		Thread.sleep(2000);
//		
//		WebElement numberDrop = driver.findElement(By.xpath("//select[@id = 'number']"));
//		numberDrop.click();
//		Select number = new Select(numberDrop);
//		number.selectByVisibleText("5");
//		Thread.sleep(2000);
//		
//		WebElement productDrop = driver.findElement(By.xpath("//select[@id = 'products']"));
//		productDrop.click();
//		Select product = new Select(productDrop);
//		product.selectByVisibleText("Yahoo");
//		Thread.sleep(2000);
//		
//		WebElement animalDrop = driver.findElement(By.xpath("//select[@id = 'animals']"));
//		animalDrop.click();
//		Select animal = new Select(animalDrop);
//		animal.selectByVisibleText("Big Baby Cat");
//		Thread.sleep(4000);
//		
//		WebElement clickButton = driver.findElement(By.xpath("//button[contains(text(), 'Click Me')]"));
//		clickButton.click();
//		Thread.sleep(4000);
//		
//		Alert kya = driver.switchTo().alert();
//		Thread.sleep(4000);
//		kya.accept();
//		Thread.sleep(4000);
//		
//		snip(driver);
//		Thread.sleep(2000);
//		WebElement firstname = driver.findElement(By.xpath("//input[@id = 'Wikipedia1_wikipedia-search-input']"));
//		j.executeScript("arguments[0].scrollIntoView(true);", firstname);
//		
//		driver.switchTo().frame("frame-one1434677811");
//		Thread.sleep(2000);
//		
//		WebElement name = driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-1']"));
//		name.sendKeys("Avinash");
//		Thread.sleep(2000);
//		
//		WebElement lastname = driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-2']"));
//		lastname.sendKeys("Shirsekar");
//		Thread.sleep(2000);
//		
//		WebElement phonenum = driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-3']"));
//		phonenum.sendKeys("8208594600");
//		Thread.sleep(2000);
//		
//		WebElement country = driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-4']"));
//		country.sendKeys("India");
//		Thread.sleep(2000);
//		
//		WebElement city = driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-5']"));
//		city.sendKeys("Pune");
//		Thread.sleep(2000);
//		
//		WebElement email = driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-6']"));
//		email.sendKeys("xysdf@gmail.com");
//		Thread.sleep(2000);
//		
//		WebElement mail = driver.findElement(By.xpath("//label[text() = 'Email Address']"));
//		j.executeScript("arguments[0].scrollIntoView(true);", mail);
//		Thread.sleep(2000);
//		
//		WebElement gender = driver.findElement(By.xpath("//label[contains(text(), 'Male')]"));
//		gender.click();
//		
//		WebElement day = driver.findElement(By.xpath("//label[contains(text(), 'Thursday')]"));
//		day.click();
//		
//		WebElement contacttime = driver.findElement(By.xpath("//select[@id = 'RESULT_RadioButton-9']"));
//		Select time = new Select(contacttime);
//		time.selectByValue("Radio-2");
//		Thread.sleep(2000);
//		
//		driver.switchTo().parentFrame();
//		Thread.sleep(2000);
//		
//		WebElement sourse = driver.findElement(By.xpath("//h5[text() = 'Mary']"));
//		WebElement dest = driver.findElement(By.xpath("//div[@id = 'trash']"));
//		
//		mouseRun.dragAndDrop(sourse, dest).perform();
		
//		HTML TABLE
		
//		WebElement upto = driver.findElement(By.xpath("//h2[text() = 'HTML Table']"));
//		
//		JavascriptExecutor sc = ((JavascriptExecutor)driver);
//		sc.executeScript("arguments[0].scrollIntoView(true);",upto );
		
//		tableCell(driver);
		
//		table(driver,2,1);
		
//		EXECEL SHEET
		
		String path = "G:\\BANK\\Book1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet excelText = WorkbookFactory.create(file).getSheet("Sheet1");
		
		excel(excelText, 0, 0, 1);
		excel(excelText, 2, 0, 1);
		excel(excelText, 20, 0, 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
//		WebElement searchBar = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
//		searchBar.sendKeys("reagon");
//		Thread.sleep(2000);
//		
//		WebElement searchButton = driver.findElement(By.xpath("//input[@type = 'submit']"));
//		searchButton.click();
//		Thread.sleep(2000);
//		
//		WebElement searchList = driver.findElement(By.xpath("//a[contains(text(), 'Reaganomics')]"));
//		searchList.click();
//		Thread.sleep(2000);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
