package August24th;

public class ClassStudent{
    int roll;
    String Name;
    String Standard;
    void print(){
        System.out.println("roll : "+ roll);
        System.out.println("Name : "+ Name);
        System.out.println("Standard "+ Standard);
    }

    public static void main(String[] args) {
        ClassStudent classStudent= new ClassStudent();
        classStudent.print();
        classStudent.Name="Sahil";
        classStudent.roll=7;
        classStudent.Standard="XIII";
        classStudent.print();
    }
}
