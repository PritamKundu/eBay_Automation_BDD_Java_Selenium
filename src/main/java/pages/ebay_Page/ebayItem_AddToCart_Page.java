package pages.ebay_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ebayItem_AddToCart_Page {

    WebDriver driver;

    /*Locators*/

    By addToCart = By.id("isCartBtn_btn");
    By viewToCart = By.id("vi-viewInCartBtn");
    By Item_quantity = By.xpath("(//select[@data-test-id=\"qty-dropdown\"])[1]");
    By Item_price = By.xpath("(//div[@class=\"grid__cell--one-half rightmost-cell\"]//span//span//span)[1]");


    public ebayItem_AddToCart_Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement setAddToCart() {
        return driver.findElement(addToCart);
    }

    public WebElement setViewToCart() {
        return driver.findElement(viewToCart);
    }

    public WebElement setItemQuantity() {
        return driver.findElement(Item_quantity);
    }

    public WebElement setItemPrice() {
        return driver.findElement(Item_price);
    }

}







    