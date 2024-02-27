package Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Order {

    @Test
   public void zohoTest(){
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--headless");
        WebDriver driver=new EdgeDriver(options);
        driver.get("https://www.zoho.com/index1.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("chhaya.singh0902@gmail.com");
        driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@#$%6@12345");
        driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
        driver.quit();
    }

}
