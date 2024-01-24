import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.HomePage;

public class FirstTest {

    @Test
    public void testSearch() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com");
        HomePage home = new HomePage();
        home.getHeaderComponent().clickProductsLink();
        
    }
}
