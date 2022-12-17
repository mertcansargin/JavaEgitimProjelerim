import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rea=new Scanner(System.in);
        int s1,s2,s3;
    System.out.println("Bir Sayi Giriniz: ");
    s1 = rea.nextInt();
    System.out.println("İkinci Sayiyi Giriniz: ");
    s2 = rea.nextInt();
    System.out.println("Ücüncü Sayiyi Giriniz: ");
    s3 = rea.nextInt();

    if (s1 < s2 && s1 < s3) {
        if (s2 < s3) System.out.println("Siralama: " + s1 + ", " + s2 + ", " + s3);
        else System.out.println("Siralama: " + s1 + ", " + s3 + ", " + s2);
    } else if (s2 < s1 && s2 < s3) {
        if (s1 < s3) System.out.println("Siralama: " + s2 + ", " + s1 + ", " + s3);
        else System.out.println("Siralama: " + s2 + ", " + s3 + ", " + s1);
    } else if (s3 < s1 && s3 < s2) {
        if (s1 < s2) System.out.println("Siralama: " + s3 + ", " + s1 + ", " + s2);
        else System.out.println("Siralama: " + s3 + ", " + s3 + ", " + s2);
    }
    
    }
}