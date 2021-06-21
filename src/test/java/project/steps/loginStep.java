package project.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import project.pages.loginPage;
import project.pages.basePage;
import project.common.EnvUrl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep extends basePage {

    private EnvUrl newEnvUrl;
    private String siteUrl;
    private String actualUrl;

    public loginStep() {
        this.newEnvUrl = new EnvUrl();
        this.siteUrl = newEnvUrl.getEnvUrl();
        this.actualUrl = newEnvUrl.getActualEnvUrl();
    }

    private String username = "Admin";
    private String userpwd = "admin123";

    basePage browser = new basePage();

    @Given("the user accesses the system page")
    public void openPageSystem() {
        browser.openChromeBrowser(siteUrl);
    }

    @When("the user inserts the credentials")
    public void setUserCredentials() {
        loginPage login = PageFactory.initElements(driver, loginPage.class);
        login.userLogin(username, userpwd);
    }

    @Then("the page is available")
    public void checkThePage() {
        String expectedUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);

        loginPage login = PageFactory.initElements(driver, loginPage.class);
        login.welcomeMessage.isDisplayed();
        browser.closeBrowser();
    }
}
