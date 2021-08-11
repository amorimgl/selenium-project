package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basePage {

    public static WebDriver driver;

    public void openFirefoxBrowser(String browserUrl) {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(browserUrl);
    }

    public void openChromeBrowser(String browserUrl) {

        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.whitelistedIps", "10.1.0.121");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(browserUrl);
    }

    public void closeBrowser() {

        driver.close();
    }
}

