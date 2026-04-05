class Fan {

    public Fan() {
        this("Usha");
        System.out.println("Default Constructor Finished");
    }

    public Fan(String brand) {
        this("Usha", 3);
        System.out.println("Brand Constructor Finished");
    }

    public Fan(String brand, int blades) {
        this(brand, blades, "White");
        System.out.println("Blades: " + blades);
    }

    public Fan(String brand, int blades, String color) {
        this(brand, blades, color, 2000);
        System.out.println("Color: " + color);
    }

    public Fan(String brand, int blades, String color, double price) {
        System.out.println("BASE CONSTRUCTOR");
		  System.out.println("Brand : " + brand);
		  System.out.println("Blades: " + blades);
		  System.out.println("Color: " + color);
		  System.out.println("Price: " + price);
        
    }
}