package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovmentConcept {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver(); //launch chrome
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://spicejet.com/");

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Fleet")).click();

        //a[contains(text(),'Sales')]


    }

}
