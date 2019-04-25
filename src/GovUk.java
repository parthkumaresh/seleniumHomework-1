import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GovUk {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gov.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // search
        WebElement categories = driver.findElement(By.xpath("//ul[@class='categories-list']//a[contains(text(),'Benefits')]"));
        categories.click();

        WebElement childcare = driver.findElement(By.xpath("//div[@id='root']//a[contains(text(),'Childcare and parenting')]"));
        childcare.click();
        driver.close();






    }
}
