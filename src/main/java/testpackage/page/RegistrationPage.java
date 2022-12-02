package testpackage.page;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://provectapos.com/app/#/register")
public class RegistrationPage {

    private final By companyNameField = By.xpath("//input[@name=\"companyname\"]");
    private final By emailField = By.xpath("//input[@name=\"email\"]");
    private final By passwordField = By.cssSelector("input#password");
    private final By confirmPasswordField = By.xpath("//input[@name=\"passwordConfirm\"]");
    private final By promoCodeField = By.cssSelector("input#promocode");
    private final By registrationButton = By.xpath("//button[@type=\"submit\"]");

    public RegistrationPage typeCompanyName(String name){

    }

}
