package homeWork.HW_LESSON_6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;


public class HW_LESSON_6 {
    private static class Url {
        private static final String records =
                "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit";
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");
        WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("https://www.guinnessworldrecords.com/account/register?");
        element.sendKeys(Keys.ENTER);
        Set<String> windowHandles1 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHandles2 = driver.getWindowHandles();
        windowHandles2.removeAll(windowHandles1);
        String newDescriptor = windowHandles2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get("https://www.guinnessworldrecords.com/account/register?");
        driver.switchTo().window(windowHandles1.iterator().next());
        driver.findElement(By.id("APjFqb"));
        driver.findElement(By.xpath("//div[@class='M2vV3 vOY7J']")).click();
        Set<String> windowHandles3 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHandles4 = driver.getWindowHandles();
        windowHandles4.removeAll(windowHandles3);
        String newDescriptor2 = windowHandles4.iterator().next();
        driver.switchTo().window(newDescriptor2);
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.switchTo().window(windowHandles1.iterator().next());
        driver.get(Url.records);
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Oksana");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Voronec");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());

    }
}
