package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Disabled {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement ZoneText= driver.findElement(By.id("enabled-example-input"));
        ZoneText.sendKeys("Ines Amami");
        WebElement EnabledBtn= driver.findElement(By.id("enabled-button"));
        EnabledBtn.click();
        WebElement DisabledBtn= driver.findElement(By.id("disabled-button"));
        DisabledBtn.click();
    }
}
