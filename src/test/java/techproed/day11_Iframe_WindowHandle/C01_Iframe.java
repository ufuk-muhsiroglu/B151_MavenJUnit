package techproed.day11_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techproed.utilities.TestBase;

public class C01_Iframe extends TestBase {
    
    /*
    Bir HTML dokumaninin icine yerlestirilmis baska bir HTML dokumanina inline frame yani IFRAME denir.
    Bir sayfada IFRAME varsa iframe icindeki webelemente handle edebilmek icin switchTo() method u ile iframe'e
    gecis yapmamiz gerekir. Eger gecis yapmazsak nosuchelementexception aliriz.
        Alert'ten farki alert cıktıgında hicbir webelementi locate edemeyiz. Iframe olsa da locate ederiz 
    fakat handlem edemeyiz
     */

    @Test
    public void iframe() {

        //➢ https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //➢ Ana sayfadaki 'An iframe with a thin black border:' metninde 'black border' yazisinin   oldugunu test edelim

        String text = driver.findElement(By.xpath("(//p)[1]")).getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("black border"));
        //➢ Ayrica 'Applications lists' yazisinin sayfada oldugunu test edelim
        driver.switchTo().frame(0);//--> gecis yapmazsak Nosuchelementexception hatasi aliriz.
        String applicationListText = driver.findElement(By.xpath("//h1")).getText();
        System.out.println(applicationListText);
        Assert.assertEquals("Applications lists",applicationListText);

        //➢ Son olarak ana sayfadaki  'iframe' yazisini varligini test ediniz.
        driver.switchTo().defaultContent();
        //driver.get(driver.getCurrentUrl());--> sayfayi yeniledik
        //driver.navigate().refresh();
        WebElement iframeYazisi = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(iframeYazisi.isDisplayed());
        /*
            Eğer iki tane iframe olsaydı ve 2. frame'e geçmek isteseydik index'i 1 almam gerekicekti
        <body>
	            <iframe id="outerIframe" src="https://www.w3schools.com"> --> driver.switchTo().frame("outerIframe")
		            <iframe id="innerIframe" src="https://www.google.com"></iframe> --> bu örnekte parentFrame ile bir üst frame geçiş yapabiliriz
	            </iframe>
            </body>

          İstersek WebElement frame = driver.findElement(By.xpath("//*[@id='outerIframe'")) bu şekilde locate ettiğimiz
        iframe'e driver.switchTo().frame(frame) geçiş yapabiliriz.
         */


    }
}
