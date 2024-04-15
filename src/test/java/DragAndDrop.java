import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {

    protected static WebDriver driver;

    public static void main(String[] args) {

        // Create a new instance of the Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.setImplicitWaitTimeout(Duration.ofSeconds(10));
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

        // Launch the URL
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();

        System.out.println("Text appeared :" + driver.findElement(By.id("drop-status")).getText());
        driver.close();

    }
}
