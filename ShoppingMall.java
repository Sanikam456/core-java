class ShoppingMall {

    String mallName;
    String location;
    int numberOfShops;
    int numberOfStaff;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String mallType;

    static String country = "India";
    static String category = "Retail";

    public String openShop(String shopName) {
        System.out.println("Shop Opened: " + shopName);
        return shopName;
    }

    public int addShops(int count) {
        System.out.println("Total Shops: " + numberOfShops);
        return numberOfShops;
    }

    public int hireStaff(int count) {
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public boolean openMall(boolean status) {
        System.out.println("Mall Open: " + status);
        return status;
    }

    public boolean closeMall(boolean status) {
        System.out.println("Mall Closed: " + status);
        return status;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return dailyRevenue;
    }

    public String organizeEvent(String eventName) {
        System.out.println("Event Organized: " + eventName);
        return eventName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }

    public String upgradeMall(String upgradeType) {
        System.out.println("Mall Upgraded: " + upgradeType);
        return upgradeType;
    }
}