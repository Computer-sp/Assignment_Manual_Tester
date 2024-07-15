import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomerTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testffc.nimapinfotech.com/");
        // Perform login steps if needed
    }

    @Test(dataProvider = "customerData")
    public void addCustomerTest(String customerName, String customerDetails) {
        WebElement addCustomerButton = driver.findElement(By.id("addCustomerButton"));
        addCustomerButton.click();

        WebElement customerNameField = driver.findElement(By.id("customerName"));
        WebElement customerDetailsField = driver.findElement(By.id("customerDetails"));
        WebElement saveButton = driver.findElement(By.id("saveButton"));

        customerNameField.sendKeys(customerName);
        customerDetailsField.sendKeys(customerDetails);
        saveButton.click();

        // Validate customer addition
        WebElement successMessage = driver.findElement(By.className("success-message"));
        Assert.assertEquals(successMessage.getText(), "Customer added successfully");
    }

    @DataProvider(name = "customerData")
    public Object[][] customerData() {
        return new Object[][]{
            {"Customer1", "Details1"},
            {"Customer2", "Details2"}
        };
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
