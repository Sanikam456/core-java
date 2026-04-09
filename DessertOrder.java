class DessertOrder {

    public double getPriceByDishName(String dishName) {
        System.out.println("invoking getPriceByDishName: " + dishName);
        double price = 0.0;

        if ("Ice Cream"==dishName) {
            price = 100;
        } 
        else if ("Chocolate Cake"==dishName) {
            price = 250;
        } 
        else if ("Gulab Jamun"==dishName){
            price = 120;
        } 
        else if ("Rasgulla"==dishName) {
            price = 110;
        } 
        else if ("Brownie"==dishName) {
            price = 180;
        } 
        else if ("Fruit Salad"==dishName) {
            price = 150;
        } 
        else if ("Kulfi"==dishName) {
            price = 130;
        } 
        else if ("Donut"==dishName) {
            price = 140;
        } 
        else if ("Pudding"==dishName) {
            price = 160;
        } 
        else if ("Cheesecake"==dishName) {
            price = 300;
        } 
        else {
            price = 0.0;
        }

        System.out.println("end of getPriceByDishName");
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
        double finalAmount = total - (total * 0.10); 
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}