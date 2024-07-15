import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testffc.nimapinfotech.com/");
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        // Validate login
        WebElement dashboardElement = driver.findElement(By.id("dashboard"));
        Assert.assertNotNull(dashboardElement);
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
            {"user1", "password1"},
            {"user2", "password2"}
        };
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
