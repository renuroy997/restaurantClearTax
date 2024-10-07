package LLDPractice;

import LLDPractice.model.Food;
import LLDPractice.model.Rating;
import LLDPractice.model.Restaurant;
import LLDPractice.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.registerUser("Reena", "F", 887788, "HSR", "12");
        userService.registerUser("Rutu", "F", 887234, "BTM", "23");
        userService.registerUser("dizzy", "F", 887233, "BTM", "2");
        userService.registerUser("gummy", "M", 887753, "AECS","10");

        List<User> userList = userService.getUserList(); // will return all the active users.
        userService.SetloginUser(887788); // login user is Reena.
        System.out.println("Active User details - " + userService.getLoggedInUserDetails());

        // Register the restaurant..
        RestaurantService restaurantService = new RestaurantService();

        Restaurant restaurant1 = new Restaurant();

        /**
         * Restaurant 1..
         */

        // Added ratings to restaurant1.
        List<Rating> ratingList = new ArrayList<>();
        Rating rating = new Rating(887788, 4, "Good","Food Court-1");
        ratingList.add(rating);

        // Added FoodItems to restaurant1.
        Food foodList1 = new Food("Pizza", 240, 2);
        Food foodList2 = new Food("Biryani", 500, 10);
        List<Food> foodItemList = new ArrayList<>();
        foodItemList.add(foodList1);
        foodItemList.add(foodList2);

        restaurant1.name = "Food Court-1";
        restaurant1.pinCodes = new ArrayList<>(Arrays.asList("12", "23"));
        restaurant1.ratings = ratingList;
        restaurant1.foodItems = foodItemList;


        /**
         * Restaurant 2..
         */

        Restaurant restaurant2 = new Restaurant();
        // Added ratings to restaurant1.
        List<Rating> ratingList2 = new ArrayList<>();
        Rating rating2 = new Rating(887788, 4, "Good","Food Court-1");
        ratingList.add(rating2);

        // Added FoodItems to restaurant1.
        foodList1 = new Food("Pasta", 240, 2);
        foodList2 = new Food("PaneerRoti", 500, 10);
        List<Food> foodItemList2 = new ArrayList<>();
        foodItemList2.add(foodList1);
        foodItemList2.add(foodList2);

        restaurant2.name = "Food Court-2";
        restaurant2.pinCodes = new ArrayList<>(Arrays.asList("2", "38"));
        restaurant2.ratings = ratingList2;
        restaurant2.foodItems = foodItemList2;

        restaurantService.register(restaurant1); // registering restaurant1.
        restaurantService.register(restaurant2); // registering restaurant2.







    }
}
