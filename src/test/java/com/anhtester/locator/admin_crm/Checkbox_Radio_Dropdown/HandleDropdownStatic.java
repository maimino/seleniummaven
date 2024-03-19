package com.anhtester.locator.admin_crm.Checkbox_Radio_Dropdown;

import com.anhtester.locator.admin_crm.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownStatic extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

        select.selectByVisibleText("Monday");
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);

        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);


        select.selectByValue("Sunday");
        System.out.println(select.getFirstSelectedOption().getText());
        sleep(1);


        //Kiem tra da chon dung hay chua
        //Assert.assertEqual(select.getFirstSelectedOption().getText(), "Monday"); //so sanh 2 gia tri effected va actual co bang nhau khong
        closeBrowser();
    }
}
