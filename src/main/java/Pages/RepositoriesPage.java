package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RepositoriesPage extends BasePage {
    WebElement searchRepository = driver.findElement(By.xpath("//summary[@aria-label=\"View profile and more\"]"));

    public ProfileForm goTProfileForm() {
        searchRepository.click();
        return new ProfileForm(driver);
    }

    public RepositoriesPage(WebDriver driver) {
        super(driver);
    }
}
