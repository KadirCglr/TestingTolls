package CampusOdevXpath;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Odev4 extends BaseDriver {

    @Test
    public void Odev4 () {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate = driver.findElement(By.xpath("//a[@id='calculate']"));
        calculate.click();
        MyFunc.Bekle(2);


        WebElement input1 = driver.findElement(By.xpath("//input[@id='number1']"));
        input1.sendKeys("9");
        MyFunc.Bekle(2);


        WebElement input2 = driver.findElement(By.xpath("//input[@id='number2']"));
        input2.sendKeys("4");
        MyFunc.Bekle(2);


        WebElement button = driver.findElement(By.xpath("//input[@id='calculate']"));
        button.click();
        MyFunc.Bekle(2);


        WebElement answer = driver.findElement(By.xpath("//span[@id='answer']"));


        BekleKapat();








    }
}
