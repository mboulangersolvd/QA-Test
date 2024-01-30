package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.ProductsListPage;
import pages.RegisterPage;

public class HeaderComponent {

    @FindBy(css= "ul.nav.navbar-nav>li>a[href='/products']")
    private WebElement productsLink;
    
    @FindBy(xpath= "//header[@id='header']//a[contains(text(), 'Signup')]")
    private WebElement signUpLink;
    
    @FindBy(xpath = "//a[text()=' Delete Account']")
    private WebElement deleteAccountLink;
    
    public ProductsListPage clickProductsLink() {
        productsLink.click();
        return new ProductsListPage();
    }
    
    public RegisterPage clickSignUpLink() {
        signUpLink.click();
        return new RegisterPage();
    }
    
    public boolean isComponentPresent() {
        return productsLink.isDisplayed();
    }
    
    public void clickDeleteAccountLink() {
        deleteAccountLink.click();
    }
    
    
}
