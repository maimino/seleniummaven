package com.anhtester.locator.admin_crm.WebElement;

import com.anhtester.locator.admin_crm.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //mo to trinh duyet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        //sendKeys, click, clear
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit(); //dung khi button co type='submit'

        Thread.sleep(2000);
        driver.quit();
    }
}
