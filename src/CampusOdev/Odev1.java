package CampusOdev;
import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {

    @Test
    public void Odev1(){



        driver.get("http://demoqa.com/text-box");

        String mesajim="Automation";
        WebElement fulN = driver.findElement(By.cssSelector("[class^='col']>[id='userName']"));
        fulN.sendKeys(mesajim);

        String mesajim2="Testing@gmail.com";
        WebElement eMail = driver.findElement(By.cssSelector("[class^='col']>[id='userEmail']"));
        eMail.sendKeys(mesajim2);

        WebElement currA = driver.findElement(By.cssSelector("[class^='col']>[id='currentAddress']"));
        currA.sendKeys("Testing Current Address");

        WebElement permA = driver.findElement(By.cssSelector("[class^='col']>[id='permanentAddress']"));
        permA.sendKeys("Testing Permanent Address");

        MyFunc.Bekle(2);

        WebElement submit = driver.findElement(By.cssSelector("[class*='text']>[id='submit']"));
        submit.click();

        MyFunc.Bekle(2);

        Assert.assertTrue(fulN.getAttribute("value").equals(mesajim));
        Assert.assertTrue(eMail.getAttribute("value").equals(mesajim2));


        BekleKapat();
    }
}
