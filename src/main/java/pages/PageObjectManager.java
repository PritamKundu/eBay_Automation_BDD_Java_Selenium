package pages;
import org.openqa.selenium.WebDriver;
import pages.ebay_Page.*;


public class PageObjectManager {


    public WebDriver driver;


    public ebaySignin_Page ebayLoginPage;
    public ebaySignout_Page ebaySignoutPage;
    public ebayItem_Search_Page ebayItemSearchPage;
    public ebayItem_AddToCart_Page ebayItemAddToCartPage;
    public ebayItem_Checkout_Page ebayItemCheckoutPage;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }


    public ebaySignin_Page getEbayLoginPage() {
        ebayLoginPage = new ebaySignin_Page(driver);
        return ebayLoginPage;
    }

    public ebaySignout_Page getEbaySignoutPage() {
        ebaySignoutPage = new ebaySignout_Page(driver);
        return ebaySignoutPage;
    }

    public ebayItem_Search_Page getEbayItemSearchPage() {
        ebayItemSearchPage = new ebayItem_Search_Page(driver);
        return ebayItemSearchPage;
    }

    public ebayItem_AddToCart_Page getEbayItemAddToCartPage() {
        ebayItemAddToCartPage = new ebayItem_AddToCart_Page(driver);
        return ebayItemAddToCartPage;
    }

    public ebayItem_Checkout_Page getEbayItemCheckoutPage() {
        ebayItemCheckoutPage = new ebayItem_Checkout_Page(driver);
        return ebayItemCheckoutPage;
    }
}
