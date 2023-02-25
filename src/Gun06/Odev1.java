package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector

    @Test
    public void Odev1() {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.Bekle(2);
        WebElement btn = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        btn.click();

        MyFunc.Bekle(2);
        WebElement btn2 = driver.findElement(By.cssSelector("[id$='_4588']"));
        btn2.click();

        MyFunc.Bekle(2);
        WebElement btn3 = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        btn3.click();

        MyFunc.Bekle(2);
        WebElement btn4 = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        btn4.click();

        MyFunc.Bekle(2);
        WebElement btn5 = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        btn5.click();

        WebElement btn6 = driver.findElement(By.cssSelector("select[id$='_4597'"));
        btn6.click();

        WebElement btn7 = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        btn7.click();

        WebElement btn8 = driver.findElement(By.cssSelector("select[id$='_4597']> :nth-child(4)"));
        btn8.click();

        BekleKapat();

    }
}
