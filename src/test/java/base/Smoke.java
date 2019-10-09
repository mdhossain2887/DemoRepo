package base;

import org.junit.Test;

import pages.LandingPage;

public class Smoke extends BaseTest{
	
	LandingPage lp;
	@Test
	public void myTest() {
		lp=new LandingPage(driver);
		lp.mouseOverOnAllDepts();
		
	
	}
}
