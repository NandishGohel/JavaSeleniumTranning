package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) throws Exception
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

       // driver.findElement(By.xpath("//input[@name='username']")).click();
        //driver.findElement(By.Id(<<id>>)).sendKeys(<<>>);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click(); //Login
        System.out.println("cliecked in login btn");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click(); //Click on PIM
        System.out.println("cliecked in PIM btn");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button [@class='oxd-button oxd-button--medium oxd-button--secondary']")).click(); //Add Button
        System.out.println("cliecked in Add btn");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nandish");
        System.out.println("Entered FirstName");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input [@name='middleName']")).sendKeys("H");
        System.out.println("Entered MiddleName");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input [@name='lastName']")).sendKeys("Gohel");
        System.out.println("Entered LastName");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click(); //Save Button
        System.out.println("Data Saved");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
        System.out.println("BAck to PIM");
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("0258");

    }
}
