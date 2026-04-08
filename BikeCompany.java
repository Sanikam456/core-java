class BikeCompany {

    String companyName;
    String headquarters;
    int numberOfBikes;
    int numberOfRiders;
    int numberOfStaff;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String companyType;

    static String country = "India";
    static String category = "Transport";

    public String assignBike(String bikeId, String riderName) {
        System.out.println("Bike Assigned: " + bikeId + " to " + riderName);
        return bikeId;
    }

    public int addBikes(int count) {
        System.out.println("Total Bikes: " + numberOfBikes);
        return numberOfBikes;
    }

    public int hireRiders(int count) {
        numberOfRiders += count;
        System.out.println("Total Riders: " + numberOfRiders);
        return numberOfRiders;
    }

    public int hireStaff(int count) {
        numberOfStaff += count;
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + managerName);
        return managerName;
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

    public boolean maintainBikes(boolean status) {
        System.out.println("Bikes Maintained: " + status);
        return status;
    }

    public String upgradeCompany(String upgradeType) {
        System.out.println("Company Upgraded: " + upgradeType);
        return upgradeType;
    }
}