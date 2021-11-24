package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register
{

    static WebDriver driver;
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","src/test/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
        driver.findElement(By.name("FirstName")).sendKeys("milan");
        driver.findElement(By.name("LastName")).sendKeys("vaghasiya");
        driver.findElement(By.name("Email")).sendKeys("milapvaghasiya@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Milan123");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Milan123");
        driver.findElement(By.name("register-button")).click();
       String s1= driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(s1);


    }
}
