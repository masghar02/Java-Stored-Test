import org.openqa.selenium.By;
import org.junit.*;
public class elementcallingclass extends enviornmentSetup implements testclose {

    enviornmentSetup es;

    public  void postcodemethod(){
        es = new enviornmentSetup();
        es.envSetup();
        es.driver.findElement(By.id("postcode")).sendKeys("BN9");
        es.driver.findElement(By.id("get-storage-price-v-35")).click();

    }

    public void tearDown(){
        if(es.driver!=null)
        {
            es.driver.close();
            es.driver.quit();
        }
    }
}
