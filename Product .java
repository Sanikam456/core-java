class Product {
    String productName;
    String brand;
    float price;          
    float userRating;    
    long stockQuantity;   

    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
		System.out.println("User Rating:"+userRating);
		System.out.println("Stock Quantity:"+stockQuantity);
    }
}
