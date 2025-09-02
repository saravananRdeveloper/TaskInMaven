package openBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Alerts.html");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		           //code for accept and dismiss
//		wd.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
//		Thread.sleep(3000);
//		WebElement button1 = wd.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
//		button1.click();
//		Alert a = wd.switchTo().alert();
//		Thread.sleep(3000);
//		a.accept();
//		a.dismiss();
		
		//    code for take input from alert 
		wd.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
		WebElement button=wd.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		Thread.sleep(3000);
		button.click();
		Alert a = wd.switchTo().alert();
		String name = "saravanan";
		a.sendKeys(name);
		Thread.sleep(3000);
		a.accept();
		System.out.println("Enter name"+name);
		Thread.sleep(3000);
		wd.close();
	}

}
