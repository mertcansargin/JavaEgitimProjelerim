import java.util.Scanner;

public class Bookinfo {

    public static void main(String[] args) {
        Scanner rea=new Scanner(System.in);

        Process book=new Process("Satranc","Stefan Zweig",120,1934);
        System.out.println(book.getName());
        System.out.println(book.getActor());

        System.out.print("Kitap adını giriniz:\t");
        book.setName(rea.nextLine());
        System.out.print("Kitap yazarını giriniz:\t");
        book.setActor(rea.nextLine());
        System.out.print("Kitap sayfa sayısını giriniz:\t");
        book.setPagesize(rea.nextInt());
        System.out.print("Kitap yılını giriniz:\t");
        book.setYear(rea.nextInt());

        System.out.println("Adı: "+book.getName()+"\nYazar: "+book.getActor()
                +"\nSayfa Sayisi: "+book.getPagesize()+"\nBasim Yili: "+book.getYear());


    }
}
