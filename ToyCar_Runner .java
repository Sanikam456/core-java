class ToyCar_Runner {

    public static void main(String[] args) {

        ToyCar.shopName();

        ToyCar.customer("Ravi");

        int price = ToyCar.getPrice();
        System.out.println("Toy Car Price: " + price);

        int total = ToyCar.amount(price);
        System.out.println("Total Amount: " + total);
    }
}