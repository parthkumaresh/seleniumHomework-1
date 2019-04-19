import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // find element of longin link
        WebElement longinLink = driver.findElement(By.linkText("Log in"));
        longinLink.click();
        //Enter email
        WebElement emailField = driver.findElement(By.id("Email"));
        driver.findElement(By.id("Email")).sendKeys("kesah_2004@yahoo.com");
        // Enter password
        WebElement poasswordField = driver.findElement(By.id("Password"));
        driver.findElement(By.name("Password")).sendKeys("1234");
        // click on log in button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginBtn.click();
       // driver.findElement(By.xpath("//input[@value='Log in'] ")).click();
        Thread.sleep(5000);
        driver.close();



    }
}
