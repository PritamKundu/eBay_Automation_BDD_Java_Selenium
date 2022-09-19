package stepDefinitions.Ebay_Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ebay_Page.ebaySignin_Page;
import utils.TestContextSetup;


public class Ebay_SignIn_Steps {

    TestContextSetup testContextSetup;
    ebaySignin_Page ebayLoginPage;


    public Ebay_SignIn_Steps(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.ebayLoginPage = testContextSetup.pageObjectManager.getEbayLoginPage();
    }

    @Given("Click on sign in hyperlink")
    public void clickOnSignInHyperlink() throws InterruptedException {
        Assert.assertTrue(ebayLoginPage.setSignIn().isDisplayed());
        ebayLoginPage.setSignIn().click();
        Thread.sleep(5000);
    }

    @When("Enter username")
    public void enterUsername() throws InterruptedException {
        Assert.assertTrue(ebayLoginPage.setUserName().isDisplayed());
        ebayLoginPage.setUserName().sendKeys("foepepask@neko2.net");
        Thread.sleep(2000);
    }

    @And("Click on continue button")
    public void clickOnContinueButton() throws InterruptedException {
        Assert.assertTrue(ebayLoginPage.setContinue().isDisplayed());
        Assert.assertTrue(ebayLoginPage.setContinue().isEnabled());
        ebayLoginPage.setContinue().click();
        Thread.sleep(5000);
    }

    @When("Enter password")
    public void enterPassword() throws InterruptedException {
        Assert.assertTrue(ebayLoginPage.setPassword().isDisplayed());
        ebayLoginPage.setPassword().sendKeys("Ab1234@#");
        Thread.sleep(2000);
    }

    @And("Click on sign in button")
    public void clickOnSignInButton() throws InterruptedException {
        Assert.assertTrue(ebayLoginPage.setSign_In_Button().isDisplayed());
        Assert.assertTrue(ebayLoginPage.setSign_In_Button().isEnabled());
        ebayLoginPage.setSign_In_Button().click();
        Thread.sleep(5000);
        Assert.assertTrue(ebayLoginPage.setMaybe_Later().isDisplayed());
        Assert.assertTrue(ebayLoginPage.setMaybe_Later().isEnabled());
        ebayLoginPage.setMaybe_Later().click();
        Thread.sleep(2000);
        Assert.assertEquals(ebayLoginPage.setProfile_Name().getText(),"Hi canada!");
        Thread.sleep(5000);
        }


}

