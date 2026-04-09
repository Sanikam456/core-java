class FoodOrder {

    public double getPriceByFoodName(String foodName) {
        System.out.println("invoking getPriceByFoodName: " + foodName);
        double price = 0.0;

        if ("Burger" == foodName)
		{
            price = 150;
        } 
		else if ("Pizza" == foodName)
		{
            price = 400;
        } 
		else if ("Sandwich" == foodName)
		{
            price = 120;
        } 
		else if ("Pasta" == foodName)
		{
            price = 250;
        }
		else if ("French Fries" == foodName)
		{
            price = 80;
        } 
		else if ("Salad" == foodName)
		{
            price = 100;
        }
		else if ("Samosa" == foodName) 
		{
            price = 50;
        }
		else if ("Noodles" == foodName)
		{
            price = 200;
        }
		else if ("Dosa" == foodName) 
		{
            price = 90;
        } 
		else if ("Ice Cream" == foodName)
		{
            price = 120;
        } 
		else 
		{
            price = 0.0;
        }

        System.out.println("end of getPriceByFoodName");
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
        double finalAmount = total - (total * 0.05); // 5% discount for food
        System.out.println("end of getDiscount");
        return finalAmount;
    }
}