package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		wd.navigate().to("https://demo.automationtesting.in/Register.html");
//		Thread.sleep(3000);
		wd.navigate().back();
//		Thread.sleep(3000);
		wd.navigate().forward();
//		Thread.sleep(3000);
		wd.navigate().refresh();
//		Thread.sleep(3000);
		System.out.println(wd.manage().window().getSize());
		wd.manage().window().maximize();
		System.out.println(wd.manage().window().getSize());
		wd.close();
		
	}

}
