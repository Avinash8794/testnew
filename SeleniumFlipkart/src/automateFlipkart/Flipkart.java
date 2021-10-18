package automateFlipkart;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;





public class Flipkart {
	
	static int a = 0;
	static void screenshot(WebDriver driver) throws IOException
	{
		for(int i = a; i == a; i++)
		{
			DateFormat df = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
			Date dateobj = new Date();
			String d = df.format(dateobj);
			
//			LocalDateTime d = java.time.LocalDateTime.now();
//			double b = Math.random();
//			String date = d.toString().replace(":", ":");
			
			File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File dest = new File("G:\pics\\snip" + d + ".jpg");
			File dest = new File("G:\\pics", "Snip" +  d + ".jpg");
			Files.copy(sourse, dest);
		}
		a++;
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\STUDY DATA\\coding\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
//		WebElement username = driver.findElement(By.xpath(""));
		
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("8208594600");
		Thread.sleep(1500);
		
		WebElement password = driver.findElement(By.xpath("//input[@class = '_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("avika9495");
		Thread.sleep(1500);
		
		WebElement loginButton = driver.findElement(By.xpath("(//button[@type = 'submit'])[2]"));
		loginButton.click();
		Thread.sleep(3000);
		screenshot(driver);
		
		WebElement topOffer = driver.findElement(By.xpath("//div[contains(text(), 'Top Offer')]"));
		topOffer.click();
		Thread.sleep(3000);
		
		WebElement view2 = driver.findElement(By.xpath("(//a[text() = 'VIEW ALL'])[2]"));
		view2.click();
		Thread.sleep(5000);
		
		WebElement shoesProd = driver.findElement(By.xpath("//div[contains(text(), 'FCUK, Ducati & more')]"));
		shoesProd.click();
		Thread.sleep(3000);
		
//		WebElement selectedProduct = driver.findElement(By.xpath("//div[@data-id = 'SHOGFY7GBQFAG4P9']"));
//		selectedProduct.click();  //A NEW TAB WILL BE OPENED
//		Thread.sleep(3000);
		
		WebElement size9Checkbox = driver.findElement(By.xpath("(//div[contains(text(), '9')])[1]"));
		boolean size = size9Checkbox.isSelected();
		if(size == false)
		{
			size9Checkbox.click();
		}
		Thread.sleep(3000);
		
//		WebElement ratingCheckbox = driver.findElement(By.xpath("//div[contains(text(), '4★ & above')]"));
//		boolean rating= ratingCheckbox.isSelected();
//		if(rating == false)
//		{
//			ratingCheckbox.click();
//		}
//		Thread.sleep(3000);
//		
//		WebElement discountCheckbox = driver.findElement(By.xpath("(//div[contains(text(), '50% or more')])[2]"));
//		boolean discount= discountCheckbox.isSelected();
//		if(discount == false)
//		{
//			discountCheckbox.click();
//			System.out.println(discount);
//			
//		}
//		Thread.sleep(3000);
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBar.sendKeys("helmets");
		Thread.sleep(3000);
		
		screenshot(driver);
		
		WebElement searchBarButton = driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]"));
		searchBarButton.click();
		Thread.sleep(3000);
		
		screenshot(driver);
		
		
		
		
//		WebElement cart = driver.findElement(By.xpath("//div[@class = 'YUhWwv']"));
//		cart.click();  
//		Thread.sleep(3000);
//		
//		WebElement pincode = driver.findElement(By.xpath("//div[@class = '_3gc7Vf']"));
//		pincode.click();  
//		Thread.sleep(3000);
//		
//		WebElement enterPinCode = driver.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']"));
//		enterPinCode.sendKeys("414001");  
//		Thread.sleep(3000);
//		
//		WebElement checkPinCodeButton = driver.findElement(By.xpath("//span[@class = 'UgLoKg']"));
//		checkPinCodeButton.click();  
//		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
