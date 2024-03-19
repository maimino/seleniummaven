package com.anhtester.locator.admin_crm.XpathTuyetdoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mo website
        driver.get("https://cms.anhtester.com/login");

        //Dinh vi cac Element tren trang login CMS
        //1. O email
        //Xpath tuyet doi
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/form/div[1]/input")).sendKeys("admin@example.com");

        //2. O password
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("123456");

        //3. Nut login
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/form/button")).click();

        Thread.sleep(3000); //ngu 3s

        //Tat browser
        //driver.quit();

    }
}
