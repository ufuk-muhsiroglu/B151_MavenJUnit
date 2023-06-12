package techproed.day10_TestBase_Alert;

import org.junit.Assert;
import org.junit.Test;
import techproed.utilities.TestBase;

public class C01_TestBaseDemo extends TestBase {
    @Test
    public void test01() {
        //Techproeducation sayfasına gidelim

        driver.get("https://techproeducation.com");

        bekle(3);

        // Basligin Bootcamp icerdigini test edelim

        String actualTitle = driver.getTitle();
        String expectedTitle = "Bootcamp";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        /*//Bir butona tiklayip yeni acilan pencereye sag klik ile mudehale edebiliyorsak buna "HTML Alerts" denir
        //Bir butona tiklayip yeni acilan pencereye sag klik ile mudehale edemiyorsak buna "Js Alert" denir.
        Burda mudehale edebilmemiz icin Alert'i driver.switch() ile degistirmemiz gerekir
         */

    }
}
