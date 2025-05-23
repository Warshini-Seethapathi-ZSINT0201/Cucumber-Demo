package StepDef;

import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the login page")
    public void user_on_login_page(){
        driver = DriverFactory.getDriver();
        loginPage=new LoginPage(driver); // Object for login page is created because we need to use the functions available in loginpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @And("user enter {string} and {string}")
    public void user_enter_username_and_password( String username, String password){
            loginPage.enterUserName(username);
            loginPage.enterPassword(password);
    }

    @And("user clicks the login button")
    public void user_click_login(){
           loginPage.clickLoginButton();
    }

    @Then("use should be successfully logged in")
    public void success_login(){

    }
}
