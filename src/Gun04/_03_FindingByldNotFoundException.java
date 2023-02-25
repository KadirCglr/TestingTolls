package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByldNotFoundException {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try {

        WebElement labelLastName=driver.findElement(By.id("hataliLocator"));
        //System.out.println("labelFirstName.getText() = " + labelFirstName.getText());;
        }
        catch (Exception ex)
        {
            System.out.println("WebElement bulunamadı " +ex.getMessage());
        }
        MyFunc.Bekle(3);
        driver.quit();

    }
}
