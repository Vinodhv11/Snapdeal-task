package org.cts.test.MavenTest;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest {
	public static WebDriver wd;

	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\drivers\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.facebook.com");

	}
	@AfterClass
	public static void quit() {
    wd.quit();
	}
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@Ignore
	@Test
	public void m1() {
		WebElement a = wd.findElement(By.id("email"));
		a.sendKeys("vvin.gmail.com");
		Assert.assertEquals("https://www.facebook.com/", wd.getCurrentUrl());

	}
	

	@Ignore
	@Test
	public void m2() {
		WebElement b = wd.findElement(By.id("pass"));
		b.sendKeys("12345");
		Assert.assertTrue(wd.getTitle().contains("facebuk"));
		

	}
	@Test
	public void login() {
		WebElement c = wd.findElement(By.id("loginbutton"));
		c.click();

	}
}
