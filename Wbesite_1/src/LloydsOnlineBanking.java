import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LloydsOnlineBanking
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.lloydsbank.co.uk/personal/a/registration/onlinepersonalregistration.jsp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // click on logon
        WebElement Title = driver.findElement(By.id("frm_personalRegistration:txttitle"));
        Title.sendKeys("Mrs");
        Thread.sleep(2000);
        // Firstname
        WebElement FirstName = driver.findElement(By.id("frm_personalRegistration:txtFirstName"));
        FirstName.sendKeys("Kavita");
        Thread.sleep(2000);
        //  surname
        WebElement LastName = driver.findElement(By.name("frm_personalRegistration:txtsurname"));
        LastName.sendKeys("Shah");
        Thread.sleep(2000);

        // Day of birth
        WebElement DayOfBirth = driver.findElement(By.id("frm_personalRegistration:slctDateDay"));
        DayOfBirth.sendKeys("10");

        // month of birth
        WebElement MonthofBirth = driver.findElement(By.id("frm_personalRegistration:slctDateDay.month"));
        MonthofBirth.sendKeys("April");

        //  enter Year of birth
        WebElement YearofBirth = driver.findElement(By.id("frm_personalRegistration:slctDateDay.year"));
        YearofBirth.sendKeys("1981");
        Thread.sleep(2000);


        // enter postcode
        WebElement Postcode = driver.findElement(By.id("frm_personalRegistration:txtPostcode"));
        Postcode.sendKeys("Lu5 4ef");
        driver.close();

    }
}
