class Camera {
    static String shopName = "Mandya Digital Studio";
    String brand;
    String model;
    String sensor;
    int megapixels;
    double price;

    public Camera(){
	}
    public Camera(String brand, String model, String sensor, int megapixels, double price) {
        this.brand = brand;
        this.model = model;
        this.sensor = sensor;
        this.megapixels = megapixels;
        this.price = price;
    }

    public void displayCameraDetails() {
        System.out.println("Shop Name:"+shopName);
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Sensor:"+sensor);
        System.out.println("Megapixels:" + megapixels);
        System.out.println("Price:"+price);
    }
}