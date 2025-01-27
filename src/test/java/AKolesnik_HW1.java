import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class AKolesnik_HW1 {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {
        // Поиск элементов с использованием CSS-селекторов

        // заголовок PHONEBOOK
        WebElement title = wd.findElement(By.cssSelector("h1"));


        // link HOME
        WebElement homeLink = wd.findElement(By.cssSelector("a[href='/home']"));


        // link ABOUT
        WebElement aboutLink = wd.findElement(By.cssSelector("a[href='/about']"));


        // кнопка LOGIN
        WebElement buttonLogin = wd.findElement(By.cssSelector("button[name='login']"));


        // кнопка REG
        WebElement buttonReg = wd.findElement(By.cssSelector("button[name='registration']"));


        // поле ввода Email
        WebElement emailInput = wd.findElement(By.cssSelector("input[name='email']"));


        // поле ввода Password
        WebElement passwordInput = wd.findElement(By.cssSelector("input[name='password']"));




    }

    @AfterClass
    public void tearDown() {

            wd.quit();
    }
}