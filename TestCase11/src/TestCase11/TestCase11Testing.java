package TestCase11;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestCase11POM.POMTestCase11;


public class TestCase11Testing {

	private WebDriver driver;
	private POMTestCase11 testcase11;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void checkItemRemove() throws InterruptedException
	{
		
		
		 testcase11=new POMTestCase11(driver);
		
		testcase11.clickShop();
		testcase11.clickHome();
		
		
		
		
		List<WebElement> buttons = driver.findElements(By.xpath("//*[@class='attachment-shop_catalog size-shop_catalog wp-post-image' and @width='300' and @height='300']"));
		
	
		int noOfButtons=buttons.size();
		int expectedButtonCount=3;
		Assert.assertEquals(noOfButtons, expectedButtonCount);
		
		
		testcase11.clickOnImage();
		
		String expectedButton="ADD TO BASKET";
		String actualButton=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).getText();
		Assert.assertEquals(expectedButton, actualButton);
		
		
		testcase11.clickOnAddBasket();
		testcase11.clickOnItemButton();
		testcase11.clickOnRemoveButton();
		Thread.sleep(3000);
		
	
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
