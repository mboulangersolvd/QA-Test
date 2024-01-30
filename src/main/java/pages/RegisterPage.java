package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends AbstractPage{
  //input[@name='name']
    @FindBy(xpath = "//input[@name='name']")
    private WebElement signupName;
    
    @FindBy(xpath = "//input[@name='email']")
    private WebElement signupEmail;
    
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signupButton;
    
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    private WebElement enterInformationTitle;
    
    @FindBy(css = ".clearfix")
    private List<WebElement> genderCheckboxList;
    
    @FindBy(css = "#password")
    private WebElement passwordInput;
    
    @FindBy(css = "#days")
    private Select daySelect;
    
    @FindBy(css = "#months")
    private Select monthSelect;
    
    @FindBy(css = "#years")
    private Select yearSelect;
    
    @FindBy(css = "#first_name")
    private WebElement firstNameAddressInput;
    
    @FindBy(css = "#last_name")
    private WebElement lastNameAddressInput;
    
    @FindBy(css = "#address1")
    private WebElement addressInput;
    
    @FindBy(css = "#country")
    private Select countrySelect;
    
    @FindBy(css = "#state")
    private WebElement stateInput;
    
    @FindBy(css = "#city")
    private WebElement cityInput;
    
    @FindBy(css = "#zipcode")
    private WebElement zipcodeInput;
    
    @FindBy(css = "#mobile_number")
    private WebElement mobileNumberInput;
    
    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement createAccountButton;
    
    @FindBy(xpath = "//*[@data-qa='account-created']")
    private WebElement accountCreatedTitle;

    @FindBy(xpath = "//button[@data-qa='continue-button']")
    private WebElement continueButton;
    
    @FindBy(xpath = "//*[@data-qa='account-deleted']")
    private WebElement accountDeletedTitle;
    
    public boolean isPageOpened() {
        return signupButton.isDisplayed();
    }
    
    public void fillRegisterForm() {
        signupName.sendKeys("Magali");
        signupEmail.sendKeys("mboulanger@solvd.com");
        signupButton.click();
    }
    
    public boolean isAccountInformationFormPresent() {
        return enterInformationTitle.isDisplayed();
    }
    
    public void fillAccountInformationForm() {
        //TO DO: Put data on config file
        genderCheckboxList.get(0).click();
        passwordInput.sendKeys("p@ssw0rd");
        daySelect.selectByValue("1");
        monthSelect.selectByValue("May");
        yearSelect.selectByValue("1980");
        firstNameAddressInput.sendKeys("Magali");
        lastNameAddressInput.sendKeys("Boulanger");
        addressInput.sendKeys("Street 53 1234, Asdfg, Qwerty");
        countrySelect.selectByValue("Canada");
        stateInput.sendKeys("Asdfg");
        cityInput.sendKeys("qwerty");
        zipcodeInput.sendKeys("123456");
        mobileNumberInput.sendKeys("1234567890");
        createAccountButton.click();
    }
    
    public boolean isAccountCreatedTitlePresent() {
        return accountCreatedTitle.isDisplayed();
    }
    
    public void clickContinueButton() {
        continueButton.click();
    }
    
    public boolean isAccountDeletedTitlePresent() {
        return accountDeletedTitle.isDisplayed();
    }
}
