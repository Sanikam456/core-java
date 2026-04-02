class Loptop {
    static String storeName = "Tech Hub Electronics";
    String brand;
    String processor;
    int ramGB;
    double screenSize;
    long serialNumber;
    public Loptop() {
    }
    public Loptop(String brand, String processor, int ramGB, double screenSize, long serialNumber){
        this.brand = brand;
        this.processor = processor;
        this.ramGB = ramGB;
        this.screenSize = screenSize;
        this.serialNumber = serialNumber;
    }
    public void getLoptopDetails() {
        System.out.println("Store Name:"+ storeName);
        System.out.println("Brand:"+ brand);
        System.out.println("Processor:"+ processor);
        System.out.println("RamGB:"+ ramGB);
        System.out.println("Screen Size:"+ screenSize);
        System.out.println("Serial Number:"+ serialNumber);
    }
}