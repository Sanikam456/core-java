class MobilePhones {
    String brand;
    String modelName;
    double cameraMegapixels;
    int storageGB;
    double price;

    public MobilePhones(String brand,String modelName,double cameraMegapixels,int storageGB,double price) {
        System.out.println("I am the MobilePhone constructor with parameter:"+brand+","+modelName+","+cameraMegapixels+","+storageGB+","+price);
    }

    public void getMobilePhonesData() {
        System.out.println("--- Mobile Phone Specs ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Camera: " + cameraMegapixels + " MP");
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("Price: $" + price);
    }
}