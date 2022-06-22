import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class paracek {
    public static void main(String[] args) {
        String username,pass;
        Scanner rea=new Scanner(System.in);
        int balance=1000,right=3,select,price;
         while (right>0){
             System.out.println("Kullanıcı adınızı Giriniz: ");
             username=rea.nextLine();
             System.out.println("Şifrenizi Giriniz: ");
             pass=rea.nextLine();
             System.out.println("İşleminiz yapılıyor...");


                 if (username.equals("mert") && pass.equals("1234")) {
                     System.out.println("Yapılacak işlemi seçiniz: \nPara Yatır---> 1\nPara Çek---> 2");
                     System.out.println("Bakiye sorgulama---> 3 \nÇıkış---> 4");
                     select = rea.nextInt();

                     switch (select) {
                         case 1:
                             System.out.println("Yatırılacak tutar: ");
                             price = rea.nextInt();
                             balance += price;
                             System.out.println("Yeni bakiye:" + balance);
                             break;
                         case 2:
                             System.out.println("Çekilecek tutar: ");
                             price = rea.nextInt();
                             if (balance>=price){
                             balance -= price;
                             System.out.println("Yeni Bakiyeniz: " + balance);
                             break;}
                             else System.out.println("Bakiyeniz yetersizdir.");break;
                         case 3:
                             System.out.println("Bakiye Sorgulanıyor...\nBakiyeniz: " + balance);
                             break;
                         case 4:
                             System.out.println("Cikis yapiliyor...");
                             break;
                     }
             }
                 else {
                     System.out.println("Bilgileriniz hatalıdır. Lütfen tekrar deneyiniz...");
                     right--;
                     System.out.println("Kalan hakkınız: "+right);
                 }

         }
        System.out.println("Bilgilerinizi yanlış girdiniz. Hesabınız bloke edilmiştir...\n Lütfen bankanızla görüşünüz.");

    }
}
