class PizzaOrder
{
	public double getPriceByPizzaName(String pizzaName)
	{
		System.out.println("invoking getPriceByPizzaName: " + pizzaName);
		double price = 0.0;

		if("Margherita"==pizzaName)
		{
			price = 250;
		}
		else if("Farmhouse"==pizzaName)
		{
			price = 350;
		}
		else if("Peppy Paneer"==pizzaName)
		{
			price = 400;
		}
		else if("Veggie Paradise"==pizzaName)
		{
			price = 380;
		}
		else if("Chicken Dominator"==pizzaName)
		{
			price = 450;
		}
		else if("Pepper Barbecue"==pizzaName)
		{
			price = 420;
		}
		else if("Mexican Green Wave"==pizzaName)
		{
			price = 390;
		}
		else if("Deluxe Veggie"==pizzaName)
		{
			price = 360;
		}
		else if("Cheese n Corn"==pizzaName)
		{
			price = 300;
		}
		else if("Paneer Makhani"==pizzaName)
		{
			price = 410;
		}
		else
		{
			price = 0.0;
		}

		System.out.println("end of getPriceByPizzaName");
		return price;
	}

	public double getTotalAmount(double price, int quantity)
	{
		System.out.println("invoking getTotalAmount");

		double total = price * quantity;

		System.out.println("end of getTotalAmount");
		return total;
	}

	public double getDiscount(double total)
	{
		System.out.println("invoking getDiscount");

		double finalAmount = total - (total * 0.10); // 10% discount

		System.out.println("end of getDiscount");
		return finalAmount;
	}
}