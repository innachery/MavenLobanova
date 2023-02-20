package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileForm extends BasePage {
    WebElement repo = driver.findElement(By.xpath("//a[text()='Your repositories']"));

    public UserPage goToUserPage() {
        repo.click();
        return new UserPage(driver);
    }

    public ProfileForm(WebDriver driver) {
        super(driver);
    }
}
