import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class burcbul {
    public static void main(String[] args) {
        int gun;
        String ay;

        Scanner rea=new Scanner(System.in);
        System.out.println("Hangi Ayda Doğduğunuzu Yazınız: ");
        ay=rea.nextLine();
        System.out.println("Ayın kaçında dogdunuz?: ");
        gun=rea.nextInt();
        System.out.println(gun);
        System.out.println(ay);

        if(ay.equals("Nisan")||ay.equals("nisan")){
            if (gun>=1&&gun<=21) System.out.println("Burcunuz Koç");
            else if (gun>=22&&gun<=31) System.out.println("Burcunuz Boğa");
        }
        else if (ay.equals("Mayıs")||ay.equals("mayıs")){
            if (gun>=1&&gun<=22) System.out.println("Burcunuz Boğa");
            else if (gun>=23&&gun<=31) System.out.println("Burcunuz İkizler");
        }
        else if (ay.equals("Haziran")||ay.equals("haziran")){
            if (gun>=1&&gun<=22) System.out.println("Burcunuz İkizler");
            else if (gun>=23&&gun<=30) System.out.println("Burcunuz Yengeç");
        }
        else if(ay.equals("temmuz")||ay.equals("Temmuz")){
            if(gun>=1&&gun<=23) System.out.println("Burcunuz Yengeç");
            else if(gun>=24&&gun<=31) System.out.println("Burcunuz Aslan");
        }
        else if(ay.equals("Ağustos")||ay.equals("ağustos")){
            if(gun>=1&&gun<=22) System.out.println("Burcunuz Aslan");
            else if(gun>=23&&gun<=31) System.out.println("Burcunuz Başak");
        }
        else if(ay.equals("Eylül")||ay.equals("eylül")){
            if(gun>=1&&gun<=22) System.out.println("Burcunuz Başak");
            else if(gun>=23&&gun<=30) System.out.println("Burcunuz Terazi");
        }
        else if(ay.equals("Ekim")||ay.equals("ekim")){
            if(gun>=1&&gun<=23) System.out.println("Burcunuz Terazi");
            else if(gun>=24&&gun<=31) System.out.println("Burcunuz Akrep");
        }
        else if(ay.equals("kasım")||ay.equals("Kasım")){
            if(gun>=1&&gun<=23) System.out.println("Burcunuz Akrep");
            else if(gun>=24&&gun<=30) System.out.println("Burcunuz Yay");
        }
        else if(ay.equals("aralık")||ay.equals("Aralık")){
            if(gun>=1&&gun<=21) System.out.println("Burcunuz Yay");
            else if(gun>=22&&gun<=31) System.out.println("Burcunuz Oğlak");
        }
        else if(ay.equals("ocak")||ay.equals("Ocak")){
            if(gun>=1&&gun<=21) System.out.println("Burcunuz Oğlak");
            else if(gun>=22&&gun<=31) System.out.println("Burcunuz Kova");
        }
        else if(ay.equals("Şubat")||ay.equals("şubat")){
            if(gun>=1&&gun<=19) System.out.println("Burcunuz Kova");
            else if(gun>=20&&gun<=28) System.out.println("Burcunuz Balık");
        }
        else if(ay.equals("mart")||ay.equals("Mart")){
            if(gun>=1&&gun<=20) System.out.println("Burcunuz Balık");
            else if(gun>=21&&gun<=31) System.out.println("Burcunuz Koç");
        }
        else System.out.println("Lütfen Girilen değerlere Dikkat ediniz...");





    }
}
