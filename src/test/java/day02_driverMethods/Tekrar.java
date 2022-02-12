package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar {
    //normalde seleniumun kemdı ide si var fakat bız daha kullanıslı old. icin intelije kullanıyorz
    //intellijde yeni proje actıgımızda oncelıkle selenyum kutuphanelerını projeye eklememmiz gerekir.
    //biz en ilkel halıyle projemıze kutuphanelerı jar dosyaları olarak yukledık
    //bu ekledıgımız dosyalarla artık driver ın ayarlarını yapabılırız.
    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
      //setProperty methodu 2 parametre ister.bu metod javadan calısır.
      //ilki kullanacagımz  browsera ait driver
      //ikinci  parametre ise cromedrıverın yolu path

        WebDriver driver=new ChromeDriver();
        driver.get("https//www.amazon.com");

        Thread.sleep(3000);
        //javadan gelir ve icine yazılan milisanıye kadar kodların calısmasını durdurur.

        driver.close();
        //bu kod driverimizi kapatır.sonra yenı bır browser acmak istiyorsak drivera yenı deger atamalıyız.
        driver=new ChromeDriver();






    }



}
