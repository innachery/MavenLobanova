package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreationIssuePage extends BasePage {
    private WebElement titleField = driver.findElement(By.id("issue_title"));
    private WebElement commentField = driver.findElement(By.tagName("textarea"));
    private WebElement submitButton = driver.findElement(By.xpath("//button[@class=\"btn-primary btn ml-2\"]"));

    public WebElement getTitleField() {
        return titleField;
    }

    private WebElement avatar = driver.findElement(By.xpath("//a[@class=\"d-inline-block\"]//img"));

    public WebElement getAvatar() {
        return avatar;
    }

    public CreationIssuePage(WebDriver driver) {
        super(driver);
    }

    public NewIssuePage createIssue(String title, String comment) {
        titleField.sendKeys(title);
        commentField.sendKeys(comment);
        submitButton.click();
        return new NewIssuePage(driver);
    }
}
