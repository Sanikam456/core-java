class IceCream_Runner {

    public static void main(String[] args) {

        IceCream.shop();

        IceCream.customer("Kavya");

        float price = IceCream.getPrice();
        System.out.println("Ice Cream Price: " + price);

        float total = IceCream.amount(price);
        System.out.println("Total Bill: " + total);
    }
}