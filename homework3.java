import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        //Ehliyet alma yaşı 18dir. Kullanıcıdan yasini isteyiniz ve ehliyet alıp alamayacagini konsola yazdiriniz.
        Scanner ehliyet=new  Scanner(System.in);
        System.out.println("yas gir");
        int yas=ehliyet.nextInt();
        boolean a=( yas>=18);
        System.out.println("ehlyet alabilir="+a);
    }
}
