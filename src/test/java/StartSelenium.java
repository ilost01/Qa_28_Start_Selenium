import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @Test
    public void test(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app");
        //wd.navigate().to("https://telranedu.web.app");

        //wd.close(); //закрывает только одну вкладку
        wd.quit(); // все вкладки
    }

}
