package com.anhtester.locator.admin_crm.Checkbox_Radio_Dropdown;

import com.anhtester.locator.admin_crm.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

//        boolean chekCheckbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
//        System.out.println("Trang thai checkbox ban dau: " + chekCheckbox1);

        //Kiem tra xem da chon checkbox hay chua
//        if (chekCheckbox == false){
//            driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
//        }

        //Click chon checkbox
//        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
//
//        boolean chekCheckbox2 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
//        System.out.println("Trang thai checkbox sau khi da click: " + chekCheckbox2);
//
//        boolean checkMessageDisplayed = driver.findElement(By.xpath("//div[@id='txtAge']")).isDisplayed();
//        System.out.println("Xuat hien message (t/f): " + checkMessageDisplayed);
//        System.out.println("Noi dung hien thi (y/n): " + driver.findElement(By.xpath("//div[@id='txtAge']")).getText());

        //Handle multi checkbox
        List<WebElement> listCheckboxDefault = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']")); //tim nhieu phan tu input
        for (int i = 0; i<listCheckboxDefault.size(); i++){
            System.out.println("Checkbox vi tri thu " + (i+1) + ": " + listCheckboxDefault.get(i).isSelected());
        }

        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option 2']")).click();

        //Cach 1
        List<WebElement> listCheckboxAfter = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']")); //tim nhieu phan tu input
        System.out.println("===================");
        for (int i = 0; i<listCheckboxAfter.size(); i++){
            System.out.println("Checkbox vi tri thu " + (i+1) + ": " + listCheckboxAfter.get(i).isSelected());
        }

        System.out.println("===================");
        //Cach 2 dung truc tiep index voi xpath cu the
        for (int i=0; i<listCheckboxDefault.size();i++){
            System.out.println(" Vi tri thu " + (i+1) + ": " +  driver.findElement(By.xpath("(//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox'])[" + (i + 1) + "]")).isSelected());
        }

        closeBrowser();
    }
}
