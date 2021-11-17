package com.amazon.giftsregitry;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverLaunch {
    private static WebDriver driver;

    private static Logger logger= Logger.getLogger(DriverLaunch.class);
    public static void main(String[] args) throws InterruptedException {
        String actualurl="https://www.amazon.com" ;
         String expectedurl =      "https://www.amazon.com";
       System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.MILLISECONDS);
        driver.get(expectedurl);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        Assert.assertEquals(expectedurl,actualurl);
        logger.info("url has validated");

        driver.manage().window().maximize();

        Thread.sleep(5000);

    }
    }



