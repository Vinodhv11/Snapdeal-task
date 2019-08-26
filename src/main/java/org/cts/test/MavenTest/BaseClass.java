package org.cts.test.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
    public static WebDriver driver;
	public static WebDriver driverAccess() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	public static void load(String a) {
    driver.get(a);
	}
    public static void insert(WebElement element, String value) {
    element.sendKeys(value);
	}
   public static void click(WebElement element) {
	   element.click();

}
   public static void SBI(WebElement element, int index) {
	   Select s = new Select(element);
	   s.selectByIndex(index);

}
  
}

	

