package homeWork.HW_LESSON_5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1_LESSON_5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        Select Box = new Select(driver.findElement(By.id("Carlist")));
        Box.selectByVisibleText("Renault");
        Actions actions = new Actions(driver);
        //WebElement firstCountry = driver.findElement(By.xpath("//select/*[text()='Russia']"));
        WebElement firstCountry = driver.findElements(By.tagName("option")).get(9);
        actions.keyDown(Keys.CONTROL).click(firstCountry)
                .click(driver.findElement(By.xpath("//select/*[text()='Germany']")))
                .click(driver.findElement(By.xpath("//select/*[text()='Italy']")))
                .click(driver.findElement(By.xpath("//select/*[text()='Spain']")))
                .keyUp(Keys.CONTROL).perform();
        driver.findElement(By.xpath
                ("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();
        WebElement carList = driver.findElement(By.id("Carlist"));
        String availableCars = carList.getText();
        System.out.println("Автомобили доступные для выбора:\n" + availableCars);

        List<WebElement> firstTableCountries = driver.findElements
                (By.name("FromLB"));
        System.out.println("Страны из первой таблицы:");
        for (WebElement country : firstTableCountries) {
            System.out.println(country.getText());
        }

        List<WebElement> secondTableCountries = driver.findElements
                (By.name("ToLB"));
        System.out.println("Страны из второй таблицы:");
        for (WebElement country : secondTableCountries) {
            System.out.println(country.getText());
        }
    }
}


