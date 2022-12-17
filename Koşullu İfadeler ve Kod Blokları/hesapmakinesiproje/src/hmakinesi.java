import java.util.Scanner;

public class hmakinesi {
    public static void main(String[] args) {

        int islem,say1,say2,sonuc;
        Scanner rea=new Scanner(System.in);

        System.out.println("Yapılacak işlemi giriniz: ");
        System.out.println("Toplama --> 1 \nÇıkarma --> 2 \nÇarpma --> 4 \nBölme --> 4 \n");
        islem=rea.nextInt();
        System.out.println("İlk sayıyı giriniz: ");
        say1=rea.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        say2=rea.nextInt();

        switch (islem){
            case 1:
                System.out.println(say1+say2);
                break;
            case 2:
                System.out.println(say1-say2);
                break;
            case 3:
                System.out.println(say1*say2);
                break;
            case 4:
                if(say1>=say2)
                    System.out.println(say1 / say2);
                else
                    System.out.println(say2/say1);

                break;

        }
    }
}
