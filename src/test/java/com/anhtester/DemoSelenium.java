package com.anhtester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoSelenium {
    public static void main(String[] args) {

        //Khoi tao browser voi Chrome
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mo trang anhtester.com
        driver.get("https://anhtester.com/");

        //Click nut login
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();

        //Tat browser
        driver.quit();
    }
}
