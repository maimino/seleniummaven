package com.anhtester.locator.admin_crm.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mo website
        driver.get("https://cms.anhtester.com/login");

        //Dinh vi cac Element tren trang login CMS
        //1. O email
        //Tim kiem element theo id
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //2. O password
        driver.findElement(By.name("password")).sendKeys("123456");

        //4. Linktext Forgot password
        //driver.findElement(By.linkText("Forgot password ?")).click();
        //driver.findElement(By.partialLinkText("password")).click();

        //3. Nut login
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000); //ngu 3s

        //Tat browser
        //driver.quit();

    }
}
