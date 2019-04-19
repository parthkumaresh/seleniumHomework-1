import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Computer {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // click computer

        WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
        computer.click();

        //Select Desktop
        WebElement Desktop = driver.findElement(By.xpath("//img[@title='Show products in category Desktops']"));
        Desktop.click();

        // click product want to buy
        WebElement product = driver.findElement(By.xpath("//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]"));
        product.click();

        //add to cart
        WebElement addToCart = driver.findElement(By.xpath("//div[@class='add-to-cart-panel']//input[@value='Add to cart']"));
        addToCart.click();

        // shopping cart
        WebElement shopping = driver.findElement(By.xpath("//span[@class='cart-label']"));
        shopping.click();

        //Agree terms button
        WebElement agree = driver.findElement(By.xpath("//label[@for='termsofservice']"));
        agree.click();

        // check out
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        driver.close();









    }
}
