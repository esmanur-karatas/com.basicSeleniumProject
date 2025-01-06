# FacebookLoginTest - Selenium WebDriver Testi

Bu proje, Selenium WebDriver kullanarak Facebook giriş sayfasına gidip, geçersiz bir kullanıcı adı ve şifre ile giriş yapmayı ve beklenen hata mesajını kontrol etmeyi amaçlamaktadır. 

## 📚 Proje İçeriği

### **Test Senaryosu**
- **URL**: [https://www.facebook.com/](https://www.facebook.com/)
- Facebook giriş sayfasına gidilir.
- Geçersiz bir e-posta ve şifre girilir.
  - **E-posta**: jkfdvnfı@gmail.com
  - **Şifre**: 123456
- Giriş butonuna tıklanır.
- Facebook tarafından döndürülen hata mesajı kontrol edilir.
  - **Beklenen Mesaj**: "Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap."
- Test sonucu, hata mesajının doğruluğu kontrol edilerek konsola yazdırılır.

### **Adımlar**:
1. **WebDriver Başlatma**: Chrome tarayıcısı açılır ve gerekli ayarlar yapılır.
2. **Facebook Sayfasına Gitme**: Facebook giriş sayfası açılır.
3. **E-posta ve Şifre Girişi**: Geçersiz bir e-posta adresi ve şifre girilir.
4. **Giriş Yapma**: Giriş yap butonuna tıklanır.
5. **Hata Mesajını Doğrulama**: Ekranda çıkan hata mesajının beklenen mesajla karşılaştırılması yapılır.
6. **Sonuçları Konsola Yazdırma**: Eğer mesaj doğruysa, "Test passed." yazdırılır, aksi takdirde "Test failed." yazdırılır.
7. **Tarayıcıyı Kapatma**: Test tamamlandıktan sonra tarayıcı kapatılır.

### **Test Sonucu**:
Testin başarılı olması için Facebook'un hata mesajının doğru şekilde döndürülmesi gerekmektedir.

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
4. Testi başlatmak için **FacebookLoginTest** sınıfını çalıştırın.

---

## 📄 Kaynaklar

- [Selenium WebDriver Dokümantasyonu](https://www.selenium.dev/documentation/)
- [Java API Dokümantasyonu](https://docs.oracle.com/javase/8/docs/api/)
- [Facebook](https://www.facebook.com/)
