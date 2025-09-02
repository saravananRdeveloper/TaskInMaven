package openBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9TwoBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		WebDriver wd1 = new ChromeDriver();
		WebDriver wd3 = new ChromeDriver();
		wd.get("https://redbus.com");
		wd1.get("https://www.google.com/");
		wd3.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		
//		wd.manage().window().minimize();
		String com=wd.getTitle();
		System.out.println(com);
		if(com.equals("Welcome")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
//		System.out.println(wd.getPageSource());
//		System.out.println(wd.getCurrentUrl());
		Thread.sleep(10000);
		wd.close();
	
	}

}