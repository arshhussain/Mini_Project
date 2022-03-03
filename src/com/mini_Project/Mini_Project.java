package com.mini_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Apple\\Selenium4ClockBatch\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement register = driver.findElement(By.xpath("//a[@class='btn btn-outline btn-default']"));
		register.click();

		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Arsh");

		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Hussain");

		WebElement email = driver.findElement(By.id("inputEmail"));
		email.sendKeys("arsh@ymail.com");

		WebElement pcode = driver.findElement(By.className("selected-dial-code"));
		pcode.click();

		WebElement in = driver.findElement(By.xpath("//li[@data-dial-code='91']"));
		in.click();

		WebElement phone = driver.findElement(By.id("inputPhone"));
		phone.sendKeys("123456789");

		WebElement cname = driver.findElement(By.name("companyname"));
		cname.sendKeys("Wipro");

		WebElement sa1 = driver.findElement(By.id("inputAddress1"));
		sa1.sendKeys("5th street");

		WebElement sa2 = driver.findElement(By.name("address2"));
		sa2.sendKeys("porur");

		WebElement city = driver.findElement(By.id("inputCity"));
		city.sendKeys("cochin");

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Kerala");

		WebElement pc = driver.findElement(By.id("inputPostcode"));
		pc.sendKeys("600065");

		WebElement country = driver.findElement(By.id("inputCountry"));
		Select s1 = new Select(country);
		s1.selectByVisibleText("India");

		WebElement mno = driver.findElement(By.name("customfield[2]"));
		mno.sendKeys("0987654321");

		WebElement p1 = driver.findElement(By.id("inputNewPassword1"));
		p1.sendKeys("Arsh@123");

		WebElement p2 = driver.findElement(By.name("password2"));
		p2.sendKeys("Arsh@123");

		WebElement remail = driver.findElement(By.xpath("//span[@class='switch__container']"));
		remail.click();

	}
}
