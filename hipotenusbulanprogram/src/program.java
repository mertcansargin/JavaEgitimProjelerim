import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        int ycevre,a,b,c;
        double alan;
        Scanner oku= new Scanner(System.in);

        System.out.println("1. Kenarı giriniz: ");
        a=oku.nextInt();
        System.out.println("2. Kenarı giriniz: ");
        b=oku.nextInt();
        System.out.println("3. Kenarı giriniz: ");
        c=oku.nextInt();

        ycevre=(a+b+c)/2;
        alan=Math.sqrt((ycevre*(ycevre-a)*(ycevre-b)*(ycevre-c)));
        System.out.println("Alan: "+alan);



    }
}
