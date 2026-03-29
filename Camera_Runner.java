 class Camera_Runner {

    public static void main(String[] args) {

        Camera.storeName();

        Camera.customer("Rohit");

        int price = Camera.getPrice();
        System.out.println("Camera Price: " + price);

        int total = Camera.amount(price);
        System.out.println("Total Amount: " + total);
    }
}