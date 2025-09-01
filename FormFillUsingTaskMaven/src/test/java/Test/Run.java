package Test;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginClass;

public class Run {
	WebDriver wd =null;
  @Test
  public void login() throws Exception {
	wd= new ChromeDriver();
	FileReader fr = new FileReader("C:\\MavenProjects\\FormFillUsingTaskMaven\\InputData\\data.properties");
	Properties p = new Properties();
	p.load(fr);
	LoginClass log = new LoginClass(wd);
	wd.get(p.getProperty("url"));
	wd.manage().window().maximize();
	Thread.sleep(3000);
	log.enterFirstName(p.getProperty("fn"));
	Thread.sleep(3000);
	log.enterLastName(p.getProperty("ln"));
	Thread.sleep(3000);
	log.enterEmail(p.getProperty("email"));
	Thread.sleep(3000);
	log.enterPhone(p.getProperty("phno"));
	Thread.sleep(3000);
	log.enterCompanyName(p.getProperty("company"));
	Thread.sleep(3000);
	log.enterCountry(p.getProperty("country"));
	Thread.sleep(3000);
	log.HowManyUser(p.getProperty("users"));
	Thread.sleep(2000);
	log.Radio();
	Thread.sleep(2000);
	log.enterCheckBox1();
	Thread.sleep(2000);
	log.enterCheckBox2();
	Thread.sleep(2000);
	log.submitButton();
  }
}
