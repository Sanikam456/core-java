class ToyCar {

    static void shopName() {
        System.out.println("Welcome to Toy Car Store");
    }

    static void customer(String name) {
        System.out.println("Customer buying toy car: " + name);
    }

    static int getPrice() {
        int base = 200;
        int tax = 30;
        return base + tax;
    }

    static int amount(int price) {
        int packing = 20;
        return price + packing;
    }
}