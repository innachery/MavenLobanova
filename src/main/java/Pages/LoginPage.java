package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    WebElement usernameField = driver.findElement(By.xpath("//input[@id=\"login_field\"]"));
    WebElement passwordField = driver.findElement(By.id("password"));
    WebElement submit = driver.findElement(By.xpath("//input[@name=\"commit\"]"));

    public RepositoriesPage login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submit.click();
        return new RepositoriesPage(driver);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
