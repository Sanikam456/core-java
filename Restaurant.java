class Restaurant {

    public Restaurant() {
        this("Foodies");
        System.out.println("Default Constructor Finished");
    }

    public Restaurant(String name) {
        this(name, "Downtown");
        System.out.println("Name Constructor Finished");
    }

    public Restaurant(String name, String location) {
        this(name, location, 50);
        System.out.println("Location Constructor Finished");
    }

    public Restaurant(String name, String location, int seats) {
        this(name, location, seats, true);
        System.out.println("Seats Constructor Finished");
    }

    public Restaurant(String name, String location, int seats, boolean deliveryAvailable) {
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Seats: " + seats);
        System.out.println("Delivery Available: " + deliveryAvailable);
    }

    
}