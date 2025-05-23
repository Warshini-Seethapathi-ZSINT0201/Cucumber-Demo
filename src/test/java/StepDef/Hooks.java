package StepDef;

import Utils.DriverFactory;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setUp(){
        DriverFactory.getDriver();
    }
    @After
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
