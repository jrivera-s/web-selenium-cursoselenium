package com.project.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	
    /**
     * Constructor WebDriver
     * @author ricardo.avalos
     * @param driver
     */
    private WebDriver driver;
    
    public Base(WebDriver driver) {
        this.driver = driver;        
    }
    
    /**
     * Chrome driver connection
     * @author ricardo.avalos
     * @param
     */
    
    public WebDriver chromedriverConnection() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    
    /**
     * Launch Browser
     * @author ricardo.avalos
     * @param url
     */
    
    public void launchBrowser(String url) {
        reporterLog("Launch Browser "+ url);
        driver.get(url);
        driver.manage().window().maximize();
        implicitlyWait(5);        
    }
    
    /**
     * Reporter log
     * @author ricardo.avalos
     */
    
    public void reporterLog(String log) {
        Reporter.log(log);
    }
    
    /**
     * Implicitly Wait
     * @author ricardo.avalos
     */
    
    public void implicitlyWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
	
}
