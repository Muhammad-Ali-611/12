package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFilePopOP {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver(); //launch chrome

        driver.get("http://html.com/input-type-file/");

        driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("/Users/naveenkhunteta/Desktop/Extent.html");



    }
}
