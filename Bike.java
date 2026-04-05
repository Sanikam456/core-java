class Bike {

    public  Bike() {
        this("Yamaha");
        System.out.println("Default Constructor Execution Finished");
    }

    public Bike(String brand) {
        this("Yamaha", "R1");
        System.out.println("Default Constructor Execution Finished");
    }

    public Bike(String brand, String model) {
        this(brand, model, "Petrol");
        System.out.println("Model: " + model);
    }

    public Bike(String brand, String model, String fuelType) {
        this(brand, model, fuelType, 15000.00);
        System.out.println("Fuel Type: " + fuelType);
    }

    public Bike(String brand, String model, String fuelType, double price) {
        System.out.println("BASE CONSTRUCTOR REACHED");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: " + price);
    }
}