class Car {
  
   public Car() {
        this("Toyota");
        System.out.println(" Default Constructor Execution Finished");
    }

   public Car(String brand) {           
        this(brand, "Camry");
        System.out.println("Brand:"+ brand);
    }

   public Car(String brand, String model) {
        this(brand, model, "Hybrid");
        System.out.println(" Model:"+ model);
    }

    public Car(String brand, String model, String fuelType) {
        this(brand, model, fuelType, 35000.00);
        System.out.println(" Fuel Type :"+ fuelType);
    }
	
    public Car(String brand, String model, String fuelType, double price) {
        System.out.println("BASE CONSTRUCTOR REACHED");
        System.out.println("Brand:"+ brand);
		System.out.println(" Model:"+ model);
		System.out.println(" Fuel Type :"+ fuelType);
		System.out.println(" Price :"+ price);
    }
}