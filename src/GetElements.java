import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GetElements extends EnviornmentSetup implements Driveclose{

    EnviornmentSetup envsetup;
    public void GetPostcode() throws InterruptedException {

        envsetup = new EnviornmentSetup();
        envsetup.StoredEnviornment();
        Thread.sleep(2);
        envsetup.wd.findElement(By.id("postcode")).sendKeys("BN9");
        envsetup.wd.findElement(By.id("get-storage-price-v-35")).click();
        envsetup.wd.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
    }
    public  void Skippopup(){
      envsetup.wd.findElement(By.id("skip")).click();

    }
    public void closedriver(){

        if(envsetup.wd!=null){
            envsetup.wd.close();
            envsetup.wd.quit();
        }
    }

}
