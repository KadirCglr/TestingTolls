package Gun06;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class _01_CssSelector_2 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="biz testerlar geliyoruz";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

//        if (msg.getText().equals("biz testerlar geliyoruz"))
//            System.out.println("test passed");
//        else
//            System.out.println("test fail");

        Assert.assertTrue("aranılan mesaj bulunamadi", msg.getText().equals(mesajim));   // verilen değer TRUE mu kontrol et
        // Hata yok ise yani içindeki değer TRUE ise hiç bilgi vermez.

        BekleKapat();
    }
}
