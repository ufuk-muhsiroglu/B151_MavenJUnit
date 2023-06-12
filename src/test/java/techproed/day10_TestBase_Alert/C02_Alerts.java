package techproed.day10_TestBase_Alert;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import techproed.utilities.TestBase;

public class C02_Alerts extends TestBase {
        /*
            Eğer bir sayfadaki bir buttona tıkladığımızda bir uyarı penceresi çıkıyorsa ve bu çıkan pencereye sağ klik
         yapıp locate alamıyorsak, bu bir js Alert'tür.
            js Alert'ü handle edebilmek için driver'ımızı o pencere geçirmemiz gerekir. Bunun için;
         driver objemizi kullanarak switchTo() methoduyla alert() methodunu kullanarak js alert'e geçiş yapmış oluruz
         accept() yada dismiss() methodlarıyla js Alert'ü onaylar yada iptal ederek kapatırız.
         */

    @Test //--> Çalışmasını istemediğimiz test notasyonundan sonra (@Test) @Ignore notasyonu kullanırız
    public void acceptAlert() {
        //https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        //Bir metod olusturun: acceptAlert
        //1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının “You successfully clicked an alert” oldugunu test edin.

        driver.findElement(By.xpath("(//button)[1]")).click();
        driver.switchTo().// gecmek icin kullanilan method
                alert().// alert'e gecis yapar
                accept(); // cikan alert'te ok ya da tamam butonuna tıklar
        bekle(2);
        WebElement resultMessage = driver.findElement(By.xpath("(//p)[2]"));
        String expectedMessage = "You successfully clicked an alert";
        Assert.assertEquals(expectedMessage,resultMessage.getText());


    }
    @Test
    public void dismissAlert() {
        //https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //Bir metod olusturun: dismissAlert
        //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        driver.findElement(By.xpath("(//button)[2]")).click();
        bekle(3);
        driver.switchTo().
                alert().
                dismiss();// Js alert'teki iptal butonuna basar
        WebElement resultMessage = driver.findElement(By.xpath("(//p)[2]"));
        String expectedMessage = "successfully";
        Assert.assertFalse(resultMessage.getText().contains(expectedMessage));
        bekle(2);



        //“successfuly” icermedigini test edin.
    }
    @Test
    public void sendKeysAlert() {
        //https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //Bir metod olusturun: sendKeysAlert
        //3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
        driver.findElement(By.xpath("(//button)[3]")).click();
        bekle(3);
        driver.switchTo().alert().sendKeys("Ufuk");
        driver.switchTo().alert().accept();


        //tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        WebElement resultMessage = driver.findElement(By.xpath("(//p)[2]"));
        String expectedMessage = "Ufuk";
        Assert.assertTrue(resultMessage.getText().contains(expectedMessage));


    }
}