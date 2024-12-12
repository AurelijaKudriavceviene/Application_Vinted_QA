
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.CareersJobsPage;
import pageobject.CareersPage;
import pageobject.HomePage;

public class PositionTest extends BaseTest {

    @Test
    void checkForJuniorQAPosition() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        CareersJobsPage careersJobsPage  = new CareersJobsPage(driver);

        String jobTitle = "Junior Quality Assurance";

        homePage.goToCareerPage();
        careersPage.goToJobsPage();
        careersJobsPage.setJobTitle(jobTitle);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception: " + e.getLocalizedMessage());
        }

        Assertions.assertTrue(careersJobsPage.hasAJobTitle(jobTitle),
                "So sad, there are no junior QA positions at the moment");

    }
}
