class IceCream {

    static void shop() {
        System.out.println("Welcome to Ice Cream Corner");
    }

    static void customer(String name) {
        System.out.println("Customer ordered ice cream: " + name);
    }

    static float getPrice() {
        float cost = 85.50f;
        return cost;
    }

    static float amount(float price) {
        float extra = 10.50f;
        return price + extra;
    }
}