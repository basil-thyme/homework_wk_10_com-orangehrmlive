package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            // Setup chrome browser
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            // Setup FireFox browser
            driver = new FirefoxDriver();
            // Setup Edge browser
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        //2. Open URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Maximise the browser
        driver.manage().window().maximize();

        // 3. Print the title of the page
        System.out.println("Title of the page: " +driver.getTitle());

        // 4. Print the current url
        System.out.println("Current url: " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("XYZ@Gmail.com");

        // 7. Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("ABCD1234");

        // 8. Close the browser
        //driver.close();

    }

}
