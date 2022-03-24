package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jui {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\srijochakraborty\\Documents\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Actions ac=new Actions(driver);
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement dest=driver.findElement(By.id("droppable"));
        ac.dragAndDrop(src,dest).perform();

    }
}
