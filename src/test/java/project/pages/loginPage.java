package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class loginPage extends basePage {

    public void loginPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(name = "txtUsername")
    public WebElement userName;

    @FindBy(name = "txtPassword")
    public WebElement userPwd;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    public void userLogin(String userName, String userPwd) {
        this.userName.sendKeys(userName);
        this.userPwd.sendKeys(userPwd);
        this.loginButton.click();
    }
}
