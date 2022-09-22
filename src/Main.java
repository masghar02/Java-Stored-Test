import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {



//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("Value of A is: "+ a);
//        int b = sc.nextInt();
//        System.out.println("Value of B is: "+ b);
//        Main m = new Main();
//        m.swap(a,b);
//        System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\AppData\\Local\\Programs\\Python\\Python310\\chromedriver.exe");
        WebDriver cd = new ChromeDriver();
        cd.get("https://bystored:bystored2020@stage.bystored.com");
        cd.manage().window().maximize();
        cd.findElement(By.id("postcode")).sendKeys("BN9");
        cd.findElement(By.id("get-storage-price-v-35")).click();
        cd.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);

        cd.close();
        cd.quit();



    }

//    public void swap(int a, int b){
//        int temp;
//        temp = b;
//        b = a;
//        a = temp;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("hello");
//    }
}