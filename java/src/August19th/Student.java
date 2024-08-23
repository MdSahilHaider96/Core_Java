package August19th;

public class Student {
    int RollNo;
    String Name;
    String City;
    public Student(int RollNo , String Name,String City){
        this.RollNo=RollNo;
        this.Name=Name;
        this.City=City;
    }

    @Override
    public String toString() {
        return "Student{" + "RollNo=" + RollNo + ", Name='" + Name + '\'' + ", City='" + City + '\'' + '}';
    }

    public static void main(String[] args) {
        Student obj = new Student(1,"Sahil","Kolkata");
        Student obj2 = new Student(10,"HAIDER","Kolkata");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
