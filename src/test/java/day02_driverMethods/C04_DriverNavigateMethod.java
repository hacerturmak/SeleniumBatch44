package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethod {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");//driver.get =navigate.to ayniislemi yapar.daha HIZLIDIR,
        driver.navigate().to("https://www.techproeducation");

        //NAVIGATE.TO SAYFALAR ARASI GECISIMIZI SAGLAR...

        driver.navigate().back();//geldiği yere doner.
        driver.navigate().forward();//İLERİ GİDER forward ve back ileri geri gider.
        driver.navigate().refresh();// sayfayı yeniler.
    }
}
