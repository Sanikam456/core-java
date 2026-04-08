 class Hospital {

    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfPatients;
    String chiefDoctor;
    double consultationFee;
    String hospitalType;
    int establishedYear;
    static String country = "India";
    static String serviceType = "Healthcare";

    public String admitPatient(String patientName) {
        System.out.println("Patient Admitted: " + patientName);
        return patientName;
    }

    public int addDoctors(int count) {
        numberOfDoctors += count;
        System.out.println("Total Doctors: " + numberOfDoctors);
        return numberOfDoctors;
    }

    public String assignDoctor(String doctorName) {
        System.out.println("Doctor Assigned: " + doctorName);
        return doctorName;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean openEmergency(boolean status) {
        System.out.println("Emergency Available: " + status);
        return status;
    }

    public boolean conductCheckup(boolean status) {
        System.out.println("Checkup Done: " + status);
        return status;
    }

    public String announceHoliday(String holiday) {
        System.out.println("Holiday Announced: " + holiday);
        return holiday;
    }

    public int dischargePatients(int count) {
        numberOfPatients -= count;
        System.out.println("Remaining Patients: " + numberOfPatients);
        return numberOfPatients;
    }

    public String organizeCamp(String campName) {
        System.out.println("Health Camp: " + campName);
        return campName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }
}