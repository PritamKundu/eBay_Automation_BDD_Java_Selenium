package pages.ebay_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ebaySignin_Page {

    WebDriver driver;

    /*Locators*/

    By signIn = By.xpath("(//a[normalize-space()='Sign in'])[1]");
    By username = By.id("userid");
    By Continue = By.id("signin-continue-btn");
    By password = By.id("pass");
    By Sign_In = By.id("sgnBt");
    By maybe_later = By.id("webauthn-maybe-later-link");
    By profile_name = By.id("gh-ug");


    public ebaySignin_Page(WebDriver driver){
        this.driver= driver;
    }

    public WebElement setSignIn() {
        return driver.findElement(signIn);
    }

    public WebElement setUserName() {
        return driver.findElement(username);
    }

    public WebElement setContinue() {
        return driver.findElement(Continue);
    }

    public WebElement setPassword() {
        return driver.findElement(password);
    }

    public WebElement setSign_In_Button() {
        return driver.findElement(Sign_In);
    }

    public WebElement setMaybe_Later() {
        return driver.findElement(maybe_later);
    }

    public WebElement setProfile_Name() {
        return driver.findElement(profile_name);
    }

}







    