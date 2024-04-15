import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutomateAmazon {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.co.uk/");
        //driver.get(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.navigate().refresh();

        WebElement cookieBanner = driver.findElement(By.xpath("//h4[contains(text(),'Select your cookie ')]"));
        if (cookieBanner.isDisplayed()) {
            WebElement acceptButton = cookieBanner.findElement(By.xpath("//input[@id='sp-cc-accept']"));
            acceptButton.click();
        }

        driver.findElement(By.cssSelector(".hm-icon.nav-sprite")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Electronics & Computers']")));
        // Loop to scroll down until the element is not visible
        element.click();
        Thread.sleep(2000);
        WebElement phoneAccessories = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Phones & Accessories'])[1]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", phoneAccessories);
        //System.out.println(phoneAccessories.getText());
        driver.findElement(By.linkText("Mobile Phones & Smartphones")).click();


        WebElement samsungPhones = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][text()='Samsung']"));
        //Thread.sleep(2000);
        System.out.println(samsungPhones.isDisplayed());

        Actions actions = new Actions(driver);
        actions.moveToElement(samsungPhones);
        actions.click().perform();


        WebElement mobleResolution = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][text()='20 MP & above']"));
        actions.moveToElement(mobleResolution);
        actions.click().perform();

        WebElement modelYear = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][text()='2023']"));
        actions.moveToElement(modelYear);
        actions.click().perform();

        WebElement lowPriceBracket = driver.findElement(By.xpath("//input[@id='low-price']"));
        actions.moveToElement(lowPriceBracket);
        actions.click().sendKeys("50").perform();

        WebElement highPriceBracket = driver.findElement(By.xpath("//input[@id='high-price']"));
        highPriceBracket.sendKeys("100");
        //actions.moveToElement(lowPriceBracket);
        //actions.click().sendKeys("100").perform();

        WebElement goButton = driver.findElement(By.xpath("//input[@class='a-button-input']"));
        goButton.click();
        //actions.moveToElement(goButton);
        //actions.click().perform();

        driver.quit();

    }


    // Method to scroll down the page
    public static void scrollDownUntilNotVisible(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (isElementVisible(driver, element)) {
            js.executeScript("window.scrollBy(0, 100)");
        }
    }

    // Method to check if element is visible
    public static boolean isElementVisible(WebDriver driver, WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;}
    }
    public static void  jScriptClick(WebDriver driver, WebElement element) {
        WebElement phoneAccessories = driver.findElement(By.xpath("(//a[normalize-space()='Phones & Accessories'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", phoneAccessories);
    }

}
