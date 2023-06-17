import net.Battle.driver.DriverManager;
import net.Battle.steps.AuthorizationFormStep;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BattleTest {

    protected WebDriver driver;

    private AuthorizationFormStep authorizationFormStep;



    @BeforeClass
    public void preparationBattleTest() {
        driver = DriverManager.getDriver();
        authorizationFormStep = new AuthorizationFormStep(driver);
    }

    @Test
    public void checkAuthorizationFormData() {
        authorizationFormStep.enterEmail("romamakarcikov@gmail.com");
        authorizationFormStep.enterPassword("Bastardjeffrey123");
        authorizationFormStep.clickSubmitButton();

    }
}
