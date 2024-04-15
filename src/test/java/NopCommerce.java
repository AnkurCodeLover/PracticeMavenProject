import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/");

        Thread.sleep(3000);
        WebElement uName = driver.findElement(By.name("Email"));
        uName.clear();
        uName.sendKeys("admin@yourstore.com");

        WebElement pwd = driver.findElement(By.name("Password"));
        pwd.clear();
        pwd.sendKeys("admin");

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

        String heading = driver.findElement(By.className("content-header")).getText();

        if(heading.equals("Dashboard")){
            System.out.println("Test Pass");
        }else {
            System.out.println("Fail Header "+heading);
        }

        driver.close();
    }
}
