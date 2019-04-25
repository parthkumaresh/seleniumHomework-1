import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BBCSports {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.co.uk/sport");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       //Click on sport
        WebElement sport = driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[contains(text(),'Sport')]"));
        sport.click();
        Thread.sleep(1000);

        //select cricket
        WebElement cricket = driver.findElement(By.xpath("//a[@class='sp-c-sport-navigation__link qa-primary-item sp-nav-click-stat'][contains(text(),'Cricket')]"));
        cricket.click();
        Thread.sleep(1000);

        //Watch live score
        WebElement livescore = driver.findElement(By.xpath("//span[contains(text(),'Live Scores')]"));
        livescore.click();
        Thread.sleep(1000);
        driver.close();


    }
}
