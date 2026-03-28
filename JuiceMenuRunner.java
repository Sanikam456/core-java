class JuiceMenuRunner {
    public static void main(String[] food) {
        JuiceMenu malnadJuice = new JuiceMenu();
        malnadJuice.getJuiceMenuDetails();

        JuiceMenu freshJuiceCenter = new JuiceMenu();
        freshJuiceCenter.checkJuiceByName("Apple Juice");
        freshJuiceCenter.checkJuiceByName("Mango Juice");
        freshJuiceCenter.checkJuiceByName("Cucumber Juice");
        freshJuiceCenter.checkJuiceByName("Pineapple Juice");
        freshJuiceCenter.checkJuiceByName("Tomato Juice");
        freshJuiceCenter.checkJuiceByName("Kiwi Juice");
    }
}