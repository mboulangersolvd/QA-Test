package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent {

    @FindBy(css= "ul.nav.navbar-nav>li>a[href='/products']")
    private WebElement productsLink;
    
    
    public void clickProductsLink() {
        productsLink.click();
    }
}
