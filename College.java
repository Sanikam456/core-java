class College {

    String collegeName;
    String location;
    int numberOfStudents;
    int numberOfDepartments;
    String principalName;
    double collegeFee;
    String universityAffiliation;
    int establishedYear;
    static String country = "India";
    static String educationType = "Higher Education";

    public String startCourse(String courseName) {
        System.out.println("Course Started: " + courseName);
        return courseName;
    }

    public int admitStudents(int count) {
        numberOfStudents += count;
        System.out.println("Total Students: " + numberOfStudents);
        return numberOfStudents;
    }

    public String assignProfessor(String professorName) {
        System.out.println("Professor Assigned: " + professorName);
        return professorName;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean openLibrary(boolean status) {
        System.out.println("Library Open: " + status);
        return status;
    }

    public boolean conductExam(boolean status) {
        System.out.println("Exam Conducted: " + status);
        return status;
    }

    public String announceHoliday(String holiday) {
        System.out.println("Holiday Announced: " + holiday);
        return holiday;
    }

    public int addDepartment(int count) {
        numberOfDepartments += count;
        System.out.println("Total Departments: " + numberOfDepartments);
        return numberOfDepartments;
    }

    public String organizeFest(String festName) {
        System.out.println("Fest Organized: " + festName);
        return festName;
    }

    public boolean maintainRules(boolean status) {
        System.out.println("Rules Maintained: " + status);
        return status;
    }
}