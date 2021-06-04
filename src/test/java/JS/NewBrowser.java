package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewBrowser {
    @Test
    public void Browser(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("Honey", Keys.ENTER);
        driver.findElement(By.id("gh-eb-My")).click();
        driver.navigate().back();
        driver.close();
    }
}
