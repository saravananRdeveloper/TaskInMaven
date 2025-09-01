package Demo;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A1 {
  @Test
  public void Login() throws Exception {
	  WebDriver wd = new ChromeDriver();
	  FileReader fr = new FileReader("C:\\MavenProjects\\TestNGCon\\fold\\read.properties");
	  Properties p = new Properties();
	  p.load(fr);
	  wd.get(p.getProperty("url"));
  }
}
