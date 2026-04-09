class DrinkOrder {

    public double getPriceByDrinkName(String drinkName) {
        System.out.println("invoking getPriceByDrinkName: " + drinkName);
        double price = 0.0;

        if ("Tea" == drinkName) {
            price = 20;
        } 
        else if ("Coffee" == drinkName) {
            price = 30;
        } 
        else if ("Cold Coffee" == drinkName) {
            price = 80;
        } 
        else if ("Juice" == drinkName) {
            price = 60;
        } 
        else if ("Milkshake" == drinkName) {
            price = 100;
        } 
        else if ("Lassi" == drinkName) {
            price = 70;
        } 
        else if ("Soft Drink" == drinkName) {
            price = 50;
        } 
        else if ("Green Tea" == drinkName) {
            price = 40;
        } 
        else if ("Lemon Soda" == drinkName) {
            price = 45;
        } 
        else if ("Mocktail" == drinkName) {
            price = 120;
        } 
        else {
            price = 0.0;
        }

        System.out.println("end of getPriceByDrinkName");
        return price;
    }

    public double getTotalAmount(double price, int quantity) {
        System.out.println("invoking getTotalAmount");
        double total = price * quantity;
        System.out.println("end of getTotalAmount");
        return total;
    }

    public double getDiscount(double total) {
        System.out.println("invoking getDiscount");
        double finalAmount = total - (total * 0.05);
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}