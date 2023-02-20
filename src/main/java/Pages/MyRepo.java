package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyRepo extends BasePage {
    WebElement issuesstab = driver.findElement(By.id("issues-tab"));

    public IssuesPage goToissuesPage() {
        issuesstab.click();
        return new IssuesPage(driver);
    }

    public MyRepo(WebDriver driver) {
        super(driver);
    }
}
