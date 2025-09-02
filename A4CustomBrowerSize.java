package openBrowser;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4CustomBrowerSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		Dimension d = new Dimension(5000,500);
		wd.manage().window().setSize(d);
		Thread.sleep(5000);
	}
}
