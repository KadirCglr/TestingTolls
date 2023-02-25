package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {
        //1-Açılan sayfadaki kutucuğa mesajınızı yazınız.
        //2-Butona tıklatınız
        //3-Butona
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys("biz testerlar geliyoruz");

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().equals("biz testerlar geliyoruz"))
            System.out.println("test passed");
        else
            System.out.println("test fail");

        BekleKapat();

    }
}
