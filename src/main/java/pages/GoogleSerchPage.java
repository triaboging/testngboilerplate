package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class GoogleSerchPage {
    static private WebElement element = null;
    WebDriver driver = null;
    //static  By searchField =By.xpath("//textarea[@title='Поиск']");


    public GoogleSerchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    private final By search = By.xpath( "//textarea[@title='Поиск'");
    @FindBy(xpath = "//textarea[@title='Поиск']")
     WebElement searchField;

    public GoogleSerchPage serchField(String Text){
        driver.manage().window().maximize();
        driver.get("https://google.com");
        searchField.sendKeys(Text + Keys.ENTER);
        return this;
    }
}
