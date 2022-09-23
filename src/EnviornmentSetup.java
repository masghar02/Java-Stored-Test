import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnviornmentSetup extends  chromesteup{

    WebDriver wd;
    public void StoredEnviornment(){
        chromesteup cs = new chromesteup();
        wd = new ChromeDriver();
        cs.chromsetup();
        wd.get("https://bystored:bystored2020@stage.bystored.com");
        wd.manage().window().maximize();

    }
}
