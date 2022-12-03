import java.util.Scanner;

public class Main {


    static int Toplam(int say1,int say2){
             int sonuc=say1+say2;
            return sonuc;
        }
        static int Cikar(int say1,int say2){
            int sonuc=say1-say2;
            return sonuc;
        }
        static int Carp(int say1,int say2){
            int sonuc=say1*say2;
            return sonuc;
        }

        static double Bol(int say1,int say2){
           double sonuc=say1/say2;
            return sonuc;
        }
        static int UsAl(int say1,int say2){
           int sonuc=say1+say2;
            return sonuc;
        }
        static int ModAl(int say1,int say2){
            int sonuc=say1+say2;
            return sonuc;
        }
        static int AlanveCevre(int say1,int say2){
           int sonuc=say1+say2;
            return sonuc;
        }
    public static void main(String[] args) {
        Scanner rea=new Scanner(System.in);
        int secim,ustsecim;

        String menu="MENU \n 1 --> Toplama \n" +
                "2 --> Cıkarma \n " +
                "3 --> Carpma \n " +
                "4 --> Bölme \n" +
                "5 --> Üs Alma \n" +
                "6 --> Mod Alma \n" +
                "7 --> Dikdortgen Alan ve Cevre Hesaplama\n" +
                "0 -->Cıkıs Yap";
        System.out.println("1 --> Menu\n" +
                "2 --> Programı Kapat");
        ustsecim = rea.nextInt();

        do {
            if (ustsecim == 1) {
                System.out.println("İlk Sayi: ");
                int say1 = rea.nextInt();
                System.out.println("İkinci Sayi: ");
                int say2 = rea.nextInt();
                do {
                    System.out.println("\n" + menu);
                    secim = rea.nextInt();
                    if (secim >= 0 && secim <= 7) {

                        switch (secim) {
                            case 1:
                                Toplam(say1, say2);
                                break;
                            case 2:
                                Cikar(say1, say2);
                                break;
                            case 3:
                                Carp(say1, say2);
                                break;
                            case 4:
                                Bol(say1, say2);
                                break;
                            case 5:
                                UsAl(say1, say2);
                                break;
                            case 6:
                                ModAl(say1, say2);
                                break;
                            case 7:
                                AlanveCevre(say1, say2);
                                break;
                            case 0:
                                System.out.println("Çıkış Yapılıyor...");
                                break;

                        }
                        break;
                    } else {
                        System.out.println("HATALI TUŞLAMA YAPTINIZ LUTFEN TEKRAR DENE");
                    }

                }  while (secim == 0);
                System.out.println("Cıkış Yapıldı.");
            }


    } while(ustsecim != 2);
        {
            System.out.println("PROGRAM KAPATILDI...");
        }
}}
