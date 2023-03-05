package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void openPageAndSignIn() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Алекс\\IdeaProjects\\first-maven\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://github.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("***", "***");// enter a valid username and password

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
