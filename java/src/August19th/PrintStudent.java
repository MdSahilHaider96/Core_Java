package August19th;

 class PrintStudent {
    int RollNo;
    String Name;
    String City;
   public PrintStudent(int RollNo , String Name,String City){
        this.RollNo=RollNo;
        this.Name=Name;
        this.City=City;
    }
   public String toString(){
        return RollNo+" "+Name+" "+City;
   }
    public static void main(String[] args) {
        PrintStudent obj = new PrintStudent(1,"Sahil","Kolkata");
        PrintStudent obj2 = new PrintStudent(10,"HAIDER","Kolkata");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
