package JS;

import Genaric.Base;
import SearchPage.Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Apple extends  Base{
    @Test
    public void apple() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
      List<String> itemList = Search.getItemList();
        for (String item: itemList){
       typeOnCss("#ac-gn-searchform-input");
       Thread.sleep(3000);
       ClearInputField("#ac-gn-searchform-input");
        }

    }





}
