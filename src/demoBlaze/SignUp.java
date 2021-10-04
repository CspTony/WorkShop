package demoBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignUp extends PageTemplate{
	
	private String signUpXpath = "//*[@id=\"signin2\"]";
	private String signPopTitXpath = "//*[@id=\"signInModalLabel\"]";
	private String userXpath = "//*[@id=\"sign-username\"]";
	private String passwordXpath = "//*[@id=\"sign-password\"]";
	private String signUpBXpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";
	public String textoAlertSignUpCorrect = "Sign up successful.";

	public SignUp(WebDriver driver) {
		super(driver);
		this.driver.manage().window().maximize();
		this.driver.get("https://www.demoblaze.com/");//Url
	}
	
	public void signingUp(String username, String password){
		WebElement signButton = this.driver.findElement(By.xpath(signUpXpath));
		signButton.click();
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		WebElement title = this.driver.findElement(By.xpath(signPopTitXpath));
		wait.until(ExpectedConditions.visibilityOf(title));
		WebElement userField =  this.driver.findElement(By.xpath(userXpath));
		userField.sendKeys(username);
		WebElement passwordField = this.driver.findElement(By.xpath(passwordXpath));
		passwordField.sendKeys(password);
		WebElement signUpButton = this.driver.findElement(By.xpath(signUpBXpath));
		signUpButton.click();
	}
	
}
