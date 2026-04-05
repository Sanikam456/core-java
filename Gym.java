class Gym {

    public Gym() {
        this("FitLife");
        System.out.println("Default Constructor Finished");
    }

    public Gym(String name) {
        this(name, 50);
        System.out.println("Name Constructor Finished");
    }

    public Gym(String name, int trainers) {
        this(name, trainers, "Indoor");
        System.out.println("Trainers Constructor Finished");
    }

    public Gym(String name, int trainers, String type) {
        this(name, trainers, type, 200);
        System.out.println("Type Constructor Finished");
    }

    public Gym(String name, int trainers, String type, int members) {
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Gym Name: " + name);
        System.out.println("Number of Trainers: " + trainers);
        System.out.println("Gym Type: " + type);
        System.out.println("Number of Members: " + members);
    }
	public static void main(String[] args) {
        Gym myGym = new Gym();
    }
}