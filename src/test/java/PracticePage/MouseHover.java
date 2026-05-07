package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        WebElement mousehover= driver.findElement(By.id("mousehover"));
        Actions actions=new Actions(driver);
        actions.moveToElement(mousehover).perform();
        WebElement top=driver.findElement(By.xpath("//*[@id=\"mouse-hover-example-div\"]/div[1]/fieldset/div/div/a[1]"));
        top.click();
    }
}
