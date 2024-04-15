import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class NavigationCommandDemo {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setImplicitWaitTimeout(Duration.ofSeconds(10));

        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://selenium.dev");

        //Get the Title of web page
        String PageTitle= driver.getTitle();
        System.out.println("Title of Page 1 is : " + PageTitle);

        Thread.sleep(2000);
        System.out.println("Navigate to New Page 2");
        driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[4]/a/span")).click();

        Thread.sleep(2000);
        System.out.println("Navigate back to Old Page 1");
        driver.navigate().back();

        Thread.sleep(2000);
        System.out.println("Navigate forward to New Page 2");
        driver.navigate().forward();

        Thread.sleep(2000);
        System.out.println("Refresh the existing page");
        driver.navigate().refresh();

        //quit the browser
        driver.quit();
    }
}
