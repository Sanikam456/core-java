class Products {
    int productId;
    String productName;
    double price;
    String category;
    float rating;

    // Constructor
    public Products(int productId,String productName,double price,String category,float rating)
	{
        System.out.println("I am the Product constructor with parameter:"+productId+","+productName+","+price+","+category+","+rating);
    }
    public void getProductsData() {
        System.out.println("--- Product Data ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
        
    }
}