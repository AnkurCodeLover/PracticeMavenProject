import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMLoginTest {

    public static void main (String[] args) throws InterruptedException {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Open Url in tge browser
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        //WebDriverWait wait = new WebDriverWait(driver);
        Thread.sleep(5000);
        WebElement textUserName = driver.findElement(By.name("username"));
        textUserName.sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        //Verify Title of the current web page
        String actualTitle = driver.getTitle();
        String Exp = "OrangeHRM";
        //Earrings blackboard
        if(actualTitle.equals(Exp)){
           System.out.println("Test Passed");
        }else {
            System.out.println("Failed Title Should be "+actualTitle);
        }

        driver.quit();
    }
}
