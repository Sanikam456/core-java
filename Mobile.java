class Mobile {
    static String shopName = "Mandya Mobile World";
    String brand;
    String model;
    int ramGB;
    int battery;
    double price;

   public Mobile(){
   }
    public Mobile(String brand, String model, int ramGB, int battery, double price) {
        this.brand = brand;
        this.model = model;
        this.ramGB = ramGB;
        this.battery = battery;
        this.price = price;
    }

    public void displayMobileDetails() {
        System.out.println("Shop Name:"+shopName);
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("RamGB:"+ramGB);
        System.out.println("Battery:"+battery);
        System.out.println("Price:"+price);
    }
}