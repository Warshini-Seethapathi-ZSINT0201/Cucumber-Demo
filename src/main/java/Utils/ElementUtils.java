package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtils {
    //Reusable functions
    private final WebDriver driver;
    private final WebDriverWait wait;

    public ElementUtils(WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void waitForElementVisibility(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    public void clickElement(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    public void sendText(By locator, String textToBeEntered){
        WebElement element = driver.findElement(locator);
        element.sendKeys(textToBeEntered);
    }

}
