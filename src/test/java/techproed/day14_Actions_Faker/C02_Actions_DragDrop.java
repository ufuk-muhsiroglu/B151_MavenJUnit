package techproed.day14_Actions_Faker;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.utilities.TestBase;

public class C02_Actions_DragDrop extends TestBase {

    @Test
    public void test01() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");
        /*
        drag ve drop webelementleri iframe icinde oldugu icin iframe'e gecis yapmaliyiz
         */

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım

        WebElement drag = driver.findElement(By.xpath("//*[id=\"draggable\"]"));
        WebElement drop = driver.findElement(By.xpath("//*[id=\"droppable\"]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();
        /*
        Eger bir hareketli WebElemet'i tutup baska bir WebElement'in uzerine birakmak istersek
        suruklemek istedigimiz WebElement'in locate'ini alip uzerine birakacagimiz WebElement'in locate'ini de alarak
        dragAndDrop(source,target) method u ile bu islemi gerceklestirebiliriz.
         */

    }

    @Test
    public void test02() {
        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");
        /*
        drag ve drop webelementleri iframe icinde oldugu icin iframe'e gecis yapmaliyiz
         */

        //Drag me to my target webelementini Drop here webelementi üzerine birakalim

        WebElement drag = driver.findElement(By.xpath("//*[id=\"draggable\"]"));
        WebElement drop = driver.findElement(By.xpath("//*[id=\"droppable\"]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).// bu method ile WebElement e mouse ile basili tuttuk
                moveToElement(drop).// basili tuttugumuz webelement i diger webelement uzerine goturduk
                release().// Bu method ile serbest biraktik.
                perform();
    }

    @Test
    public void test03() {
        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
    /*
    drag ve drop webelementleri iframe içinde olduğu için iframe geçiş yapmalıyız
     */
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).
                moveByOffset(165,28).//-->Belirtmiş olduğumuz kordinatlara we'ti taşır
                release().perform();
    }
}
