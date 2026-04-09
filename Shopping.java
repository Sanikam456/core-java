class Shopping
{
	public double getPriceByProductName(String productName)
	{
		System.out.println("invoking getPriceByProductName: " + productName);
		double price = 0.0;

		if("Shirt"==productName)
		{
			price = 999;
		}
		else if("Jeans"==productName)
		{
			price = 1499.50;
		}
		else if("Shoes"==productName)
		{
			price = 1999.99;
		}
		else if("Watch"==productName)
		{
			price = 2500;
		}
		else if("Bag"==productName)
		{
			price = 1200;
		}
		else if("T-Shirt"==productName)
		{
			price = 499;
		}
		else if("Jacket"==productName)
		{
			price = 2999;
		}
		else if("Cap"==productName)
		{
			price = 299;
		}
		else if("Sunglasses"==productName)
		{
			price = 899;
		}
		else if("Wallet"==productName)
		{
			price = 699;
		}
		else
		{
			price = 0.0;
		}

		System.out.println("end of getPriceByProductName");
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

		double finalAmount = total - (total * 0.15); 

		System.out.println("end of getDiscount");
		return finalAmount;
	}
}