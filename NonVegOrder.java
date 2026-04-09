class NonVegOrder {

    public double getPriceByDishName(String dishName) {
        System.out.println("invoking getPriceByDishName: " + dishName);
        double price = 0.0;

        if ("Chicken Curry" == dishName) 
		{
            price = 250;
        } 
		else if ("Mutton Curry" == dishName) 
		{
            price = 350;
        }
		else if ("Fish Fry" == dishName)
		{
            price = 200;
        }
		else if ("Prawn Masala" == dishName)
		{
            price = 400;
        }
		else if ("Chicken Biryani" == dishName)
		{
            price = 300;
        }
		else if ("Mutton Biryani" == dishName) 
		{
            price = 450;
        }
		else if ("Egg Curry" == dishName) 
		{
            price = 150;
        } 
		else if ("Tandoori Chicken" == dishName)
		{
            price = 350;
        }
		else if ("Grilled Fish" == dishName)
		{
            price = 300;
        } 
		else if ("Chicken Kebab" == dishName)
		{
            price = 200;
        } 
		else
		{
            price = 0.0;
        }

        System.out.println("end of getPriceByDishName");
        return price;
    }

    public double getTotalAmount(double price, int quantity) {
        System.out.println("invoking getTotalAmount");
        double total = price * quantity;
        System.out.println("end of getTotalAmount");
        return total;
    }

    public double getDiscount(double total) {
        System.out.println("invoking getDiscount");
        double finalAmount = total - (total * 0.07); // 7% discount for non-veg
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}