import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class Main {
    static String driverKey = "webdriver.chrome.driver";
    static String driverPath =  "C:\\Users\\srijochakraborty\\Documents\\chromedriver.exe";
    static String url = "http://the-internet.herokuapp.com";
    static WebDriver driver;

    static String navBarItem = "//a[text() = '%s']";

    public static void main(String[] args) {
        System.setProperty(driverKey, driverPath);
        System.out.println("opening chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("hello herokuapp");
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        driver.switchTo().alert().sendKeys("Text");
        driver.switchTo().alert().accept();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/p[2]")));
        String got=driver.findElement(By.xpath("/html/body/div[2]/div/div/p[2]")).getText();
        String[] split = got.split(" ");
        System.out.println(split[2]);
        System.out.println(got);
        if(split[2].equals("Text")){
            System.out.println("Fetched- "+got+" and desired "+split[2]+" are equal" );
        }
        else{

            System.out.println("Not equal");
        }


        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
        System.out.println("perform dragand drop");
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]")),driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]"))).build().perform();

    }


        }
