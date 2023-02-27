package be.codekata.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class googleNavigator {
    

    @Test
    void GoogleTitle() {

        // Set system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\derid\\Downloads\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is: " + pageTitle);
        String googleTitle = driver.getTitle();
        assertEquals("Google", googleTitle);

         // Close the browser
        driver.quit();
    }

    @Test
    void GoogleSearch() {

        // Set system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\derid\\Downloads\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find and close the popup if it exists
        if (driver.findElements(By.id("L2AGLb")).size() > 0) {
            driver.findElement(By.id("L2AGLb")).click();
        }

        // Find the search bar element and enter the search query
        driver.findElement(By.name("q")).sendKeys("resillion");

        // Submit the search query
        driver.findElement(By.name("btnK")).submit();

        // Find the first search result element and print its link text
        WebElement firstResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[3]/div"));
        System.out.println("The first search result is: " + firstResult.getText());

        assertEquals("Combining best in class expertise across Digital Testing, Cyber Security, Content and Digital Forensics. Resillion will be with you every step of the way.", firstResult.getText());
        // Close the browser
        driver.quit();
    }
}