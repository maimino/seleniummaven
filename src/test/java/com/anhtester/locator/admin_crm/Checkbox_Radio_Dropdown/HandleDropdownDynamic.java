package com.anhtester.locator.admin_crm.Checkbox_Radio_Dropdown;

import com.anhtester.locator.admin_crm.common.BaseTest;
import org.openqa.selenium.By;

import java.util.Base64;

public class HandleDropdownDynamic extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");

        driver.findElement(By.xpath("(//button[normalize-space()='Search Now']/parent::div)/preceding-sibling::div[1]")).click();

        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys("Ho");
        sleep(1);

        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).click();

        closeBrowser();
    }
}

