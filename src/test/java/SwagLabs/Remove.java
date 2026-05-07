package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remove {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement addtocart1= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addtocart1.click();
        WebElement addtocart2= driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addtocart2.click();
        WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        cart.click();
        WebElement remove2= driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        remove2.click();
    }
}
