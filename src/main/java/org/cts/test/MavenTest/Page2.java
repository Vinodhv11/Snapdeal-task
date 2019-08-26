package org.cts.test.MavenTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends BaseClass{
	public Page2() {
		PageFactory.initElements(driver, this);
	}
            @FindBy(id="location")
            private WebElement loc;
			@FindBy(id="hotels")
            private WebElement hotel;
            @FindBy(id="room_type")
            private WebElement room;
            @FindBy(id="room_nos")
            private WebElement roomno;
            @FindBy(id="adult_room")
            private WebElement adult;
            @FindBy(id="child_room")
            private WebElement child;
            @FindBy(id="Submit")
            private WebElement search;
			public WebElement getLoc() {
				return loc;
			}
			public WebElement getHotel() {
				return hotel;
			}
			public WebElement getRoom() {
				return room;
			}
			public WebElement getRoomno() {
				return roomno;
			}
			public WebElement getAdult() {
				return adult;
			}
			public WebElement getChild() {
				return child;
			}
			public WebElement getSearch() {
				return search;
			}
}
