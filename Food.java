package LLDPractice.model;

public class Food {

    Food(){}
    public String itemName;
    public long itemPrice;
    public int quantity;


    public Food(String itemName, long itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

}
