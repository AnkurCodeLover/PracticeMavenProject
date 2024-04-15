package checkboxesExmp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.time.Duration;

public class JavaScriptClick {

    public static void main(String[] args) {


    WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.getCurrentUrl();



        //JavascriptExecutor js = (JavascriptExecutor) driver;

       // js.executeScript("document.getElementsById('name').value = 'Selenium Introduction';");


    }
}
