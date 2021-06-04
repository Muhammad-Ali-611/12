package Genaric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public WebDriver driver = null;
    public void API() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\chma6\\Links\\12\\driver\\chromedriver.exe");
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    public void ClearInputField(String locator){
       driver.findElement(By.cssSelector(locator)).clear();
    }
    public void typeOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys();
    }
}
