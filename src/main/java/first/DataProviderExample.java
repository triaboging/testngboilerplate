package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {
    @DataProvider(name="SearchProvider")
    public Object[][] test(){

        Object[][] data = {{"ловля сома", "на днепре"},{"ловля карася", "в море"}};
        return data;
    }
    static WebDriver driver = new ChromeDriver();
    @BeforeTest
    void setUp() {
        System.setProperty("webdriver.chromedriver", "D:\\chromedriver-win64\\chromedriver.exe");
    }
    @Test(dataProvider = "SearchProvider")
    public void fishTest(String searchTerm, String location){
        driver.get("https://youtube.com");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(searchTerm + " " + location +
                Keys.ENTER);

    }
}