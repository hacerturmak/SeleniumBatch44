package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMetotlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());//sayfanın title yani basliğini getirir.

        System.out.println( driver.getCurrentUrl());//sayfanın adresini getirir.

        System.out.println(driver.getWindowHandle());//her sayfanın bı numarası var.

        System.out.println(driver.getPageSource());

    }
}
