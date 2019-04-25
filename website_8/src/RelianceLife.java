import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RelianceLife {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.reliancenipponlife.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // claim
        WebElement claim = driver.findElement(By.xpath("//ul[@class='secondary-menu-ul container']//a[contains(text(),'Claims')]"));
        claim.click();
        Thread.sleep(1000);

        //click here
        WebElement submit = driver.findElement(By.xpath("//a[contains(text(),'Click here')]"));
        submit.click();
        Thread.sleep(1000);
        driver.close();

    }
}
