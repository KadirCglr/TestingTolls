package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SenaryoSoru extends BaseDriver {

    @Test
    public void soru () {

        driver.get("https://www.saucedemo.com");

        MyFunc.Bekle(3);
        WebElement username = driver.findElement(By.xpath("//input[@class='input_error form_input'][@placeholder='Username']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(3);
        WebElement password = driver.findElement(By.xpath("//input[@class='input_error form_input'][@placeholder='Password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(3);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        MyFunc.Bekle(3);
        WebElement sauceLabs = driver.findElement(By.xpath("//a[@id='item_4_title_link']/div"));
        sauceLabs.click();

        MyFunc.Bekle(3);
        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        MyFunc.Bekle(3);
        WebElement back = driver.findElement(By.xpath("//button[@id='back-to-products'] "));
        back.click();

        MyFunc.Bekle(3);
        WebElement tShirt = driver.findElement(By.xpath("//a[@id='item_1_title_link']/div"));
        tShirt.click();

        MyFunc.Bekle(3);
        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();

        MyFunc.Bekle(3);
        WebElement theCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        theCart.click();

        MyFunc.Bekle(3);
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        MyFunc.Bekle(3);
        WebElement firsName = driver.findElement(By.xpath("//div[@class='form_group']/input[@id='first-name']"));
        firsName.sendKeys("kadir");

        MyFunc.Bekle(3);
        WebElement lastName = driver.findElement(By.xpath("//div[@class='form_group']/input[@id='last-name']"));
        lastName.sendKeys("caglar");

        MyFunc.Bekle(3);
        WebElement postalCode = driver.findElement(By.xpath("//div[@class='form_group']/input[@id='postal-code']"));
        postalCode.sendKeys("55400");

        MyFunc.Bekle(3);
        WebElement continuee = driver.findElement(By.xpath("//input[@id='continue']"));
        continuee.click();





        BekleKapat();

    }
}
