# AmazonSearchboxProject - Selenium WebDriver Testi

Bu proje, Selenium WebDriver kullanarak **Amazon** web sitesinde arama çubuğuna "Nutella" yazıp arama yaptıktan sonra bulunan sonuçları konsola yazdırmayı amaçlamaktadır.

## 📚 Proje İçeriği

### **Test Senaryosu**
- **URL**: [https://www.amazon.com.tr/](https://www.amazon.com.tr/)
- **Sayfaya Gitme**: Amazon Türkiye ana sayfası açılır.
- **Arama Yapma**: Arama çubuğuna "Nutella" yazılır ve Enter tuşuna basarak arama işlemi yapılır.
- **Sonuçları Yazdırma**: Arama sonuçları sayfasında bulunan ilk iki sonuç metni konsola yazdırılır.
- **Tarayıcıyı Kapatma**: Test tamamlandıktan sonra tarayıcı kapatılır.

### **Adımlar**:
1. **WebDriver Başlatma**: Chrome tarayıcısı açılır ve gerekli ayarlar yapılır.
2. **Amazon Sayfasına Gitme**: Amazon Türkiye web sitesi açılır.
3. **Arama Çubuğuna Metin Yazma**: "Nutella" araması yapılır ve Enter tuşuna basılır.
4. **Sonuçları Yazdırma**: Arama sonuçlarında ilk iki metin konsola yazdırılır.
5. **Tarayıcıyı Kapatma**: Test tamamlandıktan sonra tarayıcı kapatılır.

### **Test Sonucu**:
- Arama çubuğuna "Nutella" yazılır ve Enter tuşuna basılarak arama yapılır.
- Arama sonuçları sayfasındaki ilk iki sonucu konsola yazdırılır.

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
4. Testi başlatmak için **AmazonSearchboxProject** sınıfını çalıştırın.

---

## 📄 Kaynaklar

- [Selenium WebDriver Dokümantasyonu](https://www.selenium.dev/documentation/)
- [Java API Dokümantasyonu](https://docs.oracle.com/javase/8/docs/api/)
- [Amazon Türkiye](https://www.amazon.com.tr/)
