package net.Battle.steps;

import net.Battle.pages.AccountPage;
import org.openqa.selenium.WebDriver;

public class AccountStep {

    final AccountPage accountPage;

    public AccountStep(WebDriver driver) {
        accountPage = new AccountPage(driver);
    }

    public void logOut() {
        accountPage.getAccountNavBar().click();
        accountPage.getExitButton().click();
    }
}
