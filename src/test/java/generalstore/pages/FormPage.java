package generalstore.pages;

import generalstore.utils.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement countryDropdown;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public WebElement nameField;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
    public WebElement female;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
    public WebElement male;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public WebElement letsShopButton;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    public WebElement pageHeader;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public WebElement errorMessage;

}
