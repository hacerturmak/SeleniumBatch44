package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_NavigationMetods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        System.out.println(driver.manage().window().getPosition().x);
        System.out.println(driver.manage().window().getSize().height);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("maximize durumunda pozisyon:" + driver.manage().window().getPosition().x);
        System.out.println("maximize durumunda boyutlar:" + driver.manage().window().getSize().height);
        driver.manage().window().fullscreen();
        System.out.println("fullscreen durumunda pozisyon:" + driver.manage().window().getPosition());
        System.out.println("fullscreen durumunda boyutlar:" + driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(10, 69));
        driver.manage().window().setSize(new Dimension(200, 400));
        int xKordinati = driver.manage().window().getPosition().x;
        int yKordinati = driver.manage().window().getPosition().y;
        int genislik = driver.manage().window().getSize().width;
        int yukseklik = driver.manage().window().getSize().height;
        Thread.sleep(4000);
        if (xKordinati == 10 && yKordinati == 69 && genislik == 200 && yukseklik == 400) {
            System.out.println("olceklendirme testi PASS");
        } else {
            System.out.println("olceklendirma testi FAİLED");
        }
        driver.quit();


    }
}
