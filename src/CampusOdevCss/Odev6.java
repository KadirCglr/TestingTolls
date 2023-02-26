package CampusOdevCss;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev6 extends BaseDriver {

    @Test
    public void Odev6 () {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(2);
        WebElement fakeAlerts = driver.findElement(By.cssSelector("[id='fakealerttest'][href^='alerts']"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement showModal = driver.findElement(By.cssSelector("[id='modaldialog'][type='button']"));
        showModal.click();

        MyFunc.Bekle(2);
        WebElement ok = driver.findElement(By.cssSelector("button[id='dialog-ok'][class$='button']"));
        ok.click();

        BekleKapat();



    }
}
