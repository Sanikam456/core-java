 class ComputerLab {

    String labName;
    String location;
    int numberOfComputers;
    int numberOfStudents;
    String inCharge;
    double maintenanceCost;
    int establishedYear;
    String labType;
    static String institution = "Tech Institute";
    static String category = "Education";

    public String startSession(String sessionName) {
        System.out.println("Session Started: " + sessionName);
        return sessionName;
    }

    public int addComputers(int count) {
        numberOfComputers += count;
        System.out.println("Total Computers: " + numberOfComputers);
        return numberOfComputers;
    }

    public int admitStudents(int count) {
        numberOfStudents += count;
        System.out.println("Total Students: " + numberOfStudents);
        return numberOfStudents;
    }

    public String assignInstructor(String instructorName) {
        System.out.println("Instructor Assigned: " + instructorName);
        return instructorName;
    }

    public boolean startInternet(boolean status) {
        System.out.println("Internet Enabled: " + status);
        return status;
    }

    public boolean runSoftware(boolean status) {
        System.out.println("Software Running: " + status);
        return status;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public String organizeWorkshop(String workshopName) {
        System.out.println("Workshop Organized: " + workshopName);
        return workshopName;
    }

    public boolean maintainEquipment(boolean status) {
        System.out.println("Equipment Maintained: " + status);
        return status;
    }

    public String upgradeLab(String upgradeType) {
        System.out.println("Lab Upgraded: " + upgradeType);
        return upgradeType;
    }
}