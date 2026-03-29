class Smartphones {
    String brand;
    String modelName;
    String operatingSystem;
    int ramGB;
    double screenSize;
    double price;
    public Smartphones(String brand,String modelName,String operatingSystem,int ramGB, double screenSize,double price) {
        System.out.println("I am the Smartphone constructor with parametar:"+brand+","+modelName+","+operatingSystem+","+ramGB+","+screenSize+","+price);
    }
    public void getSmartphonesData() {
        System.out.println("--- Smartphone Specifications ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("OS: " + operatingSystem);
        System.out.println("RAM: " + ramGB );
        System.out.println("Display: " + screenSize );
        System.out.println("Price: $" + price);
    }
}