package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AmazonTest {

    WebDriver driver;
    String baseurl = "http:www.amazon.com";

    @Given("I am on Firefox and on www.Amazon.com")
    public void i_am_on_Firefox_and_on_www_Amazon_com() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseurl);
    }

    @When("I search for apples")
    public void i_search_for_apples() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");


    }

    @Then("I am on Apple search Results page")
    public void i_am_on_Apple_search_Results_page() {
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
        driver.quit();

    }
}
