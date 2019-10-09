package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class LandingPage {
	@FindBy(xpath="//*[@id=\"allDepartmentsFlyout\"]/section[1]/div/ul/li")List<WebElement> submenus;
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li") List<WebElement> menus;
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void mouseOverOnAllDepts() {
		Shared.mouseOver(driver, menus, submenus);
	}
}
