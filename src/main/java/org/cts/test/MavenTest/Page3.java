package org.cts.test.MavenTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends BaseClass{
	public Page3() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(name="continue")
	private WebElement cont;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getCont() {
		return cont;
	}

}
