class VegMenuRunner {
    public static void main(String[] food) {
        VegMenu udupihotel = new VegMenu();
        udupihotel.getVegMenuDetails(); // Corrected method name assumption

        VegMenu apoorvahotel = new VegMenu();
        apoorvahotel.checkFoodByFoodName("Rava Dosa");
        apoorvahotel.checkFoodByFoodName("Lemon Rice");
        apoorvahotel.checkFoodByFoodName("Masala Dosa");
        apoorvahotel.checkFoodByFoodName("Paneer Butter Masala"); // Added semicolon and closing quote
        apoorvahotel.checkFoodByFoodName("Vegetable Korma"); // Added semicolon and closing quote

        // Assuming checkFoodPriceByFoodName is a method within the VegMenu class
        double price = apoorvahotel.checkFoodPriceByFoodName("Vegetable Korma");
		 System.out.println("The price is: " + price);
		 
		 double price1 = apoorvahotel.checkFoodPriceByFoodName("Vegetabl Biryani");
		 System.out.println("The price is: " + price1);
		 
		 double price2 = apoorvahotel.checkFoodPriceByFoodName("Curd Rice");
		 System.out.println("The price is: " + price2);
		 
		 double price3 = apoorvahotel.checkFoodPriceByFoodName("Rava Dosa ");
		 System.out.println("The price is: " + price);
		 
		             
    }
}