package LLDPractice.model;

public class Rating {


    public long userId;
    public double value;
    public String comment;
    public String restaurantName; /* changing it to String */

    public Rating(long userId, double value, String comment, String restaurantName) {
        this.value = value;
        this.userId = userId;
        this.comment = comment;
        this.restaurantName = restaurantName;
    }

}
