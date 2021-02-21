import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
       // 1 araba 100km de 9 litre benzin yakıyor. 1 Litre benzin 1.4 euro dur.
        //Kullanıcıdan konsola kaç Euro luv benzin alacagini isteyiniz ve
       // onunla kaç km gidebileceğini hesaplayarak konsola yazdiriniz.


        Scanner km=new Scanner(System.in);
        System.out.println("kac_euroluk_benzin=");
        double verileneuro= km.nextDouble();
        //double euro=double benzin*1.4;
        double alinanbenzin=verileneuro/(1.4);
        double litrebenzinlealinanyol=100.00/9.00;
        double alinankm=alinanbenzin*litrebenzinlealinanyol;
        System.out.println("kac km yol="+alinankm);

        }




}
