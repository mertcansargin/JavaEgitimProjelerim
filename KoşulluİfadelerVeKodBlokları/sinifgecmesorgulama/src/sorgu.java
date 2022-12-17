import com.sun.security.jgss.GSSUtil;
import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;

public class sorgu {
    public static void main(String[] args) {
        int mat,kimya,fizik,turkce,muzik,ort;
        Scanner rea=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat= rea.nextInt();
        if(mat>=0 && mat<=100) {
            System.out.println("Kimya notunuzu giriniz: ");
            kimya = rea.nextInt();
            if (kimya >= 0 && kimya <= 100) {
                System.out.println("Fizik notunuzu giriniz: ");
                fizik = rea.nextInt();
                if (fizik >= 0 && fizik <= 100) {
                    System.out.println("Türkçe notunuzu giriniz: ");
                    turkce = rea.nextInt();
                    if (turkce >= 0 && turkce <= 100) {
                        System.out.println("Müzik notunuzu giriniz: ");
                        muzik=rea.nextInt();
                        if (muzik>=0&&muzik<=100){
                            System.out.println("Veriler hesaplanıyor...");
                            ort=(mat+fizik+kimya+muzik+turkce)/5;
                            String durum= ort>=55 ? "Geçti":"Kaldı";
                            System.out.println(durum);
                            
                        }

                    }
                }
            }
        }
        else {
            System.out.println("Girdiğiniz değer 0-100 arasında olalıdır.!");
        }




    }





}
