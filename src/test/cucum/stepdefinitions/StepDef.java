package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class StepDef {
    WebDriver driver;

    @Given("I am on facebook Home Page")
    public void i_am_on_facebook_Home_Page() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

    }

    @When("I enter valid user and password")
    public void i_enter_valid_user_and_password() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("bdny8@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1718");
        Thread.sleep(5);

    }

    @Then("I am on my page")
    public void i_am_on_my_page() throws InterruptedException {
        driver.findElement(By.id("u_0_b")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
