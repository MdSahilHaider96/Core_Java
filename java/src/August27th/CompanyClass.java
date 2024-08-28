package August27th;

public class CompanyClass {
    //1.	Create a class Company having member variables companyId, name, description. create getters and setters for all member variables.
    // Create object of Company class in other class inside main method and set all member values and print all member values using getters.
    private int CompanyId;
    private String Name;
    private String Description;

    public int getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(int companyId) {
        CompanyId = companyId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
    public void display(){
        System.out.println(this.Name);
        System.out.println(this.CompanyId);
        System.out.println(this.Description);
    }
}
