package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		Thread.sleep(5000);
		wd.manage().window().maximize();
		Thread.sleep(3000);		
		wd.manage().window().minimize();
		Thread.sleep(5000);
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getTitle());
		System.out.println(wd.getPageSource());
		wd.close();
	}

}
