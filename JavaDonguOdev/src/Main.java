import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner rea=new Scanner(System.in);
        int sayac=0;
        int ort=0;

        System.out.print("Bir sayı giriniz: ");
        int sayi=rea.nextInt();

        for(int i=1;i>=sayi;i++){
            if ((i%3==0)&&(i%4==0)){
                ort=ort+i;
                sayac=sayac+1;
                System.out.println(i);
            }
        }
        System.out.println("ortalama: "+ort/sayac);
    }
}