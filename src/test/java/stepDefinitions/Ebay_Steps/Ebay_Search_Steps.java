package stepDefinitions.Ebay_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.ebay_Page.ebayItem_Search_Page;
import utils.TestContextSetup;


public class Ebay_Search_Steps {

    TestContextSetup testContextSetup;
    ebayItem_Search_Page ebayItemSearchPage;


    public Ebay_Search_Steps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.ebayItemSearchPage = testContextSetup.pageObjectManager.getEbayItemSearchPage();
    }

    @Given("Enter item name in search box")
    public void enterItemNameInSearchBox() throws InterruptedException {
        Assert.assertTrue(ebayItemSearchPage.setSearch().isDisplayed());
        ebayItemSearchPage.setSearch().sendKeys("mobile");
        Thread.sleep(2000);
    }

    @Then("Click search button")
    public void clickSearchButton() throws InterruptedException {
        Assert.assertTrue(ebayItemSearchPage.setSearchButton().isDisplayed());
        Assert.assertTrue(ebayItemSearchPage.setSearchButton().isEnabled());
        ebayItemSearchPage.setSearchButton().click();
        Thread.sleep(2000);
    }

    @And("Click mobile brand {string}")
    public void clickMobileBrand(String brands) throws InterruptedException {
        for (WebElement allBrand : ebayItemSearchPage.setBrand()) {
            if (allBrand.getText().contains(brands)) {
                allBrand.click();
                break;
            }
        }
        Thread.sleep(5000);
    }

    @And("Select {string} number item in the list")
    public void selectItemInTheList(String itemNumber) throws InterruptedException {
        ebayItemSearchPage.setSelectItem().get(Integer.parseInt(itemNumber)).click();
        Thread.sleep(5000);
        ebayItemSearchPage.switchWindow();
        Thread.sleep(2000);
    }

    @And("Select item color {string}")
    public void selectItemColor(String color) throws InterruptedException {
        try {
            Select colors = new Select(ebayItemSearchPage.setItemColor());
            colors.selectByVisibleText(color);
            Thread.sleep(2000);
        }
        catch (Exception e){
            Select colors = new Select(ebayItemSearchPage.setItemColor2());
            colors.selectByVisibleText(color);
            Thread.sleep(2000);
        }
    }

    @When("Select item storage capacity {string}")
    public void selectItemStorageCapacity(String storage) throws InterruptedException {
        try {
                Select colors = new Select(ebayItemSearchPage.setItemStorage());
                colors.selectByVisibleText(storage);
                Thread.sleep(2000);
        }
        catch (Exception e){
                 System.out.println("item storage capacity not found");
        }
        Thread.sleep(2000);
    }

    @And("Add item quantity {string}")
    public void addItemQuantity(String quantity) throws InterruptedException {
        ebayItemSearchPage.setItemQuantity().click();
        Thread.sleep(2000);
        ebayItemSearchPage.setItemQuantity().clear();
        Thread.sleep(2000);
        ebayItemSearchPage.setItemQuantity().sendKeys(quantity);
        Thread.sleep(2000);
    }

    @When("Check item available or not")
    public void checkItemAvailableOrNot() {
        try {
            Assert.assertTrue(ebayItemSearchPage.setItemAvailability().isDisplayed());
            System.out.println(ebayItemSearchPage.setItemAvailability().getText());
        }
        catch (Exception e){
            System.out.println("Item not available !");
        }
    }

    @When("Sliding multiple item image")
    public void slidingMultipleItemImage() throws InterruptedException {
        ebayItemSearchPage.setItemImageSliding().click();
        Thread.sleep(2000);
    }
}


