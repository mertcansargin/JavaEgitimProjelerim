import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {
        int r,a=10; //a ölçümüzü 10 aldık dilim hesaplama için
        double cevre,alan,pi=3.14,dilimalan;
        Scanner inp=new Scanner(System.in);

        System.out.println("Lütfen üçgenin yarıçapını giriniz: ");
        r=inp.nextInt();

        alan=pi*r*r;
        cevre=2*pi*r;
        dilimalan=(pi*(r*r)*a)/360;

        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Dairenin dilim alanı"+dilimalan);

    }
}
