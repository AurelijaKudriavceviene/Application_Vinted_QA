package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersJobsPage extends BasePage {


    public CareersJobsPage(WebDriver driver) {super(driver);}

    @FindBy(css = "input[placeholder='Type job title or keyword...']")
    private WebElement titleInputElement;

    @FindBy(css = ".JobsList_listItem__vQXRb")
    private List<WebElement> jobListElements;

    @FindBy(css = ".JobCard_title__m8d6T")
    private WebElement jobTitleElement;

    public void setJobTitle(String jobTitle) {
        waitForVisibilityOf(titleInputElement);
        titleInputElement.sendKeys(jobTitle + Keys.ENTER);
    }

    public boolean hasAJobTitle(String jobTitle) {

        for (WebElement jobTitleElement : jobListElements) {
            String title = jobTitleElement.getText();
            if (title.contains(jobTitle)) {
                return true;
            }
        }
        return false;
    }


}
