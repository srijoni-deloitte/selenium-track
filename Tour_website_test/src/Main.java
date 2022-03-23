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
        //Assignment 1
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
        //Assignment 2
        By checkin = getPath("//input[@class='checkin form-control form-control-lg border-top-r0']");
        By checkout = getPath("//input[@class='checkout form-control form-control-lg border-top-l0']");
        By adultDec = getPath("//div[@class='dropdown-menu dropdown-menu-wrap']//div[@class='dropdown-item'][2]//i[@class='la la-minus']");
        By adultInc = getPath("//div[@class='dropdown-menu dropdown-menu-wrap']//div[@class='dropdown-item'][2]//i[@class='la la-plus']");
        By childPlus = getPath("//div[@class='dropdown-menu dropdown-menu-wrap']//div[@class='dropdown-item'][3]//i[@class='la la-plus']");
        By childminus = getPath("//div[@class='dropdown-menu dropdown-menu-wrap']//div[@class='dropdown-item'][3]//i[@class='la la-minus']");
        System.out.println(checkin);
        System.out.println(checkout);
        System.out.println(adultDec);
        System.out.println(adultInc);
        System.out.println(childPlus);
        System.out.println(signUpXpath);
        System.out.println(childminus);
    }

    static By getPath(String s) {
        return By.xpath(s);
    }
}
