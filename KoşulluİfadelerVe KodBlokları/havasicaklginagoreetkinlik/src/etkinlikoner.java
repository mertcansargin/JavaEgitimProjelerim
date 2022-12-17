import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class etkinlikoner {
    public static void main(String[] args) {
        int sıcaklık,kontrol;
        Scanner rea=new Scanner(System.in);

        System.out.println("Hava sıcaklığını Giriniz: ");

        while(!rea.hasNextInt()){
            System.out.println("Lütfen sayısal bir değer girin!");
            rea.nextLine();
        }
        sıcaklık=rea.nextInt();
        System.out.println("Hava sıcaklığı: "+sıcaklık);


            if (sıcaklık < 5)
                System.out.println("Kayak yapabilirsin... ");
            else if (sıcaklık >= 5 && sıcaklık < 15)
                System.out.println("Sinemaya gidebilirsin... ");
            else if (sıcaklık >= 15 && sıcaklık < 25)
                System.out.println("Piknik yapabilirsin...");
            else if (sıcaklık >= 25)
                System.out.println("Yüzlemeye gidebilirsin...");
            else
                System.out.println("Lütfen sıcaklık girişini doğru yapın");




    }
}
