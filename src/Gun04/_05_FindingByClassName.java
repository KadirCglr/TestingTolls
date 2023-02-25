package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); //sayfaya gittim

        WebElement name=driver.findElement(By.className("form-textbox"));
        name.sendKeys("kadir");

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());
        for (WebElement e: labels)
            System.out.println("e.getText() = " + e.getText());

        // aranılan eleman bulunamazsa : findElement NoSuchElement hatası verir
        // findElements is size ı 0 olan List verir, yani hata vermez

        MyFunc.Bekle(3);
        driver.quit();
    }
}
