package pages.ebay_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Set;


public class ebayItem_Search_Page {

    WebDriver driver;

    /*Locators*/

    By search_box = By.id("gh-ac");
    By search_button = By.id("gh-btn");
    By brand = By.xpath("//*[@id=\"s0-51-12-6-3-4[0]-3-1-1-list\"]/li");
    By select_item = By.xpath("//div[@class=\"s-item__title\"]");
    By item_color = By.name("Phone Color");
    By item_color2 = By.name("Color");
    By storage = By.name("Storage");
    By quantity = By.id("qtyTextBox");
    By item_availability = By.id("qtySubTxt");
    By item_image = By.xpath("//button[contains(@title,'Next image - Item images')]");

    public ebayItem_Search_Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement setSearch() {
        return driver.findElement(search_box);
    }

    public WebElement setSearchButton() {
        return driver.findElement(search_button);
    }

    public List<WebElement> setBrand() {
        return driver.findElements(brand);
    }

    public List<WebElement> setSelectItem() {
        return driver.findElements(select_item);
    }

    public WebElement setItemColor() {
        return driver.findElement(item_color);
    }
    public WebElement setItemColor2() {
        return driver.findElement(item_color2);
    }

    public WebElement setItemStorage() {
        return driver.findElement(storage);
    }

    public WebElement setItemQuantity() {
        return driver.findElement(quantity);
    }

    public WebElement setItemAvailability() {
        return driver.findElement(item_availability);
    }

    public WebElement setItemImageSliding() {
        return driver.findElement(item_image);
    }

    public void switchWindow() throws InterruptedException {
        String parentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(3000);
            }
        }
    }

}







    