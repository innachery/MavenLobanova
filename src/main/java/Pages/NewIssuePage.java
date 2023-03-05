package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewIssuePage extends BasePage {
    WebElement issuesstab = driver.findElement(By.id("issues-tab"));

    public NewIssuePage(WebDriver driver) {
        super(driver);
    }
    public IssuesPage goToIssues(){
        issuesstab.click();
        return new IssuesPage(driver);


    }
}
