class Television {
    public Television() {
        this("Sony");
        System.out.println("Default Constructor Finished");
    }
    public Television(String brand) {
        this(brand, 42);
        System.out.println("Brand Constructor Finished");
    }
    public Television(String brand, int size) {
        this(brand, size, "LED");
        System.out.println("Size: " + size);
    }
    public Television(String brand, int size, String type) {
        this(brand, size, type, 40000);
        System.out.println("Type: " + type);
    }
    public Television(String brand, int size, String type, double price) {
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}