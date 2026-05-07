package PracticePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement alert=driver.findElement(By.id("alertbtn"));
        alert.click();
        Thread.sleep(3000);
        Alert alert1=driver.switchTo().alert();
        String alertText = alert1.getText();
        System.out.println("texte :"+alertText);
        alert1.accept();
    }
}
