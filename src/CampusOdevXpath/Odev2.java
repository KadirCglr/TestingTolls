package CampusOdevXpath;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Odev2 extends BaseDriver {

    @Test
    public void Odev2 () {

        driver.get("https://demo.applitools.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);


        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(2);


        WebElement signIn = driver.findElement(By.xpath("//a[@id='log-in']"));
        signIn.click();
        MyFunc.Bekle(2);


        WebElement dogrulama = driver.findElement(By.xpath("//h6[@id='time']"));
        Assert.assertTrue(dogrulama.getText().contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();

    }
}
