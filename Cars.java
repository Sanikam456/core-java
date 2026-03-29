class Cars {
    String brand;
    String model;
    int year;
    String color;
    double price;
    public Cars(String brand,String model,int year,String color,double price) {
        System.out.println("I am the Car constructor with parametar:"+brand+","+model+","+year+","+color+","+price);
    }
    public void getCarsData() {
        System.out.println("--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        
    }
}