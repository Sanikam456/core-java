class CarShowroom {

    String showroomName;
    String location;
    int numberOfCars;
    int numberOfStaff;
    String managerName;
    double totalSales;
    int establishedYear;
    String showroomType;

    static String country = "India";
    static String category = "Automobile";

    public String sellCar(String carModel) {
        System.out.println("Car Sold: " + carModel);
        return carModel;
    }

    public int addCars(int count) {
        numberOfCars += count;
        System.out.println("Total Cars: " + numberOfCars);
        return numberOfCars;
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

    public boolean openShowroom(boolean status) {
        System.out.println("Showroom Open: " + status);
        return status;
    }

    public boolean closeShowroom(boolean status) {
        System.out.println("Showroom Closed: " + status);
        return status;
    }

    public double processSale(double amount) {
        totalSales += amount;
        System.out.println("Sale Processed: " + amount);
        return totalSales;
    }

    public String serviceCar(String carModel) {
        System.out.println("Car Serviced: " + carModel);
        return carModel;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }

    public String upgradeShowroom(String upgradeType) {
        System.out.println("Showroom Upgraded: " + upgradeType);
        return upgradeType;
    }
}