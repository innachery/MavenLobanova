package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserPage extends BasePage {
    List<WebElement> listOfRepositories = driver.findElements(By.xpath("//a[@itemprop=\"name codeRepository\"]"));
    WebElement searchField = driver.findElement(By.id("your-repos-filter"));
    List<WebElement> listAfterSearch = driver.findElements(By.xpath("//a[@itemprop=\"name codeRepository\"]"));
    WebElement resultNumber = driver.findElement(By.xpath("//div[@class=\"user-repo-search-results-summary TableObject-item TableObject-item--primary v-align-top\"]"));

    public MyRepo goToMyRepoPage() {
        listOfRepositories.get(0).click();
        return new MyRepo(driver);
    }

    public String numberOfRepoAfterSearch(String name) {
        searchField.sendKeys(name, Keys.ENTER);
        String result = resultNumber.getText();
        return result;
    }

    public UserPage(WebDriver driver) {
        super(driver);
    }
}
