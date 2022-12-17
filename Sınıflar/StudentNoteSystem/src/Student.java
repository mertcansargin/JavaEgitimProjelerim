public class Student {
    String stdname,stdNo,c1,c2,c3;
    int classes;
    double avarage;
    Course kimya,mat,fizik;
    boolean isPass;

    Student (String stdname,String stdNo,int classes,Course mat,Course fizik,Course kimya){
        this.stdname=stdname;
        this.stdNo=stdNo;
        this.classes=classes;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.isPass=false;
    }
        void addBulkExamNote(int mat,int fizik,int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        else System.out.println("0-100 arası bir not girilmelidir.");
    }
    public void printNote(){
        System.out.println("=================");
        System.out.println("Oğrenci: "+ this.stdname);
        System.out.println("Matematik notu: "+this.mat.note);
        System.out.println("Fizik notu: "+ this.fizik.note);
        System.out.println("Kimya notu: "+ this.kimya.note);
    }
    void isPass(){
        this.avarage=(this.mat.note+this.fizik.note+this.kimya.note)/3;
        System.out.println("=================");
        System.out.println("3 Ders Ortalaması: "+avarage);
        if (avarage>=0&&avarage<=50) System.out.println("Ortalamanız: "+avarage+" Sınıfta Riskiniz Bulunuyor.!");
    }

}
