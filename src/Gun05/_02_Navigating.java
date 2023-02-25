package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);

        WebElement element=driver.findElement(By.id("alerttest"));
        //WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğgun URL yi verir

        driver.navigate().back();   // tarayıcı history isinden geri geldim
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward(); // tarayıcı history isinden ileri gittim
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());


        BekleKapat();

    }
}
