 class Camera {

    static void storeName() {
        System.out.println("Welcome to Camera World");
    }

    static void customer(String name) {
        System.out.println("Customer buying camera: " + name);
    }

    static int getPrice() {
        int basePrice = 5000;
        int tax = 500;
        return basePrice + tax;
    }

    static int amount(int price) {
        int serviceCharge = 200;
        return price + serviceCharge;
    }
}