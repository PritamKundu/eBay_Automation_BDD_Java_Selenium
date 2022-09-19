package stepDefinitions.Ebay_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.ebay_Page.ebayItem_AddToCart_Page;
import pages.ebay_Page.ebayItem_Search_Page;
import utils.TestContextSetup;


public class Ebay_AddToCart_Steps {

    TestContextSetup testContextSetup;
    ebayItem_AddToCart_Page ebayItemAddToCartPage;


    public Ebay_AddToCart_Steps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.ebayItemAddToCartPage = testContextSetup.pageObjectManager.getEbayItemAddToCartPage();
    }

    @Given("Click add to cart button")
    public void clickAddToCartButton() throws InterruptedException {
        try {
            ebayItemAddToCartPage.setAddToCart().click();
            Thread.sleep(2000);
        }
        catch (Exception e){
            ebayItemAddToCartPage.setViewToCart().click();
            Thread.sleep(2000);
        }
    }

    @When("Increase item quantity")
    public void increaseItemQuantity() throws InterruptedException {
        Select item = new Select(ebayItemAddToCartPage.setItemQuantity());
        item.selectByValue("2");
        Thread.sleep(2000);
    }

    @And("Verity the item price")
    public void verityTheItemPrice() {
        Assert.assertTrue(ebayItemAddToCartPage.setItemPrice().isDisplayed());
    }

}

