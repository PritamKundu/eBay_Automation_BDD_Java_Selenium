package stepDefinitions.Ebay_Steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ebay_Page.ebayItem_Checkout_Page;
import utils.TestContextSetup;


public class Ebay_Checkout_Steps {

    TestContextSetup testContextSetup;
    ebayItem_Checkout_Page ebayItemCheckoutPage;


    public Ebay_Checkout_Steps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.ebayItemCheckoutPage = testContextSetup.pageObjectManager.getEbayItemCheckoutPage();
    }

    @When("Click go to checkout button")
    public void clickGoToCheckoutButton() throws InterruptedException {
        ebayItemCheckoutPage.setCheckout().click();
        Thread.sleep(2000);
    }

    @Then("Select payment method paypal")
    public void selectPaymentMethodPaypal() throws InterruptedException {
        ebayItemCheckoutPage.setPaypal().click();
        Thread.sleep(2000);
        ebayItemCheckoutPage.setPaypalButton().click();
        Thread.sleep(5000);
    }
}


