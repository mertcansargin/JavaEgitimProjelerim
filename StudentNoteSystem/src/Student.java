public class Student {
    String stdname,stdNo,course1,course2,course3;
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
    }

}
