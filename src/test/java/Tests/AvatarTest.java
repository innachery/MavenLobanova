package Tests;

import Pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AvatarTest extends BaseTest {

    public void test() {

        WebElement usernameField = driver.findElement(By.id("login_field"));
        usernameField.sendKeys("innachery");

    }

    @DisplayName("Checking if the avatar is placed on the issue creation page")
    @Test
    public void checkAvatarOnCreationIssuePage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("***", "***");// enter a valid username and password
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.goTProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.goToUserPage();
        UserPage userPage = new UserPage(driver);
        userPage.goToMyRepoPage();
        MyRepo myRepo = new MyRepo(driver);
        myRepo.goToissuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.createIssue();
        CreationIssuePage creationIssuePage = new CreationIssuePage(driver);
        Assertions.assertTrue(creationIssuePage.getAvatar().isDisplayed());
    }
}
