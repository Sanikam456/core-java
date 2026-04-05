class Mobile {

    public Mobile() {
        this("Samsung");
        System.out.println("Default Constructor Execution Finished");
    }

    public  Mobile(String brand) {
        this(brand, "Galaxy S23");
        System.out.println("Brand: " + brand);
    }

   public  Mobile(String brand, String model) {
        this(brand, model, "Android");
        System.out.println("Model: " + model);
    }

    public Mobile(String brand, String model, String os) {
        this(brand, model, os, 999.99);
        System.out.println("Operating System: " + os);
    }

   public Mobile(String brand, String model, String os, double price) {
        System.out.println("BASE CONSTRUCTOR REACHED");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Operating System: " + os);
        System.out.println("Price: " + price);
    }
}