package pages;

import org.openqa.selenium.support.FindBy;

import components.HeaderComponent;

public class HomePage {

    @FindBy(css=".header-middle")
    private HeaderComponent header;
    
    
    public HomePage(){
        
    }
    
    public HeaderComponent getHeaderComponent(){
        return header;
    }
}
