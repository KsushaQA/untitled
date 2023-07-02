package homeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*1.1
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.className("userbar__button-text"));
        element.click();
        Thread.sleep(4000);
        driver.quit();*/

        /*1.2
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        driver.findElement(By.linkText("Вход")).click();
        Thread.sleep(4000);
        driver.quit();*/

        /*1.3
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='userbar__button-text']")).click();
        Thread.sleep(4000);
        driver.quit();*/

        /*1.4
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Вход']")).click();
        Thread.sleep(4000);
        driver.quit();*/

        System.out.println();
}
}
