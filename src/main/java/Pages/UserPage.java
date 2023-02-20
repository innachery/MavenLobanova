package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserPage extends BasePage {
    List<WebElement> listOfRepositories = driver.findElements(By.xpath("//a[@itemprop=\"name codeRepository\"]"));

    public MyRepo goToMyRepoPage() {
        listOfRepositories.get(0).click();
        return new MyRepo(driver);
    }

    public UserPage(WebDriver driver) {
        super(driver);
    }
}
