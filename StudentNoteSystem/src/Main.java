import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String stdName,stdNo;
        int m1,f1,k1,classes;

        Scanner rea=new Scanner(System.in);
        System.out.println("Ogrenci adini giriniz: ");
        stdName=rea.nextLine();
        System.out.println("Ogrenci numarası: ");
        stdNo=rea.nextLine();
        System.out.println("Sınıfınız: ");
        classes=rea.nextInt();
        System.out.println("Matematik notunuzu giriniz: ");
        m1=rea.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        f1=rea.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        k1=rea.nextInt();


        Teacher t1=new Teacher("Ankaralı Namık","MATEMATİK","555");
        //Teacher t1=new Teacher()
        Teacher t2=new Teacher("Albert Einstein","FİZİK","555");
        Teacher t3=new Teacher("Heisenberg","KİMYA","555");

        Course mat= new Course("MATEMATİK","MAT101","MAT");
        Course fizik=new Course("FİZİK","FZK101","FZK");
        Course kimya=new Course("KİMYA","KMY101","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student std=new Student(stdName,stdNo,classes,mat,kimya,fizik);
        std.addBulkExamNote(m1,f1,k1);
        std.printNote();
        std.isPass();
    }
}