package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Castco {

    @Test
    public void loginpage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.costco.com/");
        driver.findElement(By.id("navigation-dropdown")).click();
        driver.findElement(By.id("Home_Ancillary_0")).click();
        driver.findElement(By.id("Home_Ancillary_1")).click();
       // driver.findElement(By.id("Home_Ancillary_2")).click();
        driver.findElement(By.id("search-field")).sendKeys("Xbox",Keys.ENTER);
        driver.navigate().back();
    }
}
