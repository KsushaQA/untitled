package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guinnessworldrecords.com/records/");
        System.out.println("====================");
        System.out.println(driver.getCurrentUrl());
        System.out.println("====================");
        driver.quit();
    }
}
