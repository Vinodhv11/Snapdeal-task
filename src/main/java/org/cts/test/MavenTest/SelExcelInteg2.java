package org.cts.test.MavenTest;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelExcelInteg2 extends SelExcelIntegration{
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvino\\eclipse-workspace\\MavenTest\\drivers\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.snapdeal.com");
		WebElement a = wd.findElement(By.id("inputValEnter"));
		a.sendKeys(getData(2,2));
		WebElement b = wd.findElement(By.className("searchTextSpan"));
		b.click();
		Thread.sleep(5000);
		WebElement c = wd.findElement(By.xpath("(//img[@class='product-image '])[3]"));
		c.click();
		String par = wd.getWindowHandle();
		Set<String> chi = wd.getWindowHandles();
		System.out.println(par + "\n" + chi);
		for (String x : chi) {
			if (!x.equals(par)) {
				wd.switchTo().window(x);
			WebElement d = wd.findElement(By.xpath("//span[text()='add to cart']"));
			d.click();
			Thread.sleep(5000);
			WebElement e = wd.findElement(By.xpath("//i[@class='sd-icon sd-icon-cart-icon-white-2']"));
			e.click();
			
			}
			
		}
	}

}
