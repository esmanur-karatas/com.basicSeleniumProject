package AmazonSearchboxProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class AmazonSearchboxProject {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına git
        driver.get("https://www.amazon.com.tr/");

        //Arama çubuğuna "Nutella" yazdırın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
        //Nutella yazdıktan sonra Entera basarak arama işlemini yapın

        //Bulunan sonuç metnini yazdırın
        WebElement resultText = driver.findElement(By.xpath("(//h2//span)[1]"));
        WebElement result = driver.findElement(By.xpath("(//h2//span)[3]"));
        System.out.println("Arama Sonucu: " + resultText.getText() + result.getText());


        //tarayıcıyı kapatın
        driver.close();
    }
}
