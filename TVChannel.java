class TVChannel {

    String channelName;
    String headquarters;
    int numberOfShows;
    int numberOfStaff;
    String managerName;
    double dailyRevenue;
    int establishedYear;
    String channelType;

    static String country = "India";
    static String category = "Media";

    public String airShow(String showName) {
        System.out.println("Show Aired: " + showName);
        return showName;
    }

    public int addShows(int count) {
        System.out.println("Total Shows: " + numberOfShows);
        return numberOfShows;
    }

    public int hireStaff(int count) {
        System.out.println("Total Staff: " + numberOfStaff);
        return numberOfStaff;
    }

    public String assignManager(String manager) {
        System.out.println("Manager Assigned: " + manager);
        return manager;
    }

    public boolean broadcastChannel(boolean status) {
        System.out.println("Channel Broadcasting: " + status);
        return status;
    }

    public boolean stopBroadcast(boolean status) {
        System.out.println("Channel Stopped Broadcasting: " + status);
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

    public boolean maintainEquipment(boolean status) {
        System.out.println("Equipment Maintained: " + status);
        return status;
    }

    public String upgradeChannel(String upgradeType) {
        System.out.println("Channel Upgraded: " + upgradeType);
        return upgradeType;
    }
}