class MovieTheatre {

    String theatreName;
    String location;
    int numberOfScreens;
    int seatingCapacity;
    int numberOfStaff;
    String managerName;
    double ticketPrice;
    int establishedYear;
    String theatreType;

    static String country = "India";
    static String category = "Entertainment";

    public String bookTicket(String movieName) {
        System.out.println("Ticket booked for: " + movieName);
        return movieName;
    }

    public int addScreens(int count) {
        numberOfScreens += count;
        System.out.println("Total Screens: " + numberOfScreens);
        return numberOfScreens;
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

    public boolean openTheatre(boolean status) {
        System.out.println("Theatre Open: " + status);
        return status;
    }

    public boolean closeTheatre(boolean status) {
        System.out.println("Theatre Closed: " + status);
        return status;
    }

    public double collectTicketFare(double amount) {
        System.out.println("Ticket Fare Collected: " + amount);
        return amount;
    }

    public String cancelShow(String movieName) {
        System.out.println("Show Cancelled: " + movieName);
        return movieName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }

    public String upgradeTheatre(String upgradeType) {
        System.out.println("Theatre Upgraded: " + upgradeType);
        return upgradeType;
    }
}