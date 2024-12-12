package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//a[normalize-space()='Jobs']")
    private WebElement jobBtnElement;

    public void goToJobsPage() {
        waitForVisibilityOf(cookiesBtnElement);
        cookiesBtnElement.click();
        waitForVisibilityOf(jobBtnElement);
        jobBtnElement.click();
    }
}
