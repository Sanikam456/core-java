class LaptopBag_Runner {

    public static void main(String[] args) {

        LaptopBag.store();

        LaptopBag.buyer("Sneha");

        double price = LaptopBag.getPrice();
        System.out.println("Bag Price: " + price);

        double bill = LaptopBag.amount(price);
        System.out.println("Final Amount: " + bill);
    }
}