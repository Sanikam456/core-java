class SmartWatch {

    static void shop() {
        System.out.println("Smart Watch Showroom");
    }

    static void customer(String name) {
        System.out.println("Customer selected smart watch: " + name);
    }

    static double getPrice() {
        double cost = 1999.50;
        return cost;
    }

    static double amount(double price) {
        double delivery = 100.50;
        return price + delivery;
    }
}