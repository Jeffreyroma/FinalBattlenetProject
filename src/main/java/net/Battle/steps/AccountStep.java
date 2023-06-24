package net.Battle.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import net.Battle.pages.AccountPage;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountStep {

    final AccountPage accountPage;

    public AccountStep(WebDriver driver) {
        accountPage = new AccountPage(driver);
    }

    @Step("Log Out Account")
    public void logOut() {
        log.info("Log Out account");
        accountPage.getAccountNavBar().click();
        accountPage.getExitButton().click();
    }
}
