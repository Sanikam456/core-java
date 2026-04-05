class Animal {

    public Animal() {
        this("Dog");
        System.out.println("Default Constructor Finished");
    }

    public Animal(String species) {
        this(species, 4);
        System.out.println("Species Constructor Finished");
    }

    public Animal(String species, int legs) {
        this(species, legs, "Brown");
        System.out.println("Legs Constructor Finished");
    }

    public Animal(String species, int legs, String color) {
        this(species, legs, color, 5);
        System.out.println("Color Constructor Finished");
    }

    public Animal(String species, int legs, String color, int age) {
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Species: " + species);
        System.out.println("Legs: " + legs);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age + " years");
    }
}