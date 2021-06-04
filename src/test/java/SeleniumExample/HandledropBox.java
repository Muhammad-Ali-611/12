package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandledropBox {



    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); //launch chrome

        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url

        //handle drop box:
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByVisibleText("California");





    }

}
