package com.ait.qa28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstSeleniumTest {
    WebDriver driver;
    //before - setUp
      //test
    //after - tearDown

    @BeforeMethod
    public  void  setUp(){
        driver= new ChromeDriver();
        driver.get("https://www.google.com");

    }
    @Test
    public void openGogleTest(){
        System.out.println("S open!");
    }



}
