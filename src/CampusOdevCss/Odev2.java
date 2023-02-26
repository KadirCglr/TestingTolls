package CampusOdevCss;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev2 extends BaseDriver {

    @Test
    public void Odev2 () {

        driver.get("https://demo.applitools.com");

        String mesajim="ttechno@gmail.com";
        WebElement username = driver.findElement(By.cssSelector("[placeholder='Enter your username'][type='text']"));
        username.sendKeys(mesajim);


        MyFunc.Bekle(2);
        String mesajim2="techno123.";
        WebElement password = driver.findElement(By.cssSelector("[placeholder='Enter your password'][type='password']"));
        password.sendKeys(mesajim2);


        MyFunc.Bekle(2);
        WebElement sign = driver.findElement(By.cssSelector("div[class='buttons-w']>[id='log-in'][class='btn btn-primary']"));
        sign.click();

        MyFunc.Bekle(2);
        WebElement branch = driver.findElement(By.cssSelector("[id='time'][style$='x-large;color:red']"));
        Assert.assertTrue(branch.getText().contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();


    }
}
