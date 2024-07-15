import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testffc.nimapinfotech.com/");
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        WebElement dashboardElement = driver.findElement(By.id("dashboard"));
        Assert.assertNotNull(dashboardElement);
        driver.quit();
    }
}
