package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest1 {
    static WebDriver driver = new ChromeDriver();
    public void setUp(){
        System.setProperty("webdriver.chromedriver", "D:\\chromedriver-win64\\chromedriver.exe");

    }
}
