
import java.util.Scanner;


public class kdvhesap {
    public static void main(String[] args) {

        double fiyat,kdv,tutar;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Tutarı Giriniz: ");
        tutar=input.nextDouble();

        if(tutar<=1000)
        {
            kdv=1.18;
            fiyat=(tutar*kdv);
            System.out.println("KDV'li fiyatı: "+fiyat);
        }
        else
        {
            kdv = 0.8;
            fiyat = tutar+(tutar * kdv);
            System.out.println("KDV'li fiyatı: " + fiyat);
        }


    }
}
