class ScooterRentalCompany {

    String companyName;
    String headquarters;
    int numberOfScooters;
    int numberOfRiders;
    int numberOfStaff;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String companyType;

    static String country = "India";
    static String category = "Transport";

    public String assignScooter(String scooterId, String riderName) {
        System.out.println("Scooter Assigned: " + scooterId + " to " + riderName);
        return scooterId;
    }

    public int addScooters(int count) {
        System.out.println("Total Scooters: " + numberOfScooters);
        return numberOfScooters;
    }

    public int hireRiders(int count) {
        System.out.println("Total Riders: " + numberOfRiders);
        return numberOfRiders;
    }

    public int hireStaff(int count) {
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

    public boolean maintainScooters(boolean status) {
        System.out.println("Scooters Maintained: " + status);
        return status;
    }

    public String upgradeCompany(String upgradeType) {
        System.out.println("Company Upgraded: " + upgradeType);
        return upgradeType;
    }
}