package CampusOdevXpath;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Odev6 extends BaseDriver {

    @Test
    public void Odev6 () {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlerts.click();
        MyFunc.Bekle(2);


        WebElement showModal = driver.findElement(By.xpath("//input[@id='modaldialog']"));
        showModal.click();
        MyFunc.Bekle(2);


        WebElement ok = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();
        MyFunc.Bekle(2);


        BekleKapat();

    }
}
