package pages.ebay_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ebaySignout_Page {

    WebDriver driver;

    /*Locators*/

    By profile = By.id("gh-eb-u");
    By sign_out = By.xpath("//li//a[normalize-space()='Sign out']");


    public ebaySignout_Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement setProfile() {
        return driver.findElement(profile);
    }

    public WebElement setSignOut() {
        return driver.findElement(sign_out);
    }

}







    