package homeWork.HW_LESSON_6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
        Thread.sleep(6000);
        System.out.println(driver.findElement
                (By.cssSelector(".w3-panel.w3-pale-yellow.w3-leftbar.w3-border-yellow")).getText());
        Set<String> windowHandles = driver.getWindowHandles();
        String currentWindow = driver.getWindowHandle();
        String newWindow = "https://www.guinnessworldrecords.com/account/register?";
        for (String window : windowHandles) {
            if (!window.equals(currentWindow)) {
                newWindow = window;
                break;
            }
        }
        driver.switchTo().window(newWindow);
        driver.findElement(By.id("LastName")).sendKeys("Voronec");
        driver.findElement(By.id("FirstName")).sendKeys("Oksana");
        driver.findElement(By.id("DateOfBirthDay")).sendKeys("10");
        driver.findElement(By.id("DateOfBirthMonth")).sendKeys("12");
        driver.findElement(By.id("DateOfBirthYear")).sendKeys("1999");
        Select country = new Select(driver.findElement(By.id("Country")));
        country.selectByVisibleText("Ukraine");
        Thread.sleep(6000);
        driver.findElement(By.id("State")).sendKeys("Dnipro");
        driver.findElement(By.id("EmailAddress")).sendKeys("OKv.@gmail.com");
        driver.findElement(By.id("ConfirmEmailAddress")).sendKeys("OKv.@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("12345678");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345679");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345679");
        //section[@class='form-section form-half']
        driver.findElement(By.xpath("//section[@class='form-section form-half']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement
                (By.xpath("//span[@data-valmsg-for='ConfirmPassword']")).getText());
    }
}
