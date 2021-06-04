package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gameStop {
    @Test
    public void games(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gamestop.com");
        driver.findElement(By.id("sg-navbar-collapse"));

        driver.quit();
    }
}
