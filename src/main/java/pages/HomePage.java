package pages;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import components.HeaderComponent;

public class HomePage extends AbstractPage{

    private static Logger log= LogManager.getLogger(HomePage.class);
    private WebDriver driv;
    
    @FindBy(css=".header-middle")
    private HeaderComponent header;
    
    public HomePage(WebDriver driver){
        this.driv=driver;
        PageFactory.initElements(driver, this);
    }
    
    public HeaderComponent getHeaderComponent(){
        WebDriverWait wait = new WebDriverWait(driv, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf((WebElement) header));
        return header;
    }
    
    public boolean isPageOpened() {
        return getHeaderComponent().isComponentPresent();
    }
}
