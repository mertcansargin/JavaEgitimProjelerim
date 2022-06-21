import java.util.Scanner;
class hesapla {
    public static void main(String[] args) {
        int yas,km,tarife;
        double toptutar,ucret=0.10,gdindirim=0.20;
        Scanner rea=new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi km cinsinden giriniz: ");
        km=rea.nextInt();
        System.out.println("Lütfen yaşınızı giriniz: ");
        yas=rea.nextInt();
        System.out.println("1-->Gidiş   2-->Gidiş-Dönüş");
        tarife=rea.nextInt();

       if (km>=0&&yas>=0&&tarife==1||tarife==2) {

            if (tarife==1) {
            toptutar = km * ucret;
            System.out.println(toptutar);
                if (yas >= 0 && yas <= 11) {
                    toptutar -= (toptutar * 0.50);
                    System.out.println(toptutar+" TL'dir");
                } else if (yas >= 12 && yas <= 24) {
                    toptutar -= (toptutar * 0.10);
                    System.out.println(toptutar+" TL'dir");
                } else if (yas >= 65) {
                    toptutar -= (toptutar * 0.30);
                    System.out.println(toptutar+" TL'dir");
              }
            }
            else{
                toptutar = km * ucret;
                if (yas >= 0 && yas < 12) {
                    toptutar -= (toptutar * 0.50);
                    toptutar-=toptutar*gdindirim;
                    toptutar=toptutar*2;
                    System.out.println(toptutar+" TL'dir");
                } else if (yas >= 12 && yas <= 24) {
                    toptutar -= (toptutar * 0.10);
                    toptutar-=toptutar*gdindirim;
                    toptutar=toptutar*2;
                    System.out.println(toptutar+" TL'dir");
                } else if (yas >= 65) {
                    toptutar -= (toptutar * 0.30);
                    toptutar-=toptutar*gdindirim;
                    toptutar=toptutar*2;
                    System.out.println(toptutar+" TL'dir");
                }
            }
        }
        else
                System.out.println("Hatalı değer girdiniz lütfen kontrol ediniz...");



    }
}
