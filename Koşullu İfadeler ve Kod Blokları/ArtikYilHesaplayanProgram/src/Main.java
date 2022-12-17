import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner rea=new Scanner(System.in);

    System.out.print("Yıl Giriniz: ");
    int yil = rea.nextInt();

    if (yil%100==0){
        if (yil%400==0)  System.out.println("Girilen yıl bir artık yıldır ");
        else System.out.println("Girilen yıl artık yıl değildir...");
    }
    else if (yil % 4 == 0)
        System.out.println("Girilen yıl bir artık yıldır ");
    else System.out.println("Girilen yıl artık yıl değildir...");

    }
}