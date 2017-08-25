package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by nagaiah on 08/25/2017.
 */
public class WebDriverSample {

    public static void main(String[] args){
        String currentDir = System.getProperty("user.dir");
//        System.setProperty("webdriver.gecko.driver",currentDir+"/Drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        driver.findElement(By.id("identifierId")).sendKeys("nagaiahb07@gmail.com");
        try {
            Thread.sleep(3000);
        }catch (Exception e){}
        driver.quit();
        }
}
