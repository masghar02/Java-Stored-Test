import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enviornmentSetup extends chromedriver {

    WebDriver driver;
    public  void envSetup(){
        chromedriver cd = new chromedriver();
        cd.chromcall();

        driver= new ChromeDriver();
        driver.get("https://bystored:bystored2020@stage.bystored.com");
        driver.manage().window().maximize();
    }
}
