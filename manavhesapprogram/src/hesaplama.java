import java.util.Scanner;
public class hesaplama {
    public static void main(String[] args) {

        double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,aubergine=5.00,tutar; //manav fiyatları
        double pearkg,applekg,tomatokg,bananakg,auberginekg;

        Scanner rea=new Scanner(System.in);

        System.out.println("Kaç kg Elma aldınız? : ");
        applekg=rea.nextDouble();
        System.out.println("Kaç kg Armut aldınız? : ");
        pearkg=rea.nextDouble();
        System.out.println("Kaç kg Muz aldınız? : ");
        bananakg=rea.nextDouble();
        System.out.println("Kaç kg Patlıcan aldınız? : ");
        auberginekg=rea.nextDouble();
        System.out.println("Kaç kg Domates aldınız? : ");
        tomatokg=rea.nextDouble();

        tutar=(apple*applekg)+(banana*bananakg)+(tomato*tomatokg)+(aubergine*auberginekg)+(pear*pearkg );

        System.out.println("Toplam Tutar: "+tutar+" TL'dir.");

    }
}
