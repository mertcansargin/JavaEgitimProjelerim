public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    public Course(String name, String code, String prefix) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }
    public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
        }
        else {
            System.out.println("Girilen dersler hoca ile uyuşmuyor...");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
