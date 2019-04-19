import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.nopcommerce.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Click on Register
        WebElement registerLink =driver.findElement(By.className("ico-register"));
        registerLink.click();
        // click on gender and select gender
        WebElement genderLink = driver.findElement(By.id("gender-female"));
        genderLink.click();
        Thread.sleep(1000);

        //Enter first name
        WebElement firstName =  driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Kavita");
        Thread.sleep(1000);
        //Enter last name
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Shah");
        Thread.sleep(1000);
        //Enter Date of Birth
        WebElement DOB = driver.findElement(By.name("DateOfBirthDay"));
        DOB.sendKeys("10");
        Thread.sleep(1000);
        WebElement dateOfBirthMonth = driver.findElement(By.name("DateOfBirthMonth"));
        dateOfBirthMonth.sendKeys("January");
        Thread.sleep(1000);
        WebElement DateOfBirthYear = driver.findElement(By.name("DateOfBirthYear"));
        DateOfBirthYear.sendKeys("1990");
        Thread.sleep(1000);
        // Enter email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("kesah_2004@yahoo.com");
        Thread.sleep(1000);
        WebElement company = driver.findElement(By.id("Company"));
        company.sendKeys("ABC");
        Thread.sleep(1000);
        WebElement newletters = driver.findElement(By.id("Newsletter"));
        newletters.click();
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("xyz123");
        WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
        confirmpassword.sendKeys("xyz123");
        WebElement register = driver.findElement( By.id("register-button"));
        register.click();
        driver.close();







    }

}
