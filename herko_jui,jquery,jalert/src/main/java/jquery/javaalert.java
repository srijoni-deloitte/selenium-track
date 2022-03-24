package jquery;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaalert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\srijochakraborty\\Documents\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement next=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a"));next.click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        Alert simpleAlert=driver.switchTo().alert();
        Thread.sleep(2000);
        simpleAlert.accept();
        Thread.sleep(2000);


    }
}
