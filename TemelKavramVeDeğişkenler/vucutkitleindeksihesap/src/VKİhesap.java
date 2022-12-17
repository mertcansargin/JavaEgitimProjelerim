import java.util.Scanner;

public class VKİhesap {
    public static void main(String[] args) {

        double vki,boy,kilo;
        Scanner rea=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz: " );
        boy=rea.nextInt();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo= rea.nextInt();

        vki=kilo/boy*boy;
        System.out.println("Vücut kitle indeksiniz: "+vki);
        if(vki<18.5){
            System.out.println("Düşük kilolu");
        } else if (vki>=18.5 || vki<24.9) {
            System.out.println("Normal kilolu");
            
        }
        else if (vki>=24.9 || vki<29.9) {
            System.out.println("Fazla kilolu");

        }
        else if (vki>30 || vki<40) {
            System.out.println("Obez");

        }
        else if (vki>=40) {
            System.out.println("Aşırı obez");

        }
        else {
            System.out.println("Hatalı değer girdiniz! ");

        }

    }
}
