package selsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
    public static void main(String[] args){
        String dloc="C:\\Users\\srijochakraborty\\Documents\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",dloc);
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement next = driver.findElement(By.xpath("//div[@id='content']//a[text()='Frames']"));
        next.click();
        WebElement nex= driver.findElement(By.xpath("//div[@id='content']//a[text()='Nested Frames']"));nex.click();
        String title=driver.getTitle();

    }
}
