package homeWork.HW_lesson_4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HW2_LESSON_4 {
    public static void compareElements(WebElement element1, WebElement element2) {
        Point location1 = element1.getLocation();
        Point location2 = element2.getLocation();
        Dimension size1 = element1.getSize();
        Dimension size2 = element2.getSize();
        if (location1.getY() < location2.getY()) {
            System.out.println("Элемент " + element1 + " располагается выше элемента " + element2);
        } else if (location1.getY() > location2.getY()) {
            System.out.println("Элемент " + element2 + " располагается выше элемента " + element1);
        } else {
            System.out.println("Оба элемента находятся на одной вертикальной линии");
        }
        if (location1.getX() < location2.getX()) {
            System.out.println("Элемент " + element1 + " располагается левее элемента " + element2);
        } else if (location1.getX() > location2.getX()) {
            System.out.println("Элемент " + element2 + " располагается левее элемента " + element1);
        } else {
            System.out.println("Оба элемента находятся на одной горизонтальной линии");
        }
        int area1 = size1.getWidth() * size1.getHeight();
        int area2 = size2.getWidth() * size2.getHeight();

        if (area1 > area2) {
            System.out.println("Элемент " + element1 + " занимает большую площадь, чем элемент " + element2);
        } else if (area1 < area2) {
            System.out.println("Элемент " + element2 + " занимает большую площадь, чем элемент " + element1);
        } else {
            System.out.println("Оба элемента занимают одинаковую площадь");
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru");
        WebElement element1 = driver.findElement(By.xpath("//span[text()='Новинки']"));
        WebElement element2 = driver.findElement(By.xpath("//span[text()='Хиты продаж']"));
        HW2_LESSON_4 ElementPosition = null;
        ElementPosition.compareElements(element1, element2);
        driver.quit();
    }
}

