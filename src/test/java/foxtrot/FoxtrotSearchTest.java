package foxtrot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FoxtrotSearchTest {
    private WebDriver driver;
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name ="searchWords")
    public Object[][] searchWordsProvider() {
        return new Object[][] {
                {"машина"},
                {"input"},
                {"смысл"}
        };
    }
    @Test(dataProvider = "searchWords")
    public void testSearchResults(String searchWord) {
        driver.get("https://www.foxtrot.com.ua/");
        WebElement town = driver.findElement(By.xpath("//li[@data-id='38056']/*"));
        WebElement searchInput = driver.findElement(By.xpath("//input[@type='search']"));
        searchInput.sendKeys(searchWord);
        searchInput.sendKeys(Keys.ENTER);
        WebElement searchResultElement = driver.findElement(By.xpath("//div[@class='page__title']"));
        String searchResultText = searchResultElement.getText();

        if (searchResultText.contains("По запиту 'searchWords' нічого не знайдено")) {
            Assert.assertFalse(searchResultText.contains("Знайдено по запиту 'searchWords'"));
            Assert.assertTrue(searchResultText.contains(searchWord));
        } else {
            Assert.assertFalse(searchResultText.contains("Знайдено по запиту searchWords' \""
                    + searchWord + "\""));
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}






