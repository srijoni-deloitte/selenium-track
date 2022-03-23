import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static String driverKey = "webdriver.chrome.driver";
    static String driverPath = "C:\\Users\\srijochakraborty\\Documents\\chromedriver.exe";
    static String url = "https://www.phptravels.net/hotels";
    static WebDriver driver;

    static String navBarItem = "//a[text() = '%s']";

    public static void main(String[] args) {
        System.setProperty(driverKey, driverPath);
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get(url);
        By logoXpath = getPath("//img[@alt='logo']");
        By homXpath = getPath(navBarItem.replace("%s", "Home"));
        By flightsXpath = getPath(navBarItem.replace("%s", "flights"));
        By tourXpath = getPath(navBarItem.replace("%s", "Tours"));
        By compXpath = getPath(navBarItem.replace("%s", "Company "));
        By signUpXpath = getPath(navBarItem.replace("%s", "Signup"));
        By loginXpath = getPath(navBarItem.replace("%s", "Login"));
        By agentDropDwon = getPath("//button[@id='agents']");
        System.out.println(logoXpath);
        System.out.println(homXpath);
        System.out.println(tourXpath);
        System.out.println(compXpath);
        System.out.println(flightsXpath);
        System.out.println(signUpXpath);
        System.out.println(loginXpath);
        System.out.println(agentDropDwon);
    }

    static By getPath(String s) {
        return By.xpath(s);
    }
}