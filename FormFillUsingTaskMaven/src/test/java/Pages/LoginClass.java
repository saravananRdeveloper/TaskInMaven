package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginClass {
	WebDriver wd=null;
	By firstName =By.id("first_name");
	By lastName = By.id("last_name");
	By email = By.id("email");
	By phone = By.id("phone");
	By CompanyName = By.id("organization");
	By Country = By.xpath("//select[@name='cm-f-sdybl']");
	By users = By.xpath("//select[@id='users']");
	By Radio = By.id("type_download");
	By checkBox1 = By.id("terms");
	By checkBox2 = By.id("gdpr");
	By Submit = By.xpath("//button[@type='submit']");

	public LoginClass(WebDriver wd) {
		this.wd =wd;
	}

	public void enterFirstName(String fname){
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fn=wd.findElement(firstName);
		fn.sendKeys(fname);
		System.out.println(fn.getAttribute("value"));
	}

	public void enterLastName(String lname){
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ln=wd.findElement(lastName);
		ln.sendKeys(lname);
		System.out.println(ln.getAttribute("value"));
	}
	public void enterEmail(String Uemail){
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Ue=wd.findElement(email);
		Ue.sendKeys(Uemail);
		System.out.println(Ue.getAttribute("value"));
	}
	public void enterPhone(String PhoneNum){
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Ph=wd.findElement(phone);
		Ph.sendKeys(PhoneNum);
		System.out.println(Ph.getAttribute("value"));
	}
	public void enterCompanyName(String CName){
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement CN=wd.findElement(CompanyName);
		CN.sendKeys(CName);
		System.out.println(CN.getAttribute("value"));
	}
	public void enterCountry(String eCountry){
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement countryDropDown=wd.findElement(Country);
		Select selectCountry = new Select(countryDropDown);
		selectCountry.selectByVisibleText(eCountry);
		System.out.println("Country:"+countryDropDown.getAttribute("value"));
	}
	public void HowManyUser(String HMU){
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usersDropDown=wd.findElement(users);
		Select selectHMU = new Select(usersDropDown);
		selectHMU.selectByVisibleText(HMU);
		System.out.println("Country:"+usersDropDown.getAttribute("value"));
	}
	
	public void Radio() {
		wd.findElement(Radio).click();
	}
	
	public void enterCheckBox1()
	 {
		 wd.findElement(checkBox1).click();
	 }
	public void enterCheckBox2()
	 {
		wd.findElement(checkBox2).click();
	 }
	 public void submitButton()
	 {
		 wd.findElement(Submit).click();
	
	 }
}

