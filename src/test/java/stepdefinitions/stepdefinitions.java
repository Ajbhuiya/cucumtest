package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import runner.SelTest;

import java.util.concurrent.TimeUnit;

public class stepdefinitions {

    WebDriver driver;//initialize driver

    @Given("Open FireFox and I'm at google.com")
    public void open_FireFox_and_I_m_at_google_com() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }

    @When("I enter Iphone in Search Bar")
    public void i_enter_Iphone_in_Search_Bar() {
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("iphone");
    }

        @Then("I should get search results")
        public void i_should_get_search_results () {
            driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();

        }
    }
