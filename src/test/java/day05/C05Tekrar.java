package day05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05Tekrar {
    private static WebDriver driver;

    /* 1-C01_TekrarTesti isimli bir class olusturun
     2- https://www.amazon.com/ adresine gidin
                 3- Browseri tam sayfa yapin
     4-Sayfayi “refresh” yapin
     5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
     6- Gift Cards sekmesine basin
     7- Birthday butonuna basin
     8- Best Seller bolumunden ilk urunu tiklayin
     9- Gift card details’den 25 $’i  secin
     10-Urun ucretinin 25$ oldugunu test edin
     10-Sayfayi kapatin
         */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

        String actualTitle = driver.getTitle();
        String arananKelime = "Spend less";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASS");
        } else {
            System.out.println("Title testi FAİLED");
            System.out.println("sayfa title:" + actualTitle);
        }
        String actualUrl = driver.getCurrentUrl();
        String UrlarananKelime = "amazon";

        if (actualUrl.contains(UrlarananKelime)) {
            System.out.println("Url Testi PASS");
        } else {
            System.out.println("Url Testi FAİLD");
            System.out.println("Sayfa Url:" + actualUrl);
        }
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.manage());

        String actualPaceSource = driver.getPageSource();
        String arananKelimePacesource = "alisveris";

        if (actualPaceSource.contains(arananKelimePacesource)) {
            System.out.println("PaceSource Testi PASS");
        } else {
            System.out.println("PaceSource Testi FAİLED");
            System.out.println("ActuelPaceSource:" + actualPaceSource);

        }



    }




    }

