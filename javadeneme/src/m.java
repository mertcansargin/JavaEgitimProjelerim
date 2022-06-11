import java.util.Arrays;
import java.util.Scanner;

public class m {
    public static void main(String[] args) {


        int mat,fizik,tarih,kimya,turkce,muzik,ort;
        Scanner input=new Scanner(System.in);

        System.out.println("Matematik puanınızı giriniz:");
        mat=input.nextInt();
        System.out.println("Fizik puanınızı giriniz:");
        fizik=input.nextInt();
        System.out.println("Tarih puanınızı giriniz:");
        tarih=input.nextInt();
        System.out.println("Kimya puanınızı giriniz:");
        kimya=input.nextInt();
        System.out.println("Türkçe puanınızı giriniz:");
        turkce=input.nextInt();
        System.out.println("Müzik puanınızı giriniz:");
        muzik=input.nextInt();

        ort=(mat+fizik+kimya+tarih+turkce+muzik)/6;

        String sonuc= ort>=60 ? "geçti":"kaldı";
        System.out.println(sonuc);
    }
}
