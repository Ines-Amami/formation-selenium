package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement DropDownElement = driver.findElement(By.id("carselect"));
        Select dropdown = new Select(DropDownElement);
        dropdown.selectByVisibleText("BMW");
        //Verification
        String SelectedOption = dropdown.getFirstSelectedOption().getText();
        if ("BMW".equals(SelectedOption)) {
            System.out.println("BMW IS SELECTED");

        } else {
            System.out.println("BMW IN NOT SELECTED");

        }
    }
}