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

        // Найти заголовок PHONEBOOK
        WebElement title = wd.findElement(By.cssSelector("h1"));
        assertNotNull(title, "Title element not found");

        // Найти ссылку HOME
        WebElement homeLink = wd.findElement(By.cssSelector("a[href='/home']"));
        assertNotNull(homeLink, "Home link not found");

        // Найти ссылку ABOUT
        WebElement aboutLink = wd.findElement(By.cssSelector("a[href='/about']"));
        assertNotNull(aboutLink, "About link not found");

        // Найти кнопку LOGIN (используем класс и стиль для уникальности)
        WebElement loginButton = wd.findElement(By.cssSelector("a[href='/login'].active"));
        assertNotNull(loginButton, "Login button not found");

        // Найти поле ввода Email
        WebElement emailInput = wd.findElement(By.cssSelector("input[name='email']"));
        assertNotNull(emailInput, "Email input not found");

        // Найти поле ввода Password
        WebElement passwordInput = wd.findElement(By.cssSelector("input[name='password']"));
        assertNotNull(passwordInput, "Password input not found");

        // Найти кнопку Login внутри формы
        WebElement loginSubmit = wd.findElement(By.cssSelector("button[name='login']"));
        assertNotNull(loginSubmit, "Login submit button not found");

        // Найти кнопку Registration внутри формы
        WebElement registrationButton = wd.findElement(By.cssSelector("button[name='registration']"));
        assertNotNull(registrationButton, "Registration button not found");
    }

    @AfterClass
    public void tearDown() {
        if (wd != null) {
            wd.quit();
        }
    }
}