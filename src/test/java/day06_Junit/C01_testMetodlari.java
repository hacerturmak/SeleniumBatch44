package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_testMetodlari {
    static WebDriver driver;

    @BeforeClass
   public static  void setup () {
        WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();

   }
    @Test
  public void test02() {
driver.get("https://www.bestbuy.com/");
   String actualURL= driver.getCurrentUrl();
   String expectedURL="https://www.bestbuy.com/";

   Assert.assertEquals("lutfen degerlerı gozden gecirin",expectedURL,actualURL);


  }
    @Before
    public void ayarlariDuzenle(){
        System.out.println("before ıle ayar calıstı before her test metodundan once calısır");



    }


}
