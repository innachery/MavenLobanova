package Tests;

import Pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateIssueTest extends BaseTest {

    @Test(description = "Checked the number of issues", priority = 2)
    public void newIssueIsCreated() {
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
        NewIssuePage newIssuePage = new NewIssuePage(driver);
        newIssuePage.goToIssues();
        Assert.assertEquals(issuesPage.amountOfIssues(), 4);
    }
}

