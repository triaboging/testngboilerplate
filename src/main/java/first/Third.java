package first;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.time.Duration;

public class Third {
    static WebDriver driver = new ChromeDriver();

    @BeforeTest
    //@Parameters({"browser", "url"})
    void setUp() {
        WebDriverManager.chromedriver().setup();
//        if(browser.equalsIgnoreCase("chrome")) {
////            System.setProperty("webdriver.chromedriver", "D:\\chromedriver-win64\\chromedriver.exe");
//
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            return;
//        }

    }


    @Test(groups = {"one"})
    public void firstMethod() {
        driver.get("http://youtube.com");
        String expectedTitle = "Youtube";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            Assert.assertEquals(driver.getTitle(), expectedTitle, "Element shmelement");
        } catch (AssertionError e) {
            System.out.println("Something get wrong" + e.getMessage());
        }
        System.out.println(1);
    }

    @Test(groups = {"one"})
    public void secondMethod() {
        System.out.println(2);
    }

    @Test(groups = {"two"})
    public void thirdMethod() {
        System.out.println(3);

    }

    @Test(groups = {"one", "two"})
    public void fourthdMethod() {
        System.out.println(4);

    }
}
