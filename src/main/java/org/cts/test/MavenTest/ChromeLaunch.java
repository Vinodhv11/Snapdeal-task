package org.cts.test.MavenTest;

public class ChromeLaunch extends BaseClass{
	public static void main(String[] args) {
		driverAccess();
		load("https://adactin.com/HotelApp/");
		Page1 p = new Page1();
		Page2 p1=new Page2();
		Page3 p2 = new Page3();
		Page4 p3 = new Page4();
		insert(p.getUser(), "KanmaniN");
		insert(p.getPass(), "kanmani");
		click(p.getButton());
		SBI(p1.getLoc(), 1);
		SBI(p1.getHotel(), 3);
		SBI(p1.getRoom(), 3);
		SBI(p1.getRoomno(), 2);
		SBI(p1.getAdult(), 3);
		SBI(p1.getChild(), 2);
		click(p1.getSearch());
		click(p2.getRadio());
		click(p2.getCont());
		insert(p3.getFname(), "Vinodh");
		insert(p3.getLname(), "Kumar");
		insert(p3.getAddr(), "Chennai");
		insert(p3.getCredit(), "1234567891234567");
		SBI(p3.getCredittype(), 2);
		SBI(p3.getEmonth(), 2);
		SBI(p3.getEyear(), 12);
		insert(p3.getCvv(), "456");
		click(p3.getBook());
		
	}
}
