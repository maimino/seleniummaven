package com.anhtester.locator.admin_crm.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddCustomer {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mo website
        driver.get("https://crm.anhtester.com/admin/authentication");

        //Dinh vi cac Element tren trang login CRM
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

        driver.findElement(By.xpath("//input[@id='remember']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Add customer
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//a[contains(normalize-space(), 'New Customer')]")).click();

        //Dien thong tin
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("CTY TNHH 3 thanh vien");
        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("502");
        driver.findElement(By.xpath("//button[contains(normalize-space(), 'Save and create')]")).click();
        //Thread.sleep(3000); //ngu 3s

        //Tat browser
        //driver.quit();

    }
}
