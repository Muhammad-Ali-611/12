package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Rename {
    @Test
    public void name(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver","C:\\Users\\chma6\\Links\\12\\driver\\chromedriver.exe");
        driver.get("https://www.google.com/");
   driver.manage().window().maximize();
     driver.close();
    }

}
