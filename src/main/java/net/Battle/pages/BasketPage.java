package net.Battle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasketPage extends BasePage {

    protected WebDriver driver;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class=\"browsing-card-group-layout browsing-card-group-layout--auto browsing-card-group-layout--nested\"]")
    private WebElement jbkbmnbmnb;
}
