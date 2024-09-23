package first;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class Primary {
    static ChromeDriver driver = new ChromeDriver();
    @Test
    public void start(){
    System.setProperty("webdriver.chromedriver", "D:\\chromedriver-win64\\chromedriver.exe");
    driver.manage().window().maximize();
    driver.get("https://www.olx.ua/");
        WebElement searchField;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       searchField =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        WebElement el = driver.findElement(By.className("css-qqmbyk"));

        System.out.println(el.getText());
        searchField.sendKeys("Сайт под ключ", Keys.ENTER);


    }
    @Test
  public void secondMethod(){
       driver.get("https://www.olx.ua/uk/list/q-%D0%A1%D0%B0%D0%B9%D1%82-%D0%BF%D0%BE%D0%B4-%D0%BA%D0%BB%D1%8E%D1%87/");
       WebElement el =  driver.findElement(By.xpath("//span[contains( text() , 'Ми знайшли')]"));
        System.out.println(el.getCssValue("font-size"));
        Actions myAction;
        myAction = new Actions(driver);
        myAction.moveToElement(el).click().contextClick().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement contextMenuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contextMenuItemId")));
        contextMenuItem.click();




    }
    @Test
    public  void thirdMethod(){
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
           // Dimension size = driver.manage().window().getSize();
            driver.get("https://www.olx.ua/uk/");
            driver.manage().window().setSize(new Dimension(500, 800));
            List<WebElement> element = driver.findElements(By.xpath("//a"));
            String w1 = driver.getWindowHandle();
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://example.org");
            driver.switchTo().window(w1);
            WebElement el =  driver.findElement(By.xpath("//input[@id='search']"));
            el.sendKeys("Светозвукой извещатель ДУЕТ" , Keys.ENTER);
//            for (int i = 0; i < element.size(); i++) {
//                System.out.println(element.get(i).getText() + "HREF:" + element.get(i).getAttribute("href"));
//            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    @Test
    public void fourthMethod(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(" http://demo.guru99.com/test/radio.html ");
        WebElement radioButton = driver.findElement(By.cssSelector("input[type='radio']:nth-of-type(2)"));
        radioButton.click();

        if (radioButton.isSelected()) {
            System.out.println("Element has been selected");
        } else {
            System.out.println("Element hasn`t been selected");
        }
//        mySelect.s Select mySelect = (Select) driver.findElement(By.cssSelector("input[type='radio']:nth-of-type(1)"));
//        mySelect.s
    }
    @Test
    public void fifth() throws IOException {
        driver.get("http://demo.guru99.com/test/newtours/register.php ");
        Select mySelect = new Select(driver.findElement(By.name("country")));
       mySelect.selectByVisibleText("ANTARCTICA");
       WebElement selectedOption = mySelect.getFirstSelectedOption();
       WebElement elementForScreenShot = driver.findElement(By.name("country"));

        if (mySelect.getFirstSelectedOption().isSelected()) {
            System.out.println("Element has been selected" + selectedOption.getText() + selectedOption.getAttribute("value"));
//            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(srcFile, new File("./img/image.png"));
         File srcFile = elementForScreenShot.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(srcFile, new File("./img/image1.png"));
        } else {
            System.out.println("Element hasn`t been selected");
        }
    }
    @Test
    public void sixth() {
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement el = driver.findElement(By.xpath("//textarea[@title='Поиск']"));
        Actions act = new Actions(driver);
        act.moveToElement(el).click().keyDown(Keys.LEFT_SHIFT).sendKeys("Путин хуйло").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();

    }

}
