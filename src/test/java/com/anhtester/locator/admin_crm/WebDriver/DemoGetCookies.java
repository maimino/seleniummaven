package com.anhtester.locator.admin_crm.WebDriver;

import com.anhtester.locator.admin_crm.LocatorsCRM;
import com.anhtester.locator.admin_crm.common.BaseTest;
import com.google.common.cache.LoadingCache;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoGetCookies extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit();

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.iterator().next().toString());


        closeBrowser();

    }
}
