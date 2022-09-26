import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    public  void Step1flow() throws InterruptedException{
      envsetup.wd.findElement(By.id("skip")).click();
      Thread.sleep(3000);
       envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/div[1]/div[1]/div[1]/div[3]/div[1]/li[1]")).click();
       Thread.sleep(3000);
        envsetup.wd.findElement(By.id("v-35-step1-cta-next")).click();
        Thread.sleep(3000);
    }
//    public void selectunit(){
//        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/div[1]/div[1]/div[1]/div[3]/div[1]/li[1]")).click();
//        envsetup.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
//    public  void step1click(){
//        envsetup.wd.findElement(By.id("v-35-step1-cta-next")).click();
//    }
    public  void pickup_address() throws InterruptedException{

        envsetup.wd.findElement(By.id("postcode")).click();
        Thread.sleep(2000);
        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
        Thread.sleep(2000);
        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
        Thread.sleep(2000);
    }
//    public  void addressline1(){
//        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
//
//    }
//    public void addressline2(){
//        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
//
//    }
    public  void monthdropdow () throws InterruptedException{
        envsetup.wd.findElement(By.xpath("//span[@id='selected-inquiry']")).click();
        Thread.sleep(1000);
        envsetup.wd.findElement(By.xpath("//li[@id='73']")).click();
    }
//    public void selectmonth(){
//        envsetup.wd.findElement(By.xpath("//li[@id='73']")).click();
//        envsetup.wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    }
    public void datetimeselection() throws InterruptedException{
        envsetup.wd.findElement(By.id("opener")).click();
        Thread.sleep(1000);
        envsetup.wd.findElement(By.xpath("//a[contains(text(),'28')]")).click();
        Thread.sleep(3000);
        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[3]")).click();
        Thread.sleep(3000);
        envsetup.wd.findElement(By.id("tslotSaveBtn")).click();
        Thread.sleep(3000);
    }
    public void packingassistancecheck() throws InterruptedException{
        envsetup.wd.findElement(By.xpath("//body/main[1]/div[1]/div[3]/div[1]/form[1]/div[6]/div[2]/label[1]/span[1]")).click();
        Thread.sleep(2000);
    }
    public void discountCode(){
        envsetup.wd.findElement(By.id("coupon-code")).sendKeys("scape");
    }
    public void step2click(){
        envsetup.wd.findElement(By.id("v-35-step2-cta-next")).click();
    }


    public void packingmaterals_materials_and_bundle() throws InterruptedException{
        envsetup.wd.findElement(By.id("addBundleCartBtn_38")).click();
        Thread.sleep(2000);
        envsetup.wd.findElement(By.xpath("//body/main[@id='st-container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]")).click();
        Thread.sleep(1000);
        envsetup.wd.findElement(By.id("plus_18")).click();
        Thread.sleep(1000);
        envsetup.wd.findElement(By.id("addCartBtn_18")).click();
        Thread.sleep(1000);
        envsetup.wd.findElement(By.id("submitCart")).click();

    }
    public void userdetails(){
        envsetup.wd.findElement(By.id("name")).sendKeys("Asghar Auto");
        envsetup.wd.findElement(By.id("email")).sendKeys("asgharauto1@bys.com");
        envsetup.wd.findElement(By.id("customerPhone")).sendKeys("7410852963");
        envsetup.wd.findElement(By.id("v-35-step3-cta-next")).click();
    }

    public void closedriver(){

        if(envsetup.wd!=null){
            envsetup.wd.close();
            envsetup.wd.quit();
        }
    }

}
