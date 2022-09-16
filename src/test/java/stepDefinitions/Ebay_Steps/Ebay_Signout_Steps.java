package stepDefinitions.Ebay_Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ebay_Page.ebaySignout_Page;
import utils.TestContextSetup;


public class Ebay_Signout_Steps {

    TestContextSetup testContextSetup;
    ebaySignout_Page ebaySignoutPage;

    public Ebay_Signout_Steps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.ebaySignoutPage = testContextSetup.pageObjectManager.getEbaySignoutPage();
    }

    @Given("Click on profile")
    public void clickOnProfile() throws InterruptedException {
        Assert.assertTrue(ebaySignoutPage.setProfile().isDisplayed());
        ebaySignoutPage.setProfile().click();
        Thread.sleep(2000);
    }

    @Then("Click sign out")
    public void clickSignOut() throws InterruptedException {
        Assert.assertTrue(ebaySignoutPage.setSignOut().isDisplayed());
        Assert.assertTrue(ebaySignoutPage.setSignOut().isEnabled());
        ebaySignoutPage.setSignOut().click();
        Thread.sleep(5000);
    }
}

