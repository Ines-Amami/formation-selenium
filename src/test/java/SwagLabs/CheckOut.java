package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckOut {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
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
        WebElement checkoutButton=driver.findElement(By.id("checkout"));
        checkoutButton.click();
        WebElement firstname=driver.findElement(By.id("first-name"));
        firstname.sendKeys("Ines");
        WebElement lastname=driver.findElement(By.id("last-name"));
        lastname.sendKeys("Amami");
        WebElement postalcode=driver.findElement(By.id("postal-code"));
        postalcode.sendKeys("3062");
        WebElement boutoncontinue=driver.findElement(By.id("continue"));
        boutoncontinue.click();
        WebElement boutonfinish=driver.findElement(By.id("finish"));
        boutonfinish.click();
        WebElement boutonbackhome=driver.findElement(By.id("back-to-products"));
        boutonbackhome.click();
    }
}
