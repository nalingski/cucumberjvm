package nz.co.assurity.test;


/**
 * A Sample Step definition class.
 *
 * @author: Nalin Goonawardana
 * Date: 1/17/16
 * Time: 3:46 PM
 * To change this template use File | Settings | Editor |File and code Templates.
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleStepDef {


    protected static ChromeDriver driver;

    private static void navigate() {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("user-data-dir=" + chromeCacheDir);
//		options.addArguments("--disk-cache-dir=" + chromeCacheDir);
        options.addArguments("--disable-translate");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-translate");
        options.addArguments("--disable-default-apps");
        options.addArguments("--disable-extensions-file-access-check");
        options.addArguments("--disable-prompt-on-repost");
        options.addArguments("--disable-popup-blocking=false");
        options.addArguments("--disable-restore-background-contents");
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);

    }

//    @Before
//    public void setup() {
////	        driver = new FirefoxDriver();
//        navigate();
//    }

    @Given("^I open google nz$")
    public void I_open_google() {

        //Set implicit wait of 10 seconds and launch google
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://booking.uz.gov.ua/en/");
    }

    @When("^I enter \"([^\"]*)\" in search textbox nz$")
    public void I_enter_in_search_textbox(String additionTerms) {
        driver.findElement(By.name("station_from")).clear();
        driver.findElement(By.name("station_from")).sendKeys("test");
        driver.findElement(By.name("station_till")).clear();
        driver.findElement(By.name("station_till")).sendKeys("test");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.close();
    }


//    @After
//    public void closeBrowser() {
//        driver.quit();
//    }

}


