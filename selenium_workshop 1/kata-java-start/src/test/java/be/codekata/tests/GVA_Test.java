package be.codekata.tests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GVA_Test {
    @Test
    void GVA_Test()  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\derid\\Downloads\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.gva.be/");

        // Wait for the popup to appear
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/button[2]")));

        // Find the button inside the popup by its XPath and click it
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/button[2]")).click();

        // Find the button inside the popup by its XPath and click it
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/header/div[1]/nav/ul[1]/li[3]/a/div")).click();

        // Find the h1 element by its XPath
        WebElement h1Element = driver.findElement(By.xpath("/html/body/div[5]/div/div/main/div/div[2]/div/div/div[1]/div/div/div/a/div/div/div/h1"));

        // Get the text of the h1 element
        String h1Text = h1Element.getText();
        System.out.println("The title of the page is: " + h1Text);
        // Check if the h1 text equals the expected text
        String expectedText = "KVM-coach Defour rekent zich nog niet rijk tegen Zulte Waregem: “Maar wel logisch dat we aan de bekerfinale denken”";
        assertEquals(expectedText, h1Text);

        // Close the browser
        driver.quit();
    }
}