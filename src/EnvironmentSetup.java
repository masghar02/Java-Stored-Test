import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentSetup extends  chromesteup{

    WebDriver wd;
    String popupskip = "skip";
    String postCode = "postcode";
    String get_a_Quote = "get-storage-price-v-35";
    String userNameid ="name";
    String userEmailid="email";
    String userphoneNumberid="customerPhone";
    String userName = "Asghar Test1";
    String email= "asgharauto2@bys.com";
    String phoneNumber = "7410852963";
    public void storedEnvironment(){
        chromesteup cs = new chromesteup();
        wd = new ChromeDriver();
        cs.chromsetup();
        wd.get("https://bystored:bystored2020@stage.bystored.com");
        wd.manage().window().maximize();

    }


}
