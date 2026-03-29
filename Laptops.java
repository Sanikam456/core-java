class Laptops {
    
    String brand;
    String modelName;
    String processor;
    int ramGB;
    double screenSize;
    double price;
  

    public Laptops(String brand,String modelName,String processor,int ramGB,double screenSize,double price) {
        System.out.println("I am the Laptop constructor with parameter:"+brand+","+modelName+","+processor+","+ramGB+","+screenSize+","+price);
    }

    public void getLaptopsData() {
        System.out.println("--- Laptop Specifications ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB );
        System.out.println("Screen Size: " + screenSize );
        System.out.println("Price: $" + price);
        
    }
}