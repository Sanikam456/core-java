 class Restaurant {

    String restaurantName;
    String location;
    int numberOfTables;
    int numberOfStaff;
    String managerName;
    double averageBill;
    int establishedYear;
    String cuisineType;
    static String country = "India";
    static String category = "Hospitality";

    public String takeOrder(String customerName) {
        System.out.println("Order taken for: " + customerName);
        return customerName;
    }

    public int addTables(int count) {
        numberOfTables += count;
        System.out.println("Total Tables: " + numberOfTables);
        return numberOfTables;
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

    public boolean openRestaurant(boolean status) {
        System.out.println("Restaurant Open: " + status);
        return status;
    }

    public boolean closeRestaurant(boolean status) {
        System.out.println("Restaurant Closed: " + status);
        return status;
    }

    public double collectBill(double amount) {
        System.out.println("Bill Collected: " + amount);
        return amount;
    }

    public String organizeEvent(String eventName) {
        System.out.println("Event Organized: " + eventName);
        return eventName;
    }

    public boolean maintainHygiene(boolean status) {
        System.out.println("Hygiene Maintained: " + status);
        return status;
    }

    public String upgradeRestaurant(String upgradeType) {
        System.out.println("Restaurant Upgraded: " + upgradeType);
        return upgradeType;
    }
}