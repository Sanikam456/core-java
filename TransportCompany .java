class TransportCompany {

    String companyName;
    String headquarters;
    int numberOfVehicles;
    int numberOfDrivers;
    int numberOfStaff;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String companyType;

    static String country = "India";
    static String category = "Logistics";

    public String assignDelivery(String packageId, String driverName) {
        System.out.println("Delivery Assigned: " + packageId + " to " + driverName);
        return packageId;
    }

    public int addVehicles(int count) {
        System.out.println("Total Vehicles: " + numberOfVehicles);
        return numberOfVehicles;
    }

    public int hireDrivers(int count) {
        numberOfDrivers += count;
        System.out.println("Total Drivers: " + numberOfDrivers);
        return numberOfDrivers;
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

    public boolean startOperations(boolean status) {
        System.out.println("Operations Started: " + status);
        return status;
    }

    public boolean stopOperations(boolean status) {
        System.out.println("Operations Stopped: " + status);
        return status;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return dailyRevenue;
    }

    public boolean maintainVehicles(boolean status) {
        System.out.println("Vehicles Maintained: " + status);
        return status;
    }

    public String upgradeCompany(String upgradeType) {
        System.out.println("Company Upgraded: " + upgradeType);
        return upgradeType;
    }
}