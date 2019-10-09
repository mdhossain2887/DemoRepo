package utility;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Shared {
	public static void mouseOver(WebDriver driver,List<WebElement> eles,List<WebElement>eles2) {
		Actions a=new Actions(driver);
		System.out.println("The number of menus is ="+eles.size());
		for(int x=0; x<eles.size(); x++) {
			a.moveToElement(eles.get(x)).build().perform();;
			System.out.println(eles.get(x).getText());
			for(int j=0; j<eles2.size(); j++) {
				a.moveToElement(eles2.get(j)).perform();
				
			}
		}
	}
}
	









