class VegOrder {

    public double getPriceByDishName(String dishName) {
        System.out.println("invoking getPriceByDishName: " + dishName);
        double price = 0.0;

        if ("Paneer Butter Masala" == dishName) 
		{
            price = 250;
        } 
		else if ("Veg Biryani" == dishName)
		{
            price = 200;
        } 
		else if ("Dal Tadka" == dishName) 
		{
            price = 150;
        }
		else if ("Mixed Veg Curry" == dishName) 
		{
            price = 180;
        }
		else if ("Chole" == dishName)
		{
            price = 160;
        } 
		else if ("Aloo Gobi" == dishName)
		{
            price = 140;
        }
		else if ("Veg Noodles" == dishName) 
		{
            price = 120;
        }
		else if ("Paneer Tikka" == dishName)
		{
            price = 220;
        } 
		else if ("Veg Sandwich" == dishName)
		{
            price = 100;
        }
		else if ("Idli Sambhar" == dishName) 
		{
            price = 80;
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
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}