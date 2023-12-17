package generalstore.stepdefs;

import generalstore.pages.FormPage;
import generalstore.utils.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static generalstore.utils.Driver.driver;

public class FormPageStepDefs {
    FormPage formPage = new FormPage();

    @When("I should select {string} in country dropdown")
    public void i_should_select_in_country_dropdown(String country) {
        formPage.countryDropdown.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+country+"\"))"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\""+country+"\"]")).click();
    }

    @When("I should type {string} into name field")
    public void i_should_type_into_name_field(String user) {
        formPage.nameField.sendKeys(user);
    }

    @When("I should select {string} as gender")
    public void i_should_select_as_gender(String gender) {
        if (gender.equalsIgnoreCase("female")){
            formPage.female.click();
        }else {
            formPage.male.click();
        }
    }

    @When("I should click on Lets Shop button")
    public void i_should_click_on_lets_shop_button() {
        formPage.letsShopButton.click();
    }

    @Then("I should verify page title {string} is visible")
    public void i_should_verify_page_title_is_visible(String title) {
        ReusableMethods.waitFor(5);
        Assert.assertEquals(formPage.pageHeader.getText(), title);
    }

    @When("I should leave name field empty")
    public void i_should_leave_name_field_empty() {
        formPage.nameField.sendKeys("");
    }

    @Then("I should verify error message {string} is visible")
    public void i_should_verify_error_message_is_visible(String message) {
        Assert.assertEquals(formPage.errorMessage.getAttribute("name"), message);
    }

}
