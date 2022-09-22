import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Value of A is: "+ a);
        int b = sc.nextInt();
        System.out.println("Value of B is: "+ b);
        Main m = new Main();
        m.swap(a,b);



        System.out.println("Hello world!");
    }

    public void swap(int a, int b){
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println("hello");
    }
}