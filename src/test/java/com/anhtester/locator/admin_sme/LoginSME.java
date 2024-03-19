package com.anhtester.locator.admin_sme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSME {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mo website
        driver.get("https://sme-web-admin.gogroup.vn/");

        //Dinh vi cac Element tren trang login CMS
        //1. Nhap username
        //Tim kiem element theo id
        driver.findElement(By.xpath("//input[@placeholder='Tài khoản ']")).sendKeys("WEBSME.TEST01");
        Thread.sleep(1000);


        //2. Nhap password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456a@");
        Thread.sleep(1000);

        //3. Click nut dang nhap
        //driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath("//button[contains(@class,'ant')]")).click();
        Thread.sleep(3000); //ngu 3s

        //Tat browser
        //driver.quit();

    }
}
