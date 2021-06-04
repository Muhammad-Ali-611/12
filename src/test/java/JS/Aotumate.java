package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Aotumate {

   // public WebDriver driver = null;

    @Test
    public void Aotumate() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.com");
        driver.findElement(By.id("icp-nav-flyout")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop", Keys.ENTER);
        driver.findElement(By.className("s-image")).click();
        driver.findElement(By.id("nav-logo-sprites")).click();
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.id("nav-xshop")).click();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.close();


    }
}
  /*  @Test
    public void clear(){
        driver.close();
    }
    @AfterMethod
    public void windows(){
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().forward();
    }*/


