
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AKolesnik_HW1 {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void cssLocators() {

        //by tag name

        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement body2 = wd.findElement(By.xpath("//body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));


        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_3 = wd.findElement(By.xpath("//h1"));


        //by class

        WebElement rootDiv = wd.findElement(By.className("container"));
        WebElement rootDivCss = wd.findElement(By.cssSelector(".container"));
        WebElement rootDivXpath = wd.findElement(By.xpath("//div[@class='container']"));

        WebElement navbarDiv = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navbarCss = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement navbarXpath = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']"));

        WebElement loginZDiv = wd.findElement(By.className("login_login__3EHKB"));
        WebElement loginZCss = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement loginZXpath = wd.findElement(By.xpath("//div[@class='login_login__3EHKB']"));

        WebElement activeA = wd.findElement(By.className("active"));
        WebElement activeCss = wd.findElement(By.cssSelector(".active"));
        WebElement activeXpath = wd.findElement(By.xpath("//a[@class='active']"));

        //by id

        WebElement idDiv = wd.findElement(By.id("root"));
        WebElement idScc = wd.findElement(By.cssSelector("#root.container"));
        WebElement idXpath = wd.findElement(By.xpath("//div[@id='root']"));

        //by attribute

        WebElement langCss = wd.findElement(By.cssSelector("html[lang='en']"));
        WebElement langXpath = wd.findElement(By.xpath("//html[@lang='en']"));

        WebElement charsetCss = wd.findElement(By.cssSelector("meta[charset='utf-8']"));
        WebElement charsetXpath = wd.findElement(By.xpath("//meta[@charset='utf-8']"));

        WebElement meta1_Css = wd.findElement(By.cssSelector("meta[name='viewport']"));
        WebElement meta1_Xpath = wd.findElement(By.xpath("//meta[@name='viewport']"));

        WebElement meta2_Css = wd.findElement(By.cssSelector("meta[name='theme-color']"));
        WebElement meta2_Xpath = wd.findElement(By.xpath("//meta[@name='theme-color']"));

        WebElement meta3_Css = wd.findElement(By.cssSelector("meta[name='description']"));
        WebElement meta3_Xpath = wd.findElement(By.xpath("//meta[@name='description']"));

        WebElement linkCss = wd.findElement(By.cssSelector("link[href='/static/css/main.2e306ff7.chunk.css']"));
        WebElement linkXpath = wd.findElement(By.xpath("//link[@href='/static/css/main.2e306ff7.chunk.css']"));

        WebElement inputCss = wd.findElement(By.cssSelector("input[name='email']"));
        WebElement inputXpath = wd.findElement(By.xpath("//input[@name='email']"));


        //by attribute --> start & end & contains

        //start
        WebElement el3 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pa')]"));
        WebElement metaXpath2 = wd.findElement(By.xpath("//meta[starts-with(@name , 'vie')]"));
        WebElement linkXpath2 = wd.findElement(By.xpath("//link[starts-with(@href, '/static/css/m')]"));


        //end
       

        //contains
        WebElement el31 = wd.findElement(By.xpath("//input[contains(@placeholder,'Pa')]"));
        WebElement metaXpath3 = wd.findElement(By.xpath("//meta[contains(@name , 'vie')]"));
        WebElement linkXpath3 = wd.findElement(By.xpath("//link[contains(@href, '/static/css/m')]"));

    }




}