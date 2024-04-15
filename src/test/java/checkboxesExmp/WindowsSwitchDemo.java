package checkboxesExmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsSwitchDemo {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Pass application url
        driver.get("https://demoqa.com/browser-windows");

        //Count of window - 1
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Count of Window :" + allWindowHandles.size());

        //Open a child window
        driver.findElement(By.id("windowButton")).click();

        //Count of windows , changed from 1 to 2
        Set<String> newAllWindowHandles = driver.getWindowHandles();
        System.out.println("New Count of Window :" + newAllWindowHandles.size());

        // Get the detail of the parent window
        String ParentHandle = driver.getWindowHandle();
        System.out.println("Parent Window :" + ParentHandle);

        //Get details of parent and child windows
        Iterator<String> iterator = newAllWindowHandles.iterator();
        String mainWindow = iterator.next();
        String childWindow = iterator.next();
        System.out.println("Parent Window :" + mainWindow);
        System.out.println("Child Window :" + childWindow);

        //Switch control to child window
        driver.switchTo().window(childWindow);

        //Verify the text present on child window
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println("Child_Title :" + text.getText());

        // Close Child window
        driver.close();

        // Switch back to parent window
        driver.switchTo().window(ParentHandle);
        System.out.println("Parent Title :" + driver.getTitle());

        // Close Parent window
        driver.quit();
    }

}