public class Main {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Ankaralı Namık","MATEMATİK","555");
        Teacher t2=new Teacher("Albert Einstein","FİZİK","555");
        Teacher t3=new Teacher("Heisenberg","KİMYA","555");

        Course mat= new Course("MATEMATİK","MAT101","MAT");
        Course fizik=new Course("FİZİK","FZK101","FZK");
        Course kimya=new Course("KİMYA","KMY101","KMY");

        mat.addTeacher(t2);
    }
}