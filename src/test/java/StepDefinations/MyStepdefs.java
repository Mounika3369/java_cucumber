package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;
    @Given("open url")
    public void openUrl() {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @When("enter username")
    public void enterUsername() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

    }

    @And("enter password")
    public void enterPassword() {
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("user login success")
    public void userLoginSuccess() {
        String title= driver.getTitle();
        System.out.println(title);
    }
}
