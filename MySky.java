import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MySky {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sky.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click On Myaccount
        WebElement MyAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        MyAccount.click();

        //Enter email
        WebElement EmailField = driver.findElement(By.id("sign-in-userIdentifier"));
        EmailField.sendKeys("kesah_2004@yahoo.com");
        Thread.sleep(2000);

        // enter password
        WebElement Password = driver.findElement(By.id("sign-in-password"));
        Password.sendKeys("xyz1234");
        Thread.sleep(2000);

        // untick box
        WebElement tickbox = driver.findElement(By.xpath("//span[@class='c-form-checkbox__caption c-text-smallprint u-margin-bottom-small']"));
        tickbox.click();
        Thread.sleep(2000);

        // forgot password
        WebElement forgot = driver.findElement(By.xpath("//a[contains(text(),'password')]"));
        forgot.click();

        driver.close();


    }
}
