package testpackage.steps;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import testpackage.page.RegistrationPage;

public class RegistrationSteps {

    RegistrationPage regPage;

    @Step
    public void type_company_name(String name){

        regPage.typeCompanyName(name);
    }

    @Step
    public void type_email(String email){

        regPage.typeEmail(email);
    }

    @Step
    public void type_password(String password){

        regPage.typePassword(password);
    }

    @Step
    public void type_confirmation_password(String password){

        regPage.typeConfirmPassword(password);
    }

    @Step
    public void type_promo_code(String code){

        regPage.typePromoCode(code);
    }

    @Step
    public void click_registration_button(){

        regPage.clickRegistrationButton();
    }

    @Step
    public void should_see_error(String message){

        Assertions.assertThat(regPage.errorIsVisible(message))
                .as("User should see message, but he doesn't")
                .isTrue();
    }

    @Step
    public void should_not_see_error(String message){

        Assertions.assertThat(regPage.errorIsVisible(message))
                .as("User should does not see message, but he does")
                .isFalse();
    }

    @Step
    public void should_see_error_size(int number){

        Assertions.assertThat(regPage.getErrors()).hasSize(number);
    }

    @Step
    public void should_see_error_by_number(String message, int number){

        Assertions.assertThat(regPage.getErrorByNumber(number)).isEqualTo(message);
    }
}
