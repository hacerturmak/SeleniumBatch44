package day03_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Webelement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement amazonSearch=driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearch.sendKeys("city bike", Keys.ENTER);
        //WebElement sonucYazısıElementi=driver.findElement(By.className("a-color-state a-text-bold"));
        //System.out.println(sonucYazısıElementi.getText());
       // WebElement ilkresim=driver.findElement(By.id("ivLargeImage"+Keys.ENTER));

    }
}
