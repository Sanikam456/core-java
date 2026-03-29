class SmartWatch_Runner {

    public static void main(String[] args) {

        SmartWatch.shop();

        SmartWatch.customer("Divya");

        double price = SmartWatch.getPrice();
        System.out.println("Smart Watch Price: " + price);

        double total = SmartWatch.amount(price);
        System.out.println("Final Bill: " + total);
    }
}