package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    // Has the Code for triggering the browser
  private static WebDriver driver;
   public static WebDriver getDriver(){
       if(driver==null){
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       }
       return driver;
   }

   public static void quitDriver(){
       if(driver!=null){
           driver.quit();
           driver=null;
       }
   }
}
