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
    By item_color = By.name("Color");
    By item_colorSelect = By.xpath("//select[@name=\"Color\"]//option[@style=\"color: black\" or @selected=\"selected\"]");
    By item_colorSelected = By.xpath("//select[@name=\"Color\"]//option[@selected=\"selected\"]");
    By item_color2 = By.name("Phone Color");
    By item_color2Select = By.xpath("//select[@name=\"Phone Color\"]//option[@style=\"color: black;\" or @selected=\"selected\"]");
    By item_color2Selected = By.xpath("//select[@name=\"Phone Color\"]//option[@selected=\"selected\"]");
    By storage = By.name("Storage/GB");
    By storageSelect = By.xpath("//select[@name=\"Storage/GB\"]//option[@style=\"color: black;\" or @selected=\"selected\"]");
    By storageSelected = By.xpath("//select[@name=\"Storage/GB\"]//option[@selected=\"selected\"");
    By storage2 = By.name("Storage Capacity");
    By storageSelect2 = By.xpath("//select[@name=\"Storage Capacity\"]//option[@style=\"color: black;\" or @selected=\"selected\"]");
    By storageSelected2 = By.xpath("//select[@name=\"Storage Capacity\"]//option[@selected=\"selected\"]");
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
    public WebElement setItemColorSelect() {
        return driver.findElement(item_colorSelect);
    }
    public WebElement setItemColorSelected() {
        return driver.findElement(item_colorSelected);
    }
    public WebElement setItemColor2() {
        return driver.findElement(item_color2);
    }

    public WebElement setItemColor2Select() {
        return driver.findElement(item_color2Select);
    }

    public WebElement setItemColor2Selected() {
        return driver.findElement(item_color2Selected);
    }

    public WebElement setItemStorage() {
        return driver.findElement(storage);
    }

    public WebElement setItemStorageSelect() {
        return driver.findElement(storageSelect);
    }

    public WebElement setItemStorage2() {
        return driver.findElement(storage2);
    }

    public WebElement setItemStorage2Select() {
        return driver.findElement(storageSelect2);
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







    