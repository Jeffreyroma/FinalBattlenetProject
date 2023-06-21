package net.Battle.steps;


import lombok.extern.log4j.Log4j2;
import net.Battle.pages.AuthorizationFormPage;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AuthorizationFormStep {

    final AuthorizationFormPage authorizationFormPage;

    public AuthorizationFormStep(WebDriver driver) {
        authorizationFormPage = new AuthorizationFormPage(driver);
    }

    //@Step("Enter email")
    public void enterEmail(String email) {
        log.info("Enter email");
        authorizationFormPage.getEmailField().sendKeys(email);
    }

   // @Step("Enter password")
    public void enterPassword(String password) {
        log.info("Enter password");
        authorizationFormPage.getPasswordField().sendKeys(password);
    }

   // @Step("Click submit button")
    public void clickSubmitButton() {
        log.info("Click submit button");
        authorizationFormPage.getSubmitButton().click();
    }

    //@Step("Get user email")
    public Boolean getUserEmail() {
        log.info("Get user email");
        return authorizationFormPage.getEmailField().isDisplayed();
    }

}
