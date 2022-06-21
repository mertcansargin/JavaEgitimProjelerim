import java.util.Scanner;

public class teksayitoplama {
    public static void main(String[] args) {
        int toplam=0,deger;
        Scanner rea=new Scanner(System.in);

        do {
            System.out.println("Sayı girin lütfen: ");
            deger=rea.nextInt();
            if(deger%2==1){
                toplam+=deger;
            }
        }
        while (deger>0);
        System.out.println(toplam);
        System.out.println("Döngü bitti");
    }
}
