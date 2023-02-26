package CampusOdevCss;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev4 extends BaseDriver {

    @Test
    public void Odev4 () {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate = driver.findElement(By.cssSelector("[id='calculate'][href^='/calculate.php']"));
        calculate.click();

        MyFunc.Bekle(2);
        WebElement input1 = driver.findElement(By.cssSelector("input[type='text'][id='number1']"));
        input1.sendKeys("7");


        MyFunc.Bekle(2);
        WebElement input2 = driver.findElement(By.cssSelector("input[type='text'][id='number2']"));
        input2.sendKeys("3");


        MyFunc.Bekle(2);
        WebElement calculate2 = driver.findElement(By.cssSelector("input[type='submit'][id='calculate']"));
        calculate2.click();

        MyFunc.Bekle(2);
        WebElement answer = driver.findElement(By.cssSelector("span[id='answer']"));


        BekleKapat();


    }
}
