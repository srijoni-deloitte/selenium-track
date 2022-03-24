import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class Main {
    static String driverKey = "webdriver.chrome.driver";
    static String driverPath = "C:\\Users\\srijochakraborty\\Documents\\chromedriver.exe";
    static String url = "https://www.phptravels.com";
    static WebDriver driver;

    static String navBarItem = "//a[text() = '%s']";

    public static void main(String[] args) {
        System.setProperty(driverKey, driverPath);

        //going to demo page
        System.out.println("Question :3");
        check_for_demo_page();
        //going to login page
        System.out.println("Question :5");
        check_for_login_page();
        System.out.println("Question :7");
        System.out.println("Switching back to demo tab");
        ArrayList tabs = new ArrayList (driver.getWindowHandles());

        driver.switchTo().window((String) tabs.get(0));
        System.out.println("Question :8");
        System.out.println("Current page url:");
        System.out.println(driver.getCurrentUrl());
        check_for_pricing_page();
        System.out.println("Question :10");
        System.out.println("navigating back to previous page");
        driver.navigate().back();
        System.out.println("Question :11");
        System.out.println("refreshing this page"+driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println("Question :12");
        System.out.println("Closing browser");
        //Closing browser
        driver.close();
        driver.close();

    }

    static void check_for_pricing_page() {
        System.out.println("Question :9");
        System.out.println("Hello Pricing");
        driver.findElement(By.xpath("/html/body/header/div/nav/a[2]")).click();
        get_Page_Title();
    }

    static void check_for_login_page() {
        System.out.println("Hello Login");
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.xpath("/html/body/header/div/nav/a[4]")).sendKeys(selectLinkOpeninNewTab);
        System.out.println("Question :6");
        get_Page_Title();

    }

    static void check_for_demo_page() {
        System.out.println("Question 1: opening chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("hello demo");
        driver.get("https://www.phptravels.com/demo");
        System.out.println("Question :4");
        get_Page_Title();
    }

    static void get_Page_Title(){
        String Title=driver.getTitle();
        System.out.println(Title);

        try{
            Assert.assertTrue(Title.contains("PHPTRAVELS"));
            System.out.println("PASS");
        }
        catch (AssertionError e){
            System.out.println("FAILED");
        }
        }



    static By getPath(String s) {
        return By.xpath(s);
    }
}
