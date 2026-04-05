class Zomato {
    Zomato() {
        this("Chicken Biryani");
        System.out.println("I am Zomato Constructor 1");
    }

    Zomato(String foodName) {
        this(foodName, "Imperial Restaurant");
        System.out.println("I am Zomato Constructor 2");
        System.out.println("Food Name: " + foodName);
    }

    Zomato(String foodName, String restaurantName) {
        this(foodName, restaurantName, 350.0);
        System.out.println("I am Zomato Constructor 3");
        System.out.println("Restaurant Name: " + restaurantName);
    }

    Zomato(String foodName, String restaurantName, double foodPrice) {
        this(foodName, restaurantName, foodPrice, 4.8f);
        System.out.println("I am Zomato Constructor 4");
        System.out.println("Price: " + foodPrice);
    }

    Zomato(String foodName, String restaurantName, double foodPrice, float foodRatings) {
        System.out.println("I am Zomato Constructor 5");
        System.out.println("Final Details: " + foodName + " from " + restaurantName);
        System.out.println("Ratings: " + foodRatings);
    }
	}