package com.anhtester.locator.admin_crm.WebElement;

import com.anhtester.locator.admin_crm.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6ActionGet {
    public static void main(String[] args) throws InterruptedException {

        //Khoi tao browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //mo to trinh duyet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        //Ham getText()
        String headerPage = driver.findElement(By.xpath(LocatorsCRM.headerLoginPage)).getText();
        System.out.println("header Login Page: " + headerPage);

        //Ham getCSSValue()
        String buttonLogin = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("background-color");
        System.out.println("color button login: " + buttonLogin);

        //Ham getAtribute()
        String inputPassword = driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("id");
        System.out.println("attribute id of input password: " + inputPassword);

        //Ham getSize()
        Dimension dimension = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize();
        System.out.println("Height of btn login: " +dimension.getHeight());
        System.out.println("Width of btn login: " +dimension.getWidth());

        //Ham getLocation()
        Point point = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation();
        System.out.println("X cordinate: " +point.getX());
        System.out.println("Y cordinate: " +point.getY());


        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

        System.out.println("Email: " + driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value"));
        System.out.println("Password: " + driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("value"));

        Thread.sleep(2000);
        driver.quit();
    }
}
