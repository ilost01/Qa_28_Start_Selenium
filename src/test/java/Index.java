import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("/Users/ilost/Downloads/21.index.html");
    }

    @Test
    public void cssLocal(){
       WebElement button = wd.findElement(By.tagName("button"));
       WebElement a  = wd.findElement(By.tagName("a"));


    }
}
