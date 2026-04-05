class Laptop {
    public Laptop() {
    this("HP"); // Default brand
    System.out.println("Default Constructor Execution Finished");
	}

    public  Laptop(String brand) {
        this("Dell", "XPS");
        System.out.println("Default Constructor Execution Finished");
    }

    public Laptop(String brand, String model) {
        this(brand, model, "Windows");
        System.out.println("Model: " + model);
    }

    public Laptop(String brand, String model, String os) {
        this(brand, model, os, 1500.00);
        System.out.println("OS: " + os);
    }

    public Laptop(String brand, String model, String os, double price) {
        System.out.println("BASE CONSTRUCTOR REACHED");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("OS: " + os);
        System.out.println("Price: " + price);
    }
}