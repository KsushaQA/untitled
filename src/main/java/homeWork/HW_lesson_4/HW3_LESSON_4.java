package homeWork.HW_lesson_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HW3_LESSON_4 {
    public static void printElementInfo(WebDriver driver, WebElement element) {
        String id = element.getAttribute("id");
        String tag = element.getTagName();
        String className = element.getAttribute("class");
        String name = element.getAttribute("name");
        String text = element.getText();
        Point center = element.getLocation();
        int centerX = center.getX() + element.getSize().getWidth() / 2;
        int centerY = center.getY() + element.getSize().getHeight() / 2;

        System.out.println("Element ID: " + id);
        System.out.println("Tag: " + tag);
        System.out.println("Class: " + className);
        System.out.println("Name: " + name);
        System.out.println("Text: " + text);
        System.out.println("Center coordinates: (" + centerX + ", " + centerY + ")");
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru");
        WebElement element = driver.findElement(By.name("q"));
        printElementInfo(driver, element);
        driver.quit();
    }
}
