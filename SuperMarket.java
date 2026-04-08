class SuperMarket {

    String marketName;
    String location;
    int numberOfProducts;
    int numberOfStaff;
    String managerName;
    double dailySales;
    int establishedYear;
    String category;

    static String country = "India";
    static String type = "Retail";

    public String sellProduct(String productName) {
        System.out.println("Product Sold: " + productName);
        return productName;
    }

    public int addProducts(int count) {
        numberOfProducts += count;
        System.out.println("Total Products: " + numberOfProducts);
        return numberOfProducts;
    }

    public int hireStaff(int count) {
        numberOfStaff += count;
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public boolean openMarket(boolean status) {
        System.out.println("SuperMarket Open: " + status);
        return status;
    }

    public boolean closeMarket(boolean status) {
        System.out.println("SuperMarket Closed: " + status);
        return status;
    }

    public double processPayment(double amount) {
        System.out.println("Payment Processed: " + amount);
        return amount;
    }

    public String restockProduct(String productName) {
        System.out.println("Product Restocked: " + productName);
        return productName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }

    public String applyDiscount(String offer) {
        System.out.println("Discount Applied: " + offer);
        return offer;
    }
}