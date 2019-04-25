import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DwarkeshHospital {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dwarkeshhospital.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //About hospital
        WebElement aboutus = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'About Us')]"));
        aboutus.click();
        Thread.sleep(1000);

        //click on resources
        WebElement resources = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Resources / Empanelment')]"));
        resources.click();
        Thread.sleep(1000);

        // check facility
        WebElement facility = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Facilities')]"));
        facility.click();
        Thread.sleep(1000);

        //pharmacy
        WebElement pharmacy = driver.findElement(By.xpath("//a[contains(text(),'PHARMACY')]"));
        pharmacy.click();
        Thread.sleep(1000);
        driver.close();


    }
}
