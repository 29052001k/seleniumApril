package MinskoleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;



public class webelementMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			System.out.println(driver.findElement(By.id("nav-logo-sprites")).getSize());
			
		  Dimension d = driver.findElement(By.id("nav-logo-sprites")).getSize();
			System.out.println(d.height);
			System.out.println(d.width);
			
			System.out.println(driver.findElement(By.id("nav-logo-sprites")).getLocation()); 
			Point p=driver.findElement(By.id("nav-logo-sprites")).getLocation();
			System.out.println(p.x);
			System.out.println(p.y);
			
			
			System.out.println(driver.findElement(By.id("nav-logo-sprites")).getAttribute("class"));
			driver.quit();
			
		
		
		
	}

}
