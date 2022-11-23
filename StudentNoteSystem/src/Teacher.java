public class Teacher {
    String name;
    String branch;
    String mpno;
    public Teacher(String name,String branch,String mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }
    void print(){
        System.out.println("Ad : "+this.name);
        System.out.println("Branch : "+this.branch);
        System.out.println("Mpno : "+this.mpno);
    }
}
