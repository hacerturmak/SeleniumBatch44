package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Getmethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");



        String actualTitle= driver.getTitle();
        String aranilanKelime ="Amazon";
        if(actualTitle.contains(aranilanKelime))
            System.out.println("Title Testi PASS");
        else{
            System.out.println("Title Testi FAİLED");
            System.out.println("sayfanin Title i:"+actualTitle);
        }




    }
}
