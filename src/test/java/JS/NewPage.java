package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.URL;

public class NewPage {
@Test
    public void Page() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.youtube.com/");
       driver.findElement(By.id("thumbnail")).click();
       Thread.sleep(3000);
       driver.close();
    }
    @AfterMethod
    public void clear(){

    }
}
