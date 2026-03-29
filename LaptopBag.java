class LaptopBag {

    static void store() {
        System.out.println("Laptop Bag Collection Store");
    }

    static void buyer(String name) {
        System.out.println("Customer selected bag: " + name);
    }

    static double getPrice() {
        double cost = 750.50;
        return cost;
    }

    static double amount(double price) {
        double gst = 100.25;
        return price + gst;
    }
}