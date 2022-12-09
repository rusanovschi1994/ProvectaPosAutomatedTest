package testspackage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testpackage.steps.RegistrationSteps;

@RunWith(SerenityRunner.class)
public class WhenRegistration {

    @Steps
    RegistrationSteps steps;

    @Managed
    WebDriver driver;

    @Test
    public void typeInvalidConfirmPassword(){
        steps.type_company_name("Melitax");
        steps.type_email("rus@gmail.com");
        steps.type_password("1111");
        steps.type_confirmation_password("1123");
        steps.click_registration_button();
    }
}
