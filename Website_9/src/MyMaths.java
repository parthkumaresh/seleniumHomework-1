import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyMaths {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mymaths.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // log in
        WebElement username = driver.findElement(By.id("account_user_name"));
        username.sendKeys("shivam");
        Thread.sleep(1000);

        // passsword
        WebElement password = driver.findElement(By.id("account_password"));
        password.sendKeys("shah123");
        Thread.sleep(1000);

        //click login
        WebElement login = driver.findElement(By.xpath("//input[@name='commit']"));
         login.click();
         driver.close();






    }
}
