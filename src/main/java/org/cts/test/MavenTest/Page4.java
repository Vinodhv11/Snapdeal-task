package org.cts.test.MavenTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends BaseClass{
	public Page4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement addr;
	@FindBy(id="cc_num")
	private WebElement credit;
	@FindBy(id="cc_type")
	private WebElement credittype;
	@FindBy(id="cc_exp_month")
	private WebElement emonth;
	@FindBy(id="cc_exp_year")
	private WebElement eyear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddr() {
		return addr;
	}
	public WebElement getCredittype() {
		return credittype;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getEmonth() {
		return emonth;
	}
	public WebElement getEyear() {
		return eyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	
	
	
		
	
	

}
