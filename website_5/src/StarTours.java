import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StarTours {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.startours.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // login myaccount
        WebElement myaccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        myaccount.click();
        Thread.sleep(1000);

        // click on register
        WebElement register = driver.findElement(By.id("RegisterUserLink"));
        register.click();
        Thread.sleep(1000);

        // select title
        WebElement title = driver.findElement(By.xpath("//select[@id='Title']"));
        title.sendKeys("Mrs");
        Thread.sleep(1000);
        driver.close();


    }
}
