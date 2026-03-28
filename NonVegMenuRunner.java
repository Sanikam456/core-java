class NonVegMenuRunner {
    public static void main(String[] food) {
        NonVegMenu amaravathi = new NonVegMenu();
        amaravathi.getNonVegMenuDeatils();

        NonVegMenu ravihotel = new NonVegMenu();
        ravihotel.checkFoodByFoodName("Egg Curry");
        ravihotel.checkFoodByFoodName("Chicken Biryani");
        ravihotel.checkFoodByFoodName("beef corry");
        ravihotel.checkFoodByFoodName("Chicken Momos");
        ravihotel.checkFoodByFoodName("Last Knema");
    }
}