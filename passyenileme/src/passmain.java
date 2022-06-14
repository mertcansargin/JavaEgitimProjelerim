import java.util.Scanner;

public class passmain {
    public static void main(String[] args) {

        String newpass,pass="pass12",deger,islem;
        Scanner rea=new Scanner(System.in);

        System.out.println("Şifrenizi giriniz: ");
        deger=rea.nextLine();

        if(!pass.equals(deger)){
            System.out.println("Şifreniz yanlış girildi!!!");
            System.out.println("Şifreyi değiştirmek ister misiniz? : E, N");
            islem=rea.nextLine();
            switch (islem){
                case "E":
                case"e":
                    System.out.print("Yeni Şifrenizi giriniz: ");
                    newpass=rea.nextLine();

                        if (!newpass.equals(deger) || newpass.equals(pass)) {
                            System.out.println("Şifreniz başarıyla oluşturuldu.");
                            System.out.println("Yeni Şifreniz: " + newpass);
                            break;
                        } else {
                            System.out.println("Şifre oluşturulamadı lütfen tekrar deneyin.");

                        }
                        break;
                case "N":
                case"n":
                    System.out.println("Çıkış yapılıyor...");
                    break;

            }

        }
        else
        {
            System.out.println("Başarıyla giriş yapıldı hoşgeldiniz...");
        }

    }
}
