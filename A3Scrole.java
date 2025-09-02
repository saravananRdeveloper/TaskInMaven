package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3Scrole {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement userName = wd.findElement(By.name("username"));
		userName.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement pwd = wd.findElement(By.name("password"));
		pwd.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement login = wd.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		System.out.println(wd.getTitle());
		Thread.sleep(5000);
		WebElement fin=wd.findElement(By.xpath("//p[text()='. All rights reserved.']"));
		JavascriptExecutor js = (JavascriptExecutor) wd;
//		js.executeScript("arguments[0].scrollIntoView();", fin);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		wd.manage().window().minimize();
		wd.close();
	}

}
