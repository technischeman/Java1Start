import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner remainingnumber=new Scanner(System.in);
        System.out.println("first number");
        int a=remainingnumber.nextInt();
        System.out.println("second number");
        int b=remainingnumber.nextInt();
        System.out.println("remainingnumber");
        int c=a&b;
        System.out.println(c);
    }
}



