package com.anhtester.locator.admin_crm.Checkbox_Radio_Dropdown;

import com.anhtester.locator.admin_crm.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButon extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        //Handle radio
        boolean checkRadio =  driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male: " + checkRadio);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).click();

        boolean checkRadio1 =  driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male after check: " + checkRadio1);

        System.out.println("===================");
        //Handle multi radio button
        List<WebElement> listRadio = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label//input"));
        for (int i=0; i<listRadio.size(); i++){
            System.out.println("Radio thu " + (i+1)+ ": " + listRadio.get(i).isSelected());
        }

        listRadio.get(1).click(); //click chon radio thu 2
        System.out.println("Trang thai radio 2 sau khi click: " + listRadio.get(1).isSelected());


        closeBrowser();
    }
}
