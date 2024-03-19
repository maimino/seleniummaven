package com.anhtester.locator.admin_sme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddGroupPromotion {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mo website
        driver.get("https://sme-web-admin.gogroup.vn/");

        //Dang nhap
        driver.findElement(By.xpath("//input[@placeholder='Tài khoản ']")).sendKeys("WEBSME.TEST01");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456a@");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'ant')]")).click();
        //Thread.sleep(2000); //ngu 2s

        //Them moi nhom uu dai
        driver.findElement(By.xpath("//span[contains(text(),'Quản lý ưu đãi')]")).click();
        driver.findElement(By.xpath("//span[@class='ant-menu-title-content'][contains(text(),'Nhóm ưu đãi')]")).click();

        //driver.findElement(By.xpath("//button[contains(text(),'Tạo mới')]")).click();
        driver.findElement(By.xpath("/html/body/app-root/main-layout/nz-layout/nz-layout/nz-content/cms/app-group-promotion-s/app-group-promotion-list/form/div/div/nz-tabset/nz-tabs-nav/div[2]/div/button")).click();

        //Nhap tieu de
        driver.findElement(By.xpath("//input[contains(@placeholder,'Nhập tiêu đề')]")).sendKeys("Demo uu dai 222");

        //Nhap link anh
        driver.findElement(By.xpath("//input[contains(@placeholder,'Nhập link ảnh')]")).sendKeys("https://firebasestorage.googleapis.com/v0/b/seabank-dev.appspot.com/o/N%E1%BB%99p%20thu%E1%BA%BF%2C%20ph%C3%AD%20XNK%20%C4%91i%E1%BB%87n%20t%E1%BB%AD-min_2.jpg?alt=media&token=3ab82094-57d0-4361-9cfc-f8de6db7acb3");

        //Click xac nhan
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Tat browser
        //driver.quit();
    }
}
