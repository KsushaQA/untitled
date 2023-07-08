package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_LESSON_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /* HW 1.1
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.className("userbar__button-text"));
        element.click();
        Thread.sleep(4000);
        driver.quit();*/

        /* HW 1.2
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        driver.findElement(By.linkText("Вход")).click();
        Thread.sleep(4000);
        driver.quit();*/

        /* HW 1.3
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='userbar__button-text']")).click();
        Thread.sleep(4000);
        driver.quit();*/

        /* HW 1.4
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Вход']")).click();
        Thread.sleep(4000);
        driver.quit();*/

        /* HW 2
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(4000);
        driver.findElement(By.xpath
                ("//div[@class='footer__heading']/..//child::a")).click();
        Thread.sleep(4000);
        driver.quit();*/

        /* HW 3
        driver.get("https://dan-it.com.ua/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Українська']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='banner__btns']/a")).click();
        Thread.sleep(4000);
        driver.quit();*/

        /* HW 4
        driver.get("https://uhomki.com.ua/koshki/1074/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Рыбы")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Аквариумы")).click();
        Thread.sleep(2000);
        driver.quit();*/

        /*//HW 5
        driver.get("https://dan-it.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Українська']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement
                (By.xpath("//a[@class='page-header__phone']")).getText());
        Thread.sleep(2000);
        driver.quit();*/

       /* //HW 6
        driver.get("https://dan-it.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Українська']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement
                (By.xpath("//li[@class='banner-meta__item banner-meta__item--main banner-meta__item--main--offline']")).getText());
        Thread.sleep(2000);
        driver.quit();*/

        /*//HW 7
        driver.get("https://www.w3schools.com/");
        WebElement element1 = driver.findElement(By.id("myLearningFromDefault"));
        Thread.sleep(2000);
        element1.click();
        WebElement element2 = driver.findElement(By.id("search2"));
        Thread.sleep(2000);
        element2.sendKeys("Hello");
        WebElement element3 = driver.findElement(By.id("search2"));
        Thread.sleep(2000);
        element3.clear();
        driver.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
        driver.findElement(By.id("gsc-i-id1")).sendKeys("Text");
        Thread.sleep(4000);
        WebElement element4 = driver.findElement(By.id("navbtn_exercises"));
        Thread.sleep(2000);
        element4.click();
        WebElement element5 = driver.findElement(By.id("proFromDefault"));
        Thread.sleep(2000);
        element5.click();
        driver.quit();*/

        /*//HW 8
        driver.get("https://dan-it.com.ua/");
        driver.findElement(By.xpath("//a[text()='Українська']")).click();
        Thread.sleep(2000);
        WebElement itCenterElement = driver.findElement
                (By.xpath("//p[contains(text(), 'центр з підготовки')]"));
        System.out.println(driver.findElement
                (By.xpath("//li[@class='main-expertise__point'][3]/b")).getText());
        driver.quit();*/

        //HW 9
        /*driver.get("https://www.jetbrains.com/idea/");
        driver.findElement(By.xpath("//a[@class='wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary']")).click();
        Thread.sleep(2000);
        driver.quit();*/

        //HW 10
        /*driver.get("https://www.jetbrains.com/idea/download/?section=windows#section=windows");
        System.out.println(driver.findElement(By.xpath("//span[@class='_wtDownloadButton_y7414']/a")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='wt-col-inline jb-text-center']/span/a")).getText());
        System.out.println();
        Thread.sleep(2000);
        driver.quit();*/
    }
}

