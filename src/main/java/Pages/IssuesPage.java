package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IssuesPage extends BasePage {
    WebElement newIssueButton = driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]"));

    List<WebElement> listOfIssues = driver.findElements(By.xpath("//span[@class=\"opened-by\"]"));

    public IssuesPage(WebDriver driver) {
        super(driver);
    }

    public CreationIssuePage createIssue() {
        newIssueButton.click();
        return new CreationIssuePage(driver);
    }

    public int amountOfIssues() {
        int actualresult = listOfIssues.size();
        return actualresult;
    }

}
