package openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class A7RightClick {
	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

	        // Locate the element to right-click on
	        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

	        // Create Actions class object
	        Actions actions = new Actions(driver);

	        // Perform right click
	        actions.contextClick(rightClick).perform();
	        Thread.sleep(3000);
	        driver.quit();
	    }
	}