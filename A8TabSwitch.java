package openBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8TabSwitch {

    public static void main(String[] args) throws InterruptedException {
        WebDriver wb = new ChromeDriver();

        // Open first site
        wb.get("https://www.changepond.com/");
        wb.manage().window().maximize();
        String parentWindow = wb.getWindowHandle(); // store parent handle

        Thread.sleep(2000);

        // Open new tab
        wb.switchTo().newWindow(WindowType.TAB);
        wb.get("https://www.google.com/");

        Thread.sleep(2000);

        // Switch back to parent tab
        wb.switchTo().window(parentWindow);

        Thread.sleep(2000);

        wb.quit(); // close all tabs
    }
}