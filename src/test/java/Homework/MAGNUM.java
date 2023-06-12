package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MAGNUM {
    //BeforeClass methodu ile driver ı olusturun ve Maximize edin, 15 sn bekletin
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    //Before methodunda http://www.google.com adresine gidin
    @Before
    public void setUp() throws Exception {
        driver.get("https://www.magnumicecream.com/tr/magnum-porsche-taycan-kampanyasi.html");

    }

    //arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
    @Test
    public void test() {
        //onetrust-accept-btn-handler
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.xpath("//*[@id='magnumcode']")).sendKeys("HV33JLHN");
        driver.findElement(By.xpath("//*[@id='mobileno']")).sendKeys("5059437822");
        driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("UFUK");
        driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("MUHSİROĞLU");
        driver.findElement(By.xpath("//*[@id='address']")).sendKeys("YUKARI DUDULLU MAH. KIBRIS CD. YUSUF SK. NO:20 KAT:2 DAİRE:3 ÜMRANİYE");
        driver.findElement(By.xpath("//*[@class=\"filter-option-inner-inner\"]")).click();
        driver.findElement(By.xpath("//*[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-hover']")).click();
        driver.findElement(By.xpath("(//button[@class id='send])")).click();

    }


    }

