package CampusOdevXpath;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Odev1 extends BaseDriver {

    @Test
    public void Odev1 () {

        driver.get("http://demoqa.com/text-box");

        String mesajim="Automation";
        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName'][@placeholder='Full Name']"));
        fullName.sendKeys(mesajim);
        MyFunc.Bekle(2);

        String mesajim1="Testing";
        WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail'][@placeholder='name@example.com']"));
        Email.sendKeys(mesajim1);
        MyFunc.Bekle(2);


        WebElement CurrentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        CurrentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);


        WebElement PermanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        PermanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);


        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit'][@type='button']"));
        Submit.click();
        MyFunc.Bekle(2);

        org.junit.Assert.assertTrue(fullName.getAttribute("value").equals(mesajim));
        Assert.assertTrue(Email.getAttribute("value").equals(mesajim1));




        BekleKapat();


    }
}
