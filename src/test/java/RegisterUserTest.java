import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class RegisterUserTest extends BaseTest{
    @Test
    public void testRegisterUser() {
        HomePage home = openHomePage();
        Assert.assertTrue(home.isPageOpened(), "HomePage is not opened.");
        RegisterPage registerPage = home.getHeaderComponent().clickSignUpLink();
        Assert.assertTrue(registerPage.isPageOpened(), "Register Page is not opened.");
        registerPage.fillRegisterForm();
        Assert.assertTrue(registerPage.isAccountInformationFormPresent(), "Account information form is not opened.");
        registerPage.fillAccountInformationForm();
        Assert.assertTrue(registerPage.isAccountCreatedTitlePresent(), "The account was not created.");
        registerPage.clickContinueButton();
        home.getHeaderComponent().clickDeleteAccountLink();
        Assert.assertTrue(registerPage.isAccountDeletedTitlePresent(), "The account was not created.");
        
    }
}
