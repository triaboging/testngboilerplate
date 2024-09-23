package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleSerchPage;

import java.time.Duration;
import java.util.Arrays;

import static tests.Config.PLATFORM_AND_BROWESER;

public class test1 {
    static WebDriver driver;

    @BeforeTest
    public void setup(ITestContext context) {
        String PAB = PLATFORM_AND_BROWESER.get(0);
        switch (PAB){
            case "win.chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            default:     WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        Arrays.stream(context.getAllTestMethods()).forEach(x -> x.setRetryAnalyzerClass(TesnNgRetry.class));

        //Arrays.stream(context.getAllTestMethods()).forEach(x->x.setRetryAnalyzerClass(TesnNgRetry.class));

    }

    @Test
    public static void googleSearthTest() {
        //Assert.assertFalse(true);
        GoogleSerchPage GoogleSerchPage = new GoogleSerchPage(driver).serchField("судак");


    }
}
