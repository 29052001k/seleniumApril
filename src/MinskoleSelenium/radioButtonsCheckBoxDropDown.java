package MinskoleSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radioButtonsCheckBoxDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			
			WebElement G=driver.findElement(By.cssSelector("input[value=\"green\"]"));
			WebElement Y=driver.findElement(By.cssSelector("input[value=\"yellow\"]"));
			
			Y.click();
			
			if(!(G.isSelected())&& Y.isSelected()) {
				System.out.println("Test case pass for yellow");
			}else {
				System.out.println("Test case fail for yellow");
			}
			
			
		List<WebElement> aa= driver.findElements(By.cssSelector("input[type=\"radio\"]"));
		for(int i=0;i<aa.size();i++) {
			aa.get(i).click();
			if(aa.get(i).isSelected()) {
				System.out.println("Test case for selected");
			}
		}
		
		
		// checkBox
		
		List<WebElement> dd=driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		
		for(int i=0;i<dd.size();i++) {
			if(i!=2) {
				dd.get(i).click();
				if(dd.get(i).isSelected()) {
					System.out.println("test case for Check Box");
				}
			}
			
		}
		
		
		for(int i=0;i<dd.size();i++) {
			if(i!=2) {
				dd.get(i).click();
				if(!(dd.get(i).isSelected())) {
					System.out.println("test case for Check Box1");
				}
			}
			
		}
		
		
		// dropdown
		
		WebElement ss=driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		
		Select s=new Select(ss);
		
		s.selectByValue("python");
		s.selectByVisibleText("Python");
		s.selectByIndex(2);
		
		
		if(driver.findElement(By.cssSelector("option[value=\"python\"]")).isSelected()) {
			System.out.println("testCase passed");
		}
			
		driver.quit();
	}

}
