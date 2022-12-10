import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner rea=new Scanner(System.in);
        int sayi;
        int MaksYakin=Integer.MAX_VALUE;
        int MinYakin=Integer.MIN_VALUE;

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.println("Bir sayı giriniz: ");
        sayi=rea.nextInt();
        System.out.print("Bu dizi= "+ Arrays.toString(list));
        System.out.println();

        for(int i : list){
            if(i < sayi){
                if(i > MinYakin){
                    MinYakin =i;
                }
            }else if(i > sayi){
                if(i < MaksYakin){
                    MaksYakin = i;
                }
            }
        }

        System.out.println("Girilen sayıya yakın dizideki en büyük sayı:"+MaksYakin);
        System.out.println("Girilen sayıya yakın dizideki en küçük sayı:"+MinYakin);

    }
}