
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class Main extends elementcallingclass {

    public static void main(String[] args) throws InterruptedException {

         try
         {

        elementcallingclass es;
        es= new elementcallingclass();
        es.postcodemethod();
        Thread.sleep(10000);
        es.tearDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }








    }
}