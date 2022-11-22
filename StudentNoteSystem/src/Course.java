public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    public Course(String name, String code, String prefix,Teacher courseTeacher) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.courseTeacher=courseTeacher;
    }
    public void addTeacher(Teacher t){

    }
}
