class Airport {

    String airportName;
    String location;
    int numberOfFlights;
    int numberOfStaff;
    String managerName;
    int numberOfTerminals;
    double revenue;
    int establishedYear;
    String airportType;

    static String country = "India";
    static String category = "Transportation";

    public String scheduleFlight(String flightName) {
        System.out.println("Flight Scheduled: " + flightName);
        return flightName;
    }

    public int addFlights(int count) {
        numberOfFlights += count;
        System.out.println("Total Flights: " + numberOfFlights);
        return numberOfFlights;
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

    public boolean openAirport(boolean status) {
        System.out.println("Airport Open: " + status);
        return status;
    }

    public boolean closeAirport(boolean status) {
        System.out.println("Airport Closed: " + status);
        return status;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return revenue;
    }

    public String cancelFlight(String flightName) {
        System.out.println("Flight Cancelled: " + flightName);
        return flightName;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }

    public String upgradeAirport(String upgradeType) {
        System.out.println("Airport Upgraded: " + upgradeType);
        return upgradeType;
    }
}