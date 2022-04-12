package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current url = " + driver.getCurrentUrl());
        System.out.println("Page source = " + driver.getPageSource());
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("abcxyz@gmail.com");
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("123456");
        driver.close();

    }
}
