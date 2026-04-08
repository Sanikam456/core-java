class CinemaHall {

    String hallName;
    String location;
    int numberOfScreens;
    int seatingCapacity;
    int numberOfStaff;
    String managerName;
    double ticketRevenue;
    int establishedYear;
    String hallType;

    static String country = "India";
    static String category = "Entertainment";

    public String bookTicket(String movieName) {
        System.out.println("Ticket booked for: " + movieName);
        return movieName;
    }

    public int addScreens(int count) {
        System.out.println("Total Screens: " + numberOfScreens);
        return numberOfScreens;
    }

    public int hireStaff(int count) {
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public boolean openHall(boolean status) {
        System.out.println("Cinema Hall Open: " + status);
        return status;
    }

    public boolean closeHall(boolean status) {
        System.out.println("Cinema Hall Closed: " + status);
        return status;
    }

    public double collectRevenue(double amount) {
        System.out.println("Revenue Collected: " + amount);
        return ticketRevenue;
    }

    public String cancelShow(String movieName) {
        System.out.println("Show Cancelled: " + movieName);
        return movieName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }

    public String upgradeHall(String upgradeType) {
        System.out.println("Cinema Hall Upgraded: " + upgradeType);
        return upgradeType;
    }
}