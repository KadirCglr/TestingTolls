package CampusOdevXpath;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Odev3 extends BaseDriver {

    @Test
    public void Odev3 () {

        driver.get("https://www.snapdeal.com/");

        WebElement teddyBear = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        teddyBear.sendKeys("teddy bear");
        MyFunc.Bekle(2);


        WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        search.click();
        MyFunc.Bekle(3);


        WebElement dogrula = driver.findElement(By.xpath("//div[@id='searchMessageContainer']/div/span"));
        Assert.assertTrue(dogrula.getText().contains("We've got"));
        MyFunc.Bekle(3);

        BekleKapat();


    }
}
