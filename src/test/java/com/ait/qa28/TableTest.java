package com.ait.qa28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void tableCssTest() {
        // Assuming you want to select the second `td` of the eighth row
        WebElement canada = driver.findElement(By.cssSelector("#customers tr:nth-child(8) td:nth-child(2)"));
        System.out.println(canada.getText());

        List<WebElement> elements = driver.findElements(By.cssSelector("tr"));
        System.out.println(elements.size());
        System.out.println("==================================11==========================");
        for (WebElement el : elements) {
            System.out.println(el.getText());
            System.out.println("===============================22=============================");
        }

    }
}
