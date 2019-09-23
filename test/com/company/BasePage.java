package com.company;


import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasePage {

    public WebDriver driver;
    private static final String FIREFOX_PATH = "com/company/RESOURCES/geckodriver.exe";

    public BasePage(){
        this.setDriver();
    }


    @Before
    public void setDriver() {
        System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximazed");
        this.driver=new FirefoxDriver(options);


    }

}
