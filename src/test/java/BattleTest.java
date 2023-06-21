import net.Battle.driver.DriverManager;
import net.Battle.models.UserData;
import net.Battle.steps.AuthorizationFormStep;
import net.Battle.steps.ShopStep;
import net.Battle.utils.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BattleTest extends BaseTest {

    protected WebDriver driver;

    private AuthorizationFormStep authorizationFormStep;

    private ShopStep shopStep;

    @BeforeClass
    public void preparationBattleTest() {
        driver = DriverManager.getDriver();
        authorizationFormStep = new AuthorizationFormStep(driver);
        shopStep = new ShopStep(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class, description = "Login user")
    public void checkAuthorizationFormData(UserData userData) {
        authorizationFormStep.enterEmail(userData.getEmail());
        authorizationFormStep.enterPassword(userData.getPassword());
        authorizationFormStep.clickSubmitButton();
        Assert.assertTrue(authorizationFormStep.getUserEmail());
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class, description = "Add game Hearthstone in basket")
    public void checkShopForm(UserData userData) throws InterruptedException {
        authorizationFormStep.enterEmail(userData.getEmail());
        authorizationFormStep.enterPassword(userData.getPassword());
        authorizationFormStep.clickSubmitButton();

        shopStep.clickShopButton();
        shopStep.inputNameOfTheGame("Hearthstone game");
        shopStep.clickButtonOfCertainGameHearthstone();
        shopStep.clickAddToCartButton();
        shopStep.clickViewCartButton();
        Assert.assertTrue(shopStep.getCardGameHearthstone());
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class, description = "Add game Call of Duty in basket")
    public void addGameCallOfDutyInBasket(UserData userData) throws InterruptedException {
        shopStep.clickShopButton();
        shopStep.inputNameOfTheGame("Call of Duty Black Ops 4");
        shopStep.clickButtonOfCertainGameCallOfDutyBlackOps4();
        shopStep.clickAddToCartButton();
        shopStep.clickViewCartButton();
        Assert.assertTrue(shopStep.getCardGameCallOfDutyBlackOps4());
    }
}
