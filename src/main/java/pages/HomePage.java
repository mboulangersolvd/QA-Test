package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import components.HeaderComponent;

public class HomePage extends AbstractPage{

    @FindBy(css=".header-middle")
    private HeaderComponent header;
    
    public HomePage(){
        
    }
    
    public HeaderComponent getHeaderComponent(){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return header;
    }
    
    public boolean isPageOpened() {
        return getHeaderComponent().isComponentPresent();
    }
}
