package CampusOdev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev3 extends BaseDriver {


    @Test
    public void Odev3 () {


        driver.get("https://www.snapdeal.com");

        WebElement teddyBear = driver.findElement(By.cssSelector("[name='keyword'][class*='searchformInput']"));
        teddyBear.sendKeys("teddy bear");

        MyFunc.Bekle(2);
        WebElement search = driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        search.click();

        MyFunc.Bekle(2);

        WebElement dogrula = driver.findElement(By.cssSelector("span[style^='color:'][class='nnn']"));
        Assert.assertTrue(dogrula.getText().contains("We've got results for 'teddy bear"));

        BekleKapat();






    }
}
