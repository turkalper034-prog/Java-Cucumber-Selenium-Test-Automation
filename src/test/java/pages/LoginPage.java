package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(id = "username")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "submit")
    private WebElement clickButton;
    @FindBy(xpath = "//h1[@class='post-title']")
    private WebElement assertSuccess;
    @FindBy(className = "post-title")
    private WebElement helloMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void spaceEnter() {
        driver.findElement(By.id("overflow-container")).sendKeys(Keys.SPACE);

    }

    public void setUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void setClickButton() {
        clickButton.click();
    }

    public void setAssertSuccess() {
        Assert.assertTrue(assertSuccess.isDisplayed());

    }


}

