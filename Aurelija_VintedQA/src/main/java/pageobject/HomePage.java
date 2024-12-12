package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {super(driver);}

    @FindBy(css = ".nav-links[href='/about']")
    private WebElement aboutBtnElement;

    @FindBy(xpath = "//span[normalize-space()='Karjera']")
    private WebElement jobsBtnElement;

    public void goToCareerPage() {
        waitForVisibilityOf(cookiesBtnElement);
        cookiesBtnElement.click();
        aboutBtnElement.click();
        waitForVisibilityOf(jobsBtnElement);
        jobsBtnElement.click();
    }
}
