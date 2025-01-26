import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public  class LoginTests {

    @BeforeClass
    public void preCondition() {
        //open браузер
        //открыть сайт

    }
    @Test
    public void loginSuccess() {
        //открыть форму
        //заполнить почту
        //отправить пароль

    }

    public void postConditions() {

        //закрыть браузер
    }

    public class LoginTests {

        WebDriver wd;

        @Test
        public void test() {
            wd = new ChromeDriver();
            //wd.get("https://telranedu.web.app");
            wd.navigate().to("https://telranedu.web.app");

            //wd.close(); //закрывает только одну вкладку
            wd.quit(); // все вкладки
        }
    }
}