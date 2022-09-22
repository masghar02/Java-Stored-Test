
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Browser Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bystored:bystored2020@stage.bystored.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("postcode")).sendKeys("BN9");
        driver.findElement(By.id("get-storage-price-v-35")).click();
        Thread.sleep(5000);

        driver.close();
        driver.quit();


    }
}