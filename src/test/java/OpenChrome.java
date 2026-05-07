import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");//Navigate vers google
        driver.navigate().to("https://youtube.com/");//Depuis Google, naviguer vers YouTube
        String url= driver.getPageSource();//Afficher le code HTML de la page source
        System.out.println("le code html de la page actuelle est: "+url);//Pour afficher un message
        String URL=driver.getCurrentUrl();
        System.out.println("url est:"+URL);
        driver.navigate().back();//Retourner à la page précédent
        driver.navigate().forward();//Avancer a la page suivante
        Thread.sleep(5000);//Temps d'attente
        driver.navigate().refresh();//Actualiser la page
        driver.quit();
    }
}
