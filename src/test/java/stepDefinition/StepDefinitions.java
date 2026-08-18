package stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utilities.MyDriver;

import java.time.Duration;

public class StepDefinitions {
    private WebDriver driver;
    LoginPage loginPage;

    @Given("go to login page")
    public void go_to_login_page () {
        driver = MyDriver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage = new LoginPage(driver);
        System.out.println("Giriş yap sayfasına gitti.");
        }


    @When("click button")
    public void click_button () {
        loginPage.setClickButton();
        System.out.println("Butona tıkladı.");
    }

    @Then("assert to success message")
    public  void assert_to_success_message () {
        loginPage.setAssertSuccess();
        System.out.println("Doğrulama yapıldı.");

    }


    @And("user types username as {string}")
    public void userTypesUsernameAs(String username) {
        loginPage.setUsername(username);
        System.out.println("Kullanıcı adı girildi.");

    }

    @And("user types as password {string}")
    public void userTypesAsPassword(String password) {
        loginPage.setPassword(password);
        System.out.println("Şifre girildi.");

    }

    @Given("setting driver")
    public void settingDriver() {
        driver = MyDriver.getDriver();
    }

    @Given("go to home page")
    public void goToHomePage() {
        driver.get("https://practicetestautomation.com/");
        System.out.println("Anasayfa açıldı.");
    }

    @When("wait two seconds")
    public void waitTwoSeconds() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("iki saniye bekledi.");
    }


    @Then("see {string} text")
    public void seeText(String text) {
        WebElement helloMessageWE = driver.findElement(By.className("post-title"));
        String helloMessage = helloMessageWE.getText();
        Assert.assertTrue(helloMessage.equals(text));
        MyDriver.closeDriver();
        System.out.println("Yazıyı gördü ve doğrulama yapıldı.");
    }
}
