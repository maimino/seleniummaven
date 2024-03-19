package com.anhtester.locator.admin_crm.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionCheck {
    public static void main(String[] args) throws InterruptedException {

        //Khoi tao browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //mo to trinh duyet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com/");

        //Ham isDisplayed()
        WebElement tagH1 = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']"));
        boolean checkDisplay =  tagH1.isDisplayed(); //Tra ve true/false
        System.out.println(checkDisplay);

        Thread.sleep(2000);

        //Ham isEnabled()
        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
        buttonSubmit.isEnabled();

        if(buttonSubmit.isEnabled() == false){
            System.out.println("Nut sbmit dang bi disable");
        } else {
            System.out.println("Nut submit dang la enable");
        }
        Thread.sleep(2000);

        //Ham isSelected() - dung khi co type = checkbox hoac radio
        driver.get("https://crm.anhtester.com/admin/authentication");
        WebElement checkboxRemember = driver.findElement(By.xpath("//input[@id='remember']"));
        checkboxRemember.isSelected();

        if(checkboxRemember.isSelected() == false){
            System.out.println("Nut checkbox dang khong duoc chon");
        } else {
            System.out.println("Nut checkbox dang duoc chon");
        }

        driver.quit();
    }
}
