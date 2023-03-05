package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AvatarTest extends BaseTest {


    @Test(description = "Checking if the avatar is placed on the issue creation page", priority = 1)
    public void checkAvatarOnCreationIssuePage() {
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
        Assert.assertTrue(creationIssuePage.getAvatar().isDisplayed());
    }
}
