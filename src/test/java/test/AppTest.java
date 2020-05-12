package test;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.open;

public class AppTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\Chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @Test
    public void A_loginTest() {
        open("https://dev.n7lanit.ru/");
        open("https://regex101.com/");

    }

    @Test
    public void B_chooseRandom() {

    }

    @Test
    public void C_anotherOne() {

    }
}
