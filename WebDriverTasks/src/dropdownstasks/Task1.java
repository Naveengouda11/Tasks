package dropdownstasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

try {
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	
	
	WebElement nation = driver.findElement(By.tagName("select"));
	
	Select select = new Select(nation);
	select.selectByVisibleText("India");
	
	String selectoption = select.getFirstSelectedOption().getText();
	
	
	if(selectoption.equals("India")) {
		System.out.println("Nation is: " + nation.getAttribute("value"));
	}
}catch (Exception e) {
	e.printStackTrace();
}
	}

}
