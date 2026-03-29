class ProductsRunner {
    public static void main(String[] args) {
        Products ref = new Products(101,"Dell Laptop",1100.50,"Electronics",5.8f);
        ref.productId = 101;
        ref.productName = "Gaming Laptop";
        ref.price = 1200.50;
        ref.category = "Electronics";
        ref.rating = 4.8f;
        ref.getProductsData();
    }
}