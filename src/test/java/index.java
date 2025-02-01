import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class index {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///Users/ilost/Downloads/21.index.html");
    }
    @Test
    public void cssLocal() {
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement a = wd.findElement(By.tagName("a"));
        //WebElement li = wd.findElement(By.cssSelector("[class='nav-item']"));
        WebElement header = wd.findElement(By.xpath("//h1"));
        //System.out.println(header.getText()); // Ожидаемый вывод: Welcome


    }

    @Test
    public void tableTest() {
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }




        @AfterClass
        public void tearDown(){
            if (wd != null) {
                wd.quit();
            }
        }


    }

