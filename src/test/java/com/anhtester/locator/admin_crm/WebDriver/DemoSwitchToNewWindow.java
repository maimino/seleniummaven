package com.anhtester.locator.admin_crm.WebDriver;

import com.anhtester.locator.admin_crm.common.BaseTest;
import org.openqa.selenium.WindowType;

public class DemoSwitchToNewWindow extends BaseTest {
    public static void main(String[] args){
        createBrowser(); //mac dinh khong truyen j thi la Chrome
        //createBrowser("edge"); //truyen vao j thi la trinh duyet tuong ung

        //Dieu huong sang 1 trang web
        driver.get("https://anhtester.com/");

        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        sleep(1);

        driver.switchTo().newWindow(WindowType.TAB); //mo tab moi trong trinh duyet
        //driver.switchTo().newWindow(WindowType.WINDOW); //mo cua so moi trong trinh duyet
        driver.get("https://google.com");

        driver.switchTo().window(mainWindow); //chuyen ve cua so mac dinh ban dau

        closeBrowser();
    }
}
