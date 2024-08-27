package August27th;

public class CategoryClass {
    //	17.	Create a class Categorys having member variables id, categoryName, thumbnails. create getters and setters for all member variables. Create
    //		object of Categorys class in other class inside main method and set all member values and print all member values using getters.
    int id;
    String categoryName;
    String thumbnails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(String thumbnails) {
        this.thumbnails = thumbnails;
    }
}
