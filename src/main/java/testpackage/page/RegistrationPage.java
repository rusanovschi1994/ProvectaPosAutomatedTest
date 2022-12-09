package testpackage.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

import static java.lang.String.*;

@DefaultUrl("https://provectapos.com/app/#/register")
public class RegistrationPage extends PageObject{

    private final By companyNameField = By.xpath("//input[@name=\"companyname\"]");
    private final By emailField = By.xpath("//input[@name=\"email\"]");
    private final By passwordField = By.xpath("//input[@name=\"password\"]");
    private final By confirmPasswordField = By.xpath("//input[@name=\"passwordConfirm\"]");
    private final By promoCodeField = By.cssSelector("input#promocode");
    private final By registrationButton = By.xpath("//button[@type=\"submit\"]");
    private String errorByText = "//label[@class=\"input state-error\"]/following-sibling::em[text() = \"%s\"]";
    private final By errors = By.xpath("//label[@class=\"input state-error\"]/following-sibling::em");


    public RegistrationPage typeCompanyName(String name){

        find(companyNameField).sendKeys(name);
        return this;
    }

    public RegistrationPage typeEmail(String email){

        find(emailField).sendKeys(email);
        return this;
    }

    public RegistrationPage typePassword(String password){

        find(passwordField).sendKeys(password);
        return this;
    }

    public RegistrationPage typeConfirmPassword(String password){

        find(confirmPasswordField).sendKeys(password);
        return this;
    }

    public RegistrationPage typePromoCode(String promoCode){

        find(promoCodeField).sendKeys(promoCode);
        return this;
    }

    public void clickRegistrationButton(){

        find(registrationButton).waitUntilVisible().click();
    }

    public List<WebElementFacade> getErrors(){

        return findAll(errors);
    }

    public String getErrorByNumber(int number){

        return findAll(errors).get(number - 1).getText();
    }

    public boolean errorIsVisible(String message){

        return findAll(By.xpath(format(errorByText, message))).size() > 0 &&
                findAll(By.xpath(format(errorByText, message))).get(0).isDisplayed();
    }
}
