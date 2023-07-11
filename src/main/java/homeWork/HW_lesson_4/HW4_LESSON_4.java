package homeWork.HW_lesson_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HW4_LESSON_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Хорек");
        Thread.sleep(8000);
        element.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath
                        ("//a[@href='/ru/vitaminy-beafar-pasta-malt-s-dvoynym-deystviem-dlya-khorkov-100g/']"))
                .click();
        Thread.sleep(4000);
        driver.findElement(By.xpath
                        ("//span[@class='comparison-button__icon']/*/*"))
                .click();
        driver.findElement(By.name("q")).sendKeys("Медведь");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@title='Белый медведь 6х5х6см']")).click();
        driver.findElement(By.xpath("//span[@class='comparison-button__icon']/*/*")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[@class='comparison-view__button-text']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@class='compare-close j-close']/*")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
