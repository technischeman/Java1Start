import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        //Ehliyet alma yaşı 18dir. Kullanıcıdan yasini isteyiniz ve ehliyet alıp alamayacagini konsola yazdiriniz.
        Scanner drivinglisence=new  Scanner(System.in);
        System.out.println("write age");
        int age=drivinglisence.nextInt();
        boolean a=( age>=18);
        System.out.println("can take driving lisence="+a);
    }
}
