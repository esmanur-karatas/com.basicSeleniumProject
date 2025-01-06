# BestbuyButtonTest - Selenium WebDriver Testi

Bu proje, Selenium WebDriver kullanarak **BestBuy** web sitesinde bulunan tüm butonları saymayı ve her birinin üzerindeki metinleri yazdırmayı amaçlamaktadır.

## 📚 Proje İçeriği

### **Test Senaryosu**
- **URL**: [https://www.bestbuy.com/](https://www.bestbuy.com/)
- **Sayfaya Gitme**: BestBuy ana sayfası açılır.
- **Butonları Sayma**: Sayfadaki tüm `button` etiketleri bulunur ve butonların toplam sayısı konsola yazdırılır.
- **Buton Metinlerini Yazdırma**: Sayfadaki her butonun üzerindeki metin konsola yazdırılır.

### **Adımlar**:
1. **WebDriver Başlatma**: Chrome tarayıcısı açılır ve gerekli ayarlar yapılır.
2. **BestBuy Sayfasına Gitme**: BestBuy web sitesi açılır.
3. **Butonları Sayma**: Sayfadaki tüm butonlar bulunur ve buton sayısı konsola yazdırılır.
4. **Buton Metinlerini Yazdırma**: Sayfadaki her butonun üzerine yazılmış olan metinler, konsola yazdırılır.
5. **Tarayıcıyı Kapatma**: Test tamamlandıktan sonra tarayıcı kapatılır.

### **Test Sonucu**:
- Sayfadaki toplam buton sayısı konsola yazdırılır.
- Her butonun metni konsola yazdırılır.

---

## 🛠️ Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web uygulamaları için otomasyon sağlar.
- **WebDriverManager**: ChromeDriver'ı otomatik olarak yönetir.
- **Java**: Programlama dili olarak Java kullanılmıştır.
- **ChromeDriver**: Google Chrome ile etkileşim için kullanılır.

---

## 🚀 Projeyi Çalıştırma

1. **Projeyi** bilgisayarınıza klonlayın veya indirin.
2. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **WebDriverManager** kullanılarak gerekli sürücüler otomatik olarak ayarlanacaktır, bu yüzden manuel olarak ChromeDriver'ı indirmenize gerek yoktur.
4. Testi başlatmak için **BestbuyButtonTest** sınıfını çalıştırın.

---

## 📄 Kaynaklar

- [Selenium WebDriver Dokümantasyonu](https://www.selenium.dev/documentation/)
- [Java API Dokümantasyonu](https://docs.oracle.com/javase/8/docs/api/)
- [BestBuy](https://www.bestbuy.com/)
