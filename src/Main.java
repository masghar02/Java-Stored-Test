
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class Main extends elementcallingclass {

    public static void main(String[] args) throws InterruptedException {

         try
         {

             elementcallingclass stored_elements = new elementcallingclass();
             stored_elements.GetPostcode();
             Thread.sleep(1000);
             stored_elements.Step1flow();
             Thread.sleep(1000);
//        stored_elements.selectunit();
//        Thread.sleep(1000);
//        stored_elements.step1click();
//        Thread.sleep(1000);
             stored_elements.pickup_address();
//        Thread.sleep(1000);
//        stored_elements.addressline1();
//        Thread.sleep(1500);
//        stored_elements.addressline2();
             Thread.sleep(1000);
             stored_elements.monthdropdow();
//        stored_elements.selectmonth();
             Thread.sleep(1000);
             stored_elements.datetimeselection();
             Thread.sleep(1500);
             stored_elements.packingassistancecheck();
             Thread.sleep(2000);
             stored_elements.discountCode();
             Thread.sleep(2000);
             stored_elements.step2click();
             Thread.sleep(3000);
             stored_elements.packingmaterals_materials_and_bundle();
             Thread.sleep(3000);
             stored_elements.userdetails();
             Thread.sleep(30000);
             stored_elements.closedriver();
             System.out.println("Successfully Run");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }








    }
}