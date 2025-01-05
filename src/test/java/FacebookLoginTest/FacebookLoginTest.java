package FacebookLoginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookLoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Facebook sayfasına git
        driver.get("https://www.facebook.com/");

        //cookies çıkarsa kabul et butonuna bas
        //Çıkmadı

        //e posta kutusuna rastgele bir mail gir
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("jkfdvnfı@gmail.com");

        //şifre kısmına bir rastgele şifre gir
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456");

        //giriş yap butonuna bas
        driver.findElement(By.xpath("//div[@class='_6ltg']//button")).click();

        //uyarı olarak "Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap." mesajın çıktığını test edin
        WebElement expectedText = driver.findElement(By.className("_9ay7"));
        System.out.println(expectedText.getText());
        String actualText = ("Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap.");
        if (expectedText.getText().equals(actualText)) {
            System.out.println("Test passed.");
        }else {
            System.out.println("Test failed.");
        }
        //sayfayı kapatın
        driver.close();
    }
}
