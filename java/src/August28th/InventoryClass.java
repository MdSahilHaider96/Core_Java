package August28th;

import java.util.Date;

public class InventoryClass {
    //36.	Create a class InventaoryItem with member variables UUID, int invItem, String title, double price, Date purchaseDate and memeber methods
    //		are getters,  and setters, override toString(), hashcode() and equals() methods.
    int UUID;
    int invItem;
    String title;
    double price;
    String date;

    public int getUUID() {
        return UUID;
    }

    public void setUUID(int UUID) {
        this.UUID = UUID;
    }

    public int getInvItem() {
        return invItem;
    }

    public void setInvItem(int invItem) {
        this.invItem = invItem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
