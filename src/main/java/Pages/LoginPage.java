package Pages;

import Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ElementUtils {

    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
   //storing as a WebElement
  //    @FindBy(name="username")
  //    private WebElement usernameTextBox;

    //Defining locators
    private final By usernameFeild = By.name("username");
    private final By passwordFeild = By.name("password");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public void enterUserName(String username){
        waitForElementVisibility(usernameFeild);
        driver.findElement((usernameFeild)); // actually no need
        sendText(usernameFeild,username);
    }

    public void enterPassword(String password){
        waitForElementVisibility(passwordFeild);
        driver.findElement((passwordFeild)); // actually no need
        sendText(passwordFeild,password);
    }

    public void clickLoginButton(){
        clickElement(loginButton);
    }
}
