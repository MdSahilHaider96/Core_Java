package August27th;

public class CityClass {
    //8.	Create a class City having member variables id, city. create getters and setters for all member variables. Create object of City class in
    //		other class inside main method and set all member values and print all member values using getters.
    private int id;
    private String City;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCity(String City){
        return City;
    }
    public void setCity(String City){
        this.City=City;
    }
    public void display(){
        System.out.println(this.id);
        System.out.println(this.City);
    }
}
