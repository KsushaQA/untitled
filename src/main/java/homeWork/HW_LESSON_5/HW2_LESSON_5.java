package homeWork.HW_LESSON_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import utils.Waiters;

public class HW2_LESSON_5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(6000);
        Waiters waiters = new Waiters(driver);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        WebElement elementStart = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish = driver.findElement(By.cssSelector("circle[r='8']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementStart).clickAndHold().moveToElement(elementFinish, 0, 30)
                .release().build().perform();
        Thread.sleep(6000);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        WebElement elementStart2 = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish2 = driver.findElement(By.cssSelector("circle[r='8']"));
        actions.moveToElement(elementStart2).clickAndHold().moveToElement(elementFinish2, 0, 0)
                .release().build().perform();
        Thread.sleep(6000);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        WebElement elementStart3 = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish3 = driver.findElement(By.cssSelector("circle[r='8']"));
        actions.moveToElement(elementStart3).clickAndHold().moveToElement(elementFinish3, 0, 0)
                .release().build().perform();
        Thread.sleep(6000);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        WebElement elementStart4 = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish4 = driver.findElement(By.cssSelector("circle[r='8']"));
        actions.moveToElement(elementStart4).clickAndHold().moveToElement(elementFinish4, 0, 0)
                .release().build().perform();
        Thread.sleep(6000);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        WebElement elementStart5 = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish5 = driver.findElement(By.cssSelector("circle[r='8']"));
        actions.moveToElement(elementStart5).clickAndHold().moveToElement(elementFinish5, 0, 0)
                .release().build().perform();
        Thread.sleep(6000);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        WebElement elementStart6 = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish6 = driver.findElement(By.cssSelector("circle[r='8']"));
        actions.moveToElement(elementStart6).clickAndHold().moveToElement(elementFinish6, 0, 0)
                .release().build().perform();
        Thread.sleep(6000);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        WebElement elementStart7 = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish7 = driver.findElement(By.cssSelector("circle[r='8']"));
        actions.moveToElement(elementStart7).clickAndHold().moveToElement(elementFinish7, 30, 0)
                .release().build().perform();
        Thread.sleep(6000);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("textarea")));;
        driver.findElement(By.tagName("textarea")).sendKeys("Задание выполнено!");
    }
}
