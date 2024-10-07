package LLDPractice;

import LLDPractice.model.Food;
import LLDPractice.model.Order;
import LLDPractice.model.Rating;
import LLDPractice.model.Restaurant;


import java.util.*;

public class RestaurantService {
    private final static Map<String, Restaurant> restaurants = new LinkedHashMap<>();
    private final static Map<Long, Restaurant> userList = new LinkedHashMap<>();

    public void register(Restaurant restaurant) {

        /**
         * 1. check if the restaurant already exist, if it exists, then return the exception.(validations)
         * 2. otherwise add the restaurant.
         */

        if (restaurants.containsKey(restaurant.name)) {
            return; /** throw exception here */
        } else {
            restaurants.put(restaurant.name, restaurant);
            System.out.println("added the restrauant by name - " + restaurant.name);
        }
    }

    public Restaurant updateQuantity(String name, String itemName, int qty) {
        /**
         * 1. search for the restaurant with name, if found, add the itemName with quantity.
         * 2. if not fond, throw Exception.
         */
        if(restaurants.containsKey(name)) {
            Restaurant fetchedRestaurant = restaurants.get(name);
            List<Food> foodItem = fetchedRestaurant.foodItems;
            for(Food item : foodItem) {
                if (item.itemName.equals(itemName)) {
                    Food updatedFood = new Food(item.itemName, item.itemPrice, item.quantity + qty);
                    fetchedRestaurant.foodItems = Arrays.asList(updatedFood);
                    restaurants.put(name, fetchedRestaurant);
                }
            }
        }
        return null;
    }

    public List<Restaurant> showRestaurant(String field) {
        /**
         * 1. sortBy use for field = Rating(desc)/price(asc)..
         */
        return null;
    }

    public void addReview(String name, int Rating, String comments) {
        /**
         * 1. for creating/adding review, rest entry should already be present.
         *
         *
         */
        if(restaurants.containsKey(name)) {
            List<Rating> ratingList = new ArrayList<>();
            Rating rating2 = new Rating(887788, 4, "Good",name);
            Rating rating3 = new Rating(887233, 4, "Good",name);
            ratingList.add(rating2);
            ratingList.add(rating3);
            Restaurant fetchedRestaurant  = restaurants.get(name);
            fetchedRestaurant.ratings = ratingList;
        } else {
            /*
            throw exception here.
             */
        }

    }

    public String placeOrder(String name, int qty, String newItem) {
        /**
         * 1. find in that restaurant list if its present. then add the quantity
         * 2. throw the exception, if name is not in the list.
         * 3. check for nonzero quantity of a item.
         */

        if(restaurants.containsKey(name)) {
            if(qty > 0) {
                Restaurant fetchedRest = restaurants.get(name);
                List<Food> fetchedItem = fetchedRest.foodItems;
                for(Food itr : fetchedItem) {
                    if(itr.itemName.equals(newItem)) {
                        Food obj = new Food(itr.itemName, itr.itemPrice, itr.quantity + qty);
                        fetchedRest.foodItems.add(obj);
                        restaurants.put(name, fetchedRest);
                    }
                }
            }
        } /* Need to revisit. */

        return "";
    }

    public Order orderHistory(int mobileNo) {
        /**
         * 1. based on id/mobileNo return orderHistory for each User.
         *
         */
        return null;
    }

}
