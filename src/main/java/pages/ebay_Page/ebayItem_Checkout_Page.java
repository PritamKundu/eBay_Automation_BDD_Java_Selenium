package pages.ebay_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ebayItem_Checkout_Page {

    WebDriver driver;

    /*Locators*/

    By checkout = By.xpath("//button[normalize-space()='Go to checkout']");
    By paypal = By.xpath("//input[@value=\"PAYPAL\"]");
    By paypalButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]");


    public ebayItem_Checkout_Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement setCheckout() {
        return driver.findElement(checkout);
    }

    public WebElement setPaypal() {
        return driver.findElement(paypal);
    }

    public WebElement setPaypalButton() {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@title=\"PayPal\"]"));
        driver.switchTo().frame(iframe);
        return driver.findElement(paypalButton);
    }

}







    