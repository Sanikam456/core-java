class VegMenu {

    public void getVegMenuDetails() {
        System.out.println("Invoking getVegMenuDetails");
    }

    public void checkFoodByFoodName(String foodName) {
        System.out.println("Invoking checkFoodByFoodName");
        if (foodName.equals("Vegetable Biryani")) { 
            System.out.println("Available");
        } else if (foodName.equals("Veg Fried Rice")) {
            System.out.println("Available");
        } else if (foodName.equals("Palak Paneer")) {
            System.out.println("Available");
        } else if (foodName.equals("Veg Pulao")) {
            System.out.println("Available");
        } else if (foodName.equals("Paneer Butter Masala")) {
            System.out.println("Available")
        } else if (foodName.equals("Rava Dosa")) {
            System.out.println("Available");
        } else if (foodName.equals("Vegetable Korma")) {
            System.out.println("Available");
        } else if (foodName.equals("Vegetable Manchurian")) {
            System.out.println("Available");
        } else if (foodName.equals("Lemon Rice")) {
           System.out.println("Available")
        } else if (foodName.equals("Curd Rice")) {
            System.out.println("Available");
        } else if (foodName.equals("Mushroom Masala")) {
            System.out.println("Available");
        } else {
            System.out.println("Not Available");
        }
    }

    public double checkFoodPriceByFoodName(String foodName) {
        System.out.println("Invoking checkFoodPriceByFoodName and the food name is " + foodName);
        double foodPrice = 0.0;
        if (foodName.equals("Rava Dosa")) {
            foodPrice = 40.0;
        } else if (foodName.equals("Vegetable Biryani")) {
            foodPrice = 110.0; 
        } else if (foodName.equals("Mushroom Masala")) {
            foodPrice = 90.0; 
        } else if (foodName.equals("Rava Dosa")) {
            foodPrice = 45.0;
        } else if (foodName.equals("Masala Dosa")) {
            foodPrice = 60.0; 
        } else if (foodName.equals("Curd Rice")) {
            foodPrice = 30.0; 
        } else if (foodName.equals("Vegetable Korma")) {
            foodPrice = 85.0; 
        } else {
            System.out.println(foodName + " is Not Available");
        }
        return foodPrice;
    }
}