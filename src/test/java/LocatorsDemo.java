import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();

        List<WebElement> sliders = driver.findElements(By.className("homeslider-description"));
        System.out.println("Number Of Sliders is "+sliders.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of Images : "+images.size());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Print Number of links "+links.size());

        driver.quit();
    }

}
