class SnackOrder {

    public double getPriceBySnackName(String snackName) {
        System.out.println("invoking getPriceBySnackName: " + snackName);
        double price = 0.0;

        if ("Samosa" == snackName) {
            price = 30;
        } 
        else if ("French Fries" == snackName) {
            price = 120;
        } 
        else if ("Burger" == snackName) {
            price = 150;
        } 
        else if ("Pizza Slice" == snackName) {
            price = 200;
        } 
        else if ("Sandwich" == snackName) {
            price = 100;
        } 
        else if ("Pani Puri" == snackName) {
            price = 50;
        } 
        else if ("Bhel Puri" == snackName) {
            price = 60;
        } 
        else if ("Noodles" == snackName) {
            price = 140;
        } 
        else if ("Spring Roll" == snackName) {
            price = 130;
        } 
        else if ("Cutlet" == snackName) {
            price = 80;
        } 
        else {
            price = 0.0;
        }

        System.out.println("end of getPriceBySnackName");
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
        double finalAmount = total - (total * 0.08); 
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}