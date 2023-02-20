package Tests;

import Pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateIssueTest extends BaseTest {
    @DisplayName("Check if the issue has been created")
    @Test
    public void newIssueIsCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("***", "***");
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
        creationIssuePage.createIssue("Second", "My second issue");
        int expectedResult = 8; // number of issues after the creation of the current
        Assertions.assertEquals(expectedResult, issuesPage.amountOfIssues());
    }
}

