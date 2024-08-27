package August27th;

public class CountriesClass {
    //Ceate a class Countries having member variables code, name, continentName. create getters and setters for all member variables. Create
    //		object of Countries class in other class inside main method and set all member values and print all member values using getters.
    int code;
    String name;
    String continentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
}
