package day03_webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class C01_tekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().to("https://youtube.com");
        String actualTitile= driver.getTitle();
        String arananKelime="youtube";
        if (actualTitile.equals(arananKelime))
            System.out.println("test verify ");
        else
            System.out.println("testte youtube yok guncel title:"+actualTitile);

        String actualUrlYoutube=driver.getCurrentUrl();
        String arananUrl="youtube";
        if (actualUrlYoutube.contains(arananUrl))
            System.out.println("test PASS");
        else
            System.out.println("test FAİLED.actualUrl:"+actualUrlYoutube);
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.manage().window().maximize();

    String actualTitleamazon=driver.getTitle();
    String arananKelimeamazon="Amazon";
    if (actualTitleamazon.contains(arananKelimeamazon))
        System.out.println("Test PASS");
    else
        System.out.println("Test FAİLED.ActualTitle:"+actualTitleamazon.toLowerCase(Locale.ROOT));
    String actualUrlamazon= driver.getCurrentUrl();
    String arananUrlamazon="https://www.amazon.com";
    if (actualUrlamazon.equals(arananUrlamazon))
        System.out.println("Test PASS");
    else
        System.out.println("Test FAİLED...ActualUrl:"+actualUrlamazon);
    driver.quit();






    }
}
