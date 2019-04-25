import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RoyalMail {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.royalmail.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // click track my parcel
        WebElement trackParcel = driver.findElement(By.xpath("//li[@class='track']//a[contains(text(),'Track your item')]"));
        trackParcel.click();
        Thread.sleep(1000);

       // Enter reference number
        WebElement reference = driver.findElement(By.id("track-item"));
        reference.sendKeys("EH123456789");
        Thread.sleep(1000);

        // Track delivery
        WebElement trackDelivery = driver.findElement(By.xpath("//span[@class='track-bt-text ng-binding']"));
        trackDelivery.click();
        Thread.sleep(1000);

        // help with reference number
        WebElement helpRef = driver.findElement(By.xpath("//a[@class='reference-overlay-link ng-binding']"));
        helpRef.click();
        Thread.sleep(1000);

        // close window
        WebElement closeWindow = driver.findElement(By.className("close modalframe-exclude modalframe-processed"));
        closeWindow.click();
        driver.close();





    }

}
