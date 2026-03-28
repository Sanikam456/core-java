class BajajFanRunner {
    public static void main(String[] fan) {
        System.out.println("-----First Time Method call-----");
        boolean fanStatus = BajajFan.onOrOff();
        System.out.println("Main method Fan status:" + fanStatus);
        System.out.println("-----second Time Method call-----");
        BajajFan.onOrOff();
        System.out.println("-----third Time Method call-----");
        BajajFan.onOrOff();
        System.out.println("-----fourth Time Method call-----");
        BajajFan.onOrOff();
        System.out.println("-----fifth Time Method call-----");
        BajajFan.onOrOff();
    }
}
