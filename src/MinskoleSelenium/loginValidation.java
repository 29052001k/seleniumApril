package MinskoleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.cssSelector("input[name=\"username\"]"));
		WebElement password=driver.findElement(By.cssSelector("input[name=\"password\"]"));
		WebElement login=driver.findElement(By.cssSelector("button[type=\"submit\"]"));
	
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		//login.click();
		
		// invalid password
//		username.sendKeys("Admin");
//		password.sendKeys("admin4345123");
//		login.click();
		
		
		// test case one 
		Thread.sleep(3000);
//		WebElement dashBoard=driver.findElement(By.cssSelector("img[alt=\"client brand banner\"]"));
//		
//		boolean logo=dashBoard.isDisplayed();
//		
//		if(logo) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		
		
		
		// test case two
		// for invalid password
		
		
		
//	WebElement invalid=	driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));
//		Boolean error=invalid.isDisplayed();
//		
//		if(error) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
		
		
		
		
		//test case three
		
//		driver.findElement( By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
//		
//		String currentURL=driver.getCurrentUrl();
//		
//		if(currentURL.contains("requestPasswordResetCode")) {
//			System.out.println("test case pass");
//		}else {
//			System.out.println("test case fail");
//		}
		
		
		
		// test case four
		
		if(driver.findElement(By.cssSelector("div[class=\"orangehrm-login-branding\"]")).isDisplayed()) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
	}

}
