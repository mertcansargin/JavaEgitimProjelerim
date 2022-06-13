import java.util.Scanner;

public class taksikmhesap {
    public static void main(String[] args) {
        int km,min=20;
        double toplam=10;

        Scanner inp=new Scanner(System.in);


        System.out.println("Gidilen mesafeyi km olarak giriniz: ");
        km=inp.nextInt();
        if(toplam<=min)
        {
            System.out.println("Ödenecek Tutar: "+min+" TL'dir");
        }
        else {
            toplam+=(km*2.20);
            System.out.println("Taksi Tutarınız: "+toplam+ " TL'dir");
        }




    }
}
