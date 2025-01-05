package BestbuyButtonTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BestbuyButtonTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //bestbuy sayfasına gidin
        driver.get("https://www.bestbuy.com/");

        //cookies çıkarsa kabul edin
        //Çıkmadı

        //sayfada kaç adet button bulunduğunu yazdırın
        List<WebElement> button = driver.findElements(By.tagName("button"));
        System.out.println("Toplam Buton Sayısı: " + button.size());

        //sayfadaki her buttonun üzerindeki yazıları yazdırın.
        for(WebElement each : button){
            System.out.println(each.getText());
        }
        driver.close();

    }

}

