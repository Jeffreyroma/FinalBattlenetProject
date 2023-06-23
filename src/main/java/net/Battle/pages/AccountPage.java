package net.Battle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    protected WebDriver driver;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"Navbar-label Navbar-accountAuthenticated\"]")
    private WebElement accountNavBar;

    @FindBy(xpath = "//div[@class=\"Navbar-accountDropdownLinkLabel\"][text()=\"Выход\"]")
    private WebElement exitButton;

    public WebElement getAccountNavBar() {
        return accountNavBar;
    }

    public WebElement getExitButton() {
        return exitButton;
    }
}
