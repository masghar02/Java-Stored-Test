import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main extends EnviornmentSetup {
    public static void main(String[] args) throws InterruptedException {

        GetElements stored_elements = new GetElements();
        stored_elements.GetPostcode();
        Thread.sleep(10);
        stored_elements.Skippopup();
        Thread.sleep(10);
        stored_elements.closedriver();

//        cs.chromsetup();
//        WebDriver cd = new ChromeDriver();
//        cd.get("https://bystored:bystored2020@stage.bystored.com");
//        cd.manage().window().maximize();
//        cd.findElement(By.id("postcode")).sendKeys("BN9");
//        cd.findElement(By.id("get-storage-price-v-35")).click();
//        cd.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
//
//        cd.close();
//        cd.quit();



    }


}